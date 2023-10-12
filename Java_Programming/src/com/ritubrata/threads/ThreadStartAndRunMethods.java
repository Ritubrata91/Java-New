package com.ritubrata.threads;

/**
 * if we call start and run then print like 1 1 2 2 3 3 4 4.
 * if we call run and start then print like 1 2 3 4 1 2 3 4.
 * if we call two thread,s start then print like 1 1 2 2 3 3 4 4.
 * if we call two thread,s run then print like 1 2 3 4 1 2 3 4.
 * Implements Runnable does not have start method. so line 24 and 28 gives compile time error.
 * @author Ritubrata Chatterjee
 *
 */
public class ThreadStartAndRunMethods extends Thread{
	@Override
	public void run(){
		for(int i=1;i<5;i++){
			try{
				Thread.sleep(500);
			}catch(final InterruptedException e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(final String args[]){
		System.out.println("Same Thread Operation : ");
		operationOnSameThread();
		System.out.println("Different Thread Operation : ");
		operationOnDifferentThread();
	}
	private static void operationOnSameThread() {
		final ThreadStartAndRunMethods t1=new ThreadStartAndRunMethods();
		t1.start();
		t1.run();
		System.out.println("*****************");
		t1.run();
		try {
			t1.start(); //it will give IllegalThreadStateException as t1 is already started.
			System.out.println("Excpetion occurs ");
		}catch (final IllegalThreadStateException e) {
			System.out.println("Exception is : " + e.getMessage());
		}
	}

	private static void operationOnDifferentThread() {
		final ThreadStartAndRunMethods t1=new ThreadStartAndRunMethods();
		final ThreadStartAndRunMethods t2=new ThreadStartAndRunMethods();
		t1.start();
		t2.start();
		System.out.println("*****************");
		t1.run();
		t2.run();
	}
}
