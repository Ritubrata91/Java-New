package com.ritubrata.threads;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ExampleOfCallable implements Callable<Object>{ // <..> is suggested otherwise compile time warning

	@Override
	public Object call() throws Exception {
		final Random randObj = new Random();
		final Integer randNo = randObj.nextInt(10);
		Thread.sleep(randNo * 100);
		return randNo;
	}

	public static void main(final String argvs[]) throws Exception{
		@SuppressWarnings("rawtypes")
		final FutureTask[] randomNoTasks = new FutureTask[10];
		final Callable<Object> clble = new ExampleOfCallable();
		for (int j = 0; j < 10; j++){
			randomNoTasks[j] = new FutureTask<Object>(clble); // <..> is suggested otherwise compile time warning
			final Thread th = new Thread(randomNoTasks[j]);
			th.start();
			final Object o = randomNoTasks[j].get();
			System.out.println("The random number is: " + o);
		}
	}
}
