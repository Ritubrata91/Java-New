package com.ritubrata.threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemonstration {
    /**
     * An explicit mutual exclusion lock configured with an optional fairness policy.
     * When fairness is set to true, the lock favors granting access to the
     * longest-waiting thread.
     */
    private final ReentrantLock lock;

    /**
     * Condition variable bound to the lock instance to allow explicit
     * thread signaling and coordination.
     */
    private final Condition condition;

    /**
     * A simulated shared resource modified by multiple threads.
     */
    private int sharedCounter = 0;

    /**
     * Constructs a demonstration instance and initializes the ReentrantLock.
     *
     * @param fair if {@code true}, this lock uses a fair ordering policy;
     *             otherwise it uses an unfair (barging) policy.
     */
    public ReentrantLockDemonstration(boolean fair) {
        // Feature 1: Fairness policy selection via constructor
        this.lock = new ReentrantLock(fair);
        this.condition = this.lock.newCondition();
    }

    /**
     * Demonstrates Feature 2 & 3: Standard exclusive locking and Reentrancy.
     * A thread holding the lock can seamlessly enter another code block guarded
     * by the exact same lock without deadlocking itself.
     */
    public void demonstrateReentrancy() {
        lock.lock(); // First acquisition
        try {
            sharedCounter++;
            System.out.println(Thread.currentThread().getName()
                    + " acquired lock. Hold count: " + lock.getHoldCount());

            // Inner reentrant step
            performReentrantStep();

        } finally {
            lock.unlock(); // Must match every lock invocation
            System.out.println(Thread.currentThread().getName()
                    + " released lock. Hold count: " + lock.getHoldCount());
        }
    }

    /**
     * Internal method called by a thread that already holds the lock.
     */
    private void performReentrantStep() {
        lock.lock(); // Re-entering the lock (hold count increments)
        try {
            System.out.println(Thread.currentThread().getName()
                    + " re-entered lock. Hold count: " + lock.getHoldCount());
            sharedCounter++;
        } finally {
            lock.unlock(); // Decrements hold count
        }
    }

    /**
     * Demonstrates Feature 4: Non-blocking lock acquisition using {@code tryLock()}.
     * The thread immediately returns {@code false} if the lock is held by another
     * thread instead of moving into a blocked state.
     */
    public void demonstrateTryLock() {
        if (lock.tryLock()) {
            try {
                System.out.println(Thread.currentThread().getName()
                        + " successfully barged and grabbed the lock via tryLock().");
                sharedCounter++;
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(Thread.currentThread().getName()
                    + " found the lock busy and moved on without blocking.");
        }
    }

    /**
     * Demonstrates Feature 5: Timed lock acquisition.
     * The thread waits up to a specific duration for the lock before timing out.
     *
     * @param timeout the time to wait for the lock
     * @param unit the time unit of the timeout argument
     */
    public void demonstrateTimedTryLock(long timeout, TimeUnit unit) {
        try {
            if (lock.tryLock(timeout, unit)) {
                try {
                    System.out.println(Thread.currentThread().getName()
                            + " acquired lock within the timeout window.");
                    sharedCounter++;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println(Thread.currentThread().getName()
                        + " timed out waiting for the lock.");
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()
                    + " was interrupted while waiting for the timed lock.");
            Thread.currentThread().interrupt(); // Restore interrupted status
        }
    }

    /**
     * Demonstrates Feature 7: Inter-thread coordination using Condition variables.
     * Suspends the executing thread until the counter reaches a specific threshold.
     */
    public void awaitThreshold() {
        lock.lock();
        try {
            while (sharedCounter < 5) {
                System.out.println(Thread.currentThread().getName()
                        + " condition not met (Counter=" + sharedCounter + "). Awaiting...");
                condition.await(); // Releases lock temporarily and sleeps
            }
            System.out.println(Thread.currentThread().getName()
                    + " woke up! Condition met. Counter: " + sharedCounter);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()
                    + " interrupted while awaiting condition.");
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }

    /**
     * Modifies the resource and signals any threads suspended on the condition variable.
     */
    public void incrementAndSignal() {
        lock.lock();
        try {
            sharedCounter++;
            System.out.println(Thread.currentThread().getName()
                    + " incremented counter to: " + sharedCounter);

            if (sharedCounter >= 5) {
                System.out.println(Thread.currentThread().getName()
                        + " threshold reached. Signaling waiters...");
                condition.signalAll(); // Wakes up threads waiting on this condition
            }
        } finally {
            lock.unlock();
        }
    }

    /**
     * Returns the current value of the shared counter.
     *
     * @return the current integer value of the counter
     */
    public int getSharedCounter() {
        lock.lock();
        try {
            return this.sharedCounter;
        } finally {
            lock.unlock();
        }
    }

    /**
     * Execution entry point to orchestrate various concurrent scenarios.
     *
     * @param args runtime arguments (unused)
     * @throws InterruptedException if thread execution is abruptly broken
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Initializing ReentrantLock Demo ===");
        ReentrantLockDemonstration demo = new ReentrantLockDemonstration(true);

        // 1. Run Reentrancy Test
        Thread t1 = new Thread(demo::demonstrateReentrancy, "Thread-Reentrant");
        t1.start();
        t1.join();

        System.out.println("\n=== Testing Condition Variables ===");
        // 2. Run Condition Waiter and Signaler
        Thread waiter = new Thread(demo::awaitThreshold, "Thread-Waiter");
        waiter.start();

        // Let the waiter start and sleep
        Thread.sleep(500);

        Thread signaler = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                demo.incrementAndSignal();
                try { Thread.sleep(200); } catch (InterruptedException ignored) {}
            }
        }, "Thread-Signaler");

        signaler.start();
        waiter.join();
        signaler.join();

        System.out.println("\n=== Testing Timed and Non-blocking Locks ===");
        // 3. Keep lock busy to test tryLock timeouts
        Thread blocker = new Thread(() -> {
            demo.lock.lock();
            try {
                System.out.println("Blocker thread holding lock indefinitely...");
                Thread.sleep(2000);
            } catch (InterruptedException ignored) {
            } finally {
                demo.lock.unlock();
                System.out.println("Blocker thread released lock.");
            }
        });
        blocker.start();
        Thread.sleep(100); // Ensure blocker acquires lock first

        Thread tryLockThread = new Thread(demo::demonstrateTryLock, "Thread-TryLock");
        Thread timedLockThread = new Thread(() -> demo.demonstrateTimedTryLock(500, TimeUnit.MILLISECONDS), "Thread-TimedLock");

        tryLockThread.start();
        timedLockThread.start();

        tryLockThread.join();
        timedLockThread.join();
        blocker.join();

        System.out.println("\nDemo Finished. Final Counter Value: " + demo.getSharedCounter());
    }
}
