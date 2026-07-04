package com.ritubrata.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {

	public static void main(final String[] args) {
		exampleOfAddGetIncreAndDecrement();

		exampleOfCompareAndSet();
	}

	private static void exampleOfCompareAndSet() {
		final AtomicInteger atomicInteger = new AtomicInteger(100);
		boolean isSuccess = atomicInteger.compareAndSet(100, 110); //current value 100
		System.out.println(isSuccess); // true
		isSuccess = atomicInteger.compareAndSet(100, 120); // current value 110
		System.out.println(isSuccess); // false
	}

	private static void exampleOfAddGetIncreAndDecrement() {
		final AtomicInteger atomicInteger = new AtomicInteger(100);

		System.out.println(atomicInteger.addAndGet(2)); // 102
		System.out.println(atomicInteger); // 102

		System.out.println(atomicInteger.getAndAdd(2)); // 102
		System.out.println(atomicInteger); // 104

		System.out.println(atomicInteger.incrementAndGet()); // 105
		System.out.println(atomicInteger); // 105

		System.out.println(atomicInteger.getAndIncrement()); // 105
		System.out.println(atomicInteger); // 106

		System.out.println(atomicInteger.decrementAndGet()); // 105
		System.out.println(atomicInteger); // 105

		System.out.println(atomicInteger.getAndDecrement()); // 105
		System.out.println(atomicInteger); // 104
	}
}


