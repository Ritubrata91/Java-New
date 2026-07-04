package com.ritubrata.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExampleOfFuture {
	private final ExecutorService executor
	= Executors.newSingleThreadExecutor();

	public Future<Integer> calculate(final Integer input) {
		return executor.submit(() -> {
			Thread.sleep(1000);
			return input * input;
		});
	}

	public static void main(final String[] args) throws Exception {
		final ExampleOfFuture exampleOfFuture = new ExampleOfFuture();
		final Future<Integer> future1 = exampleOfFuture.calculate(10);
		final Future<Integer> future2 = exampleOfFuture.calculate(100);
		while (!(future1.isDone() && future2.isDone())) {
			System.out.println(
					String.format(
							"future1 is %s and future2 is %s",
							future1.isDone() ? "done" : "not done",
									future2.isDone() ? "done" : "not done"
							)
					);
			Thread.sleep(300);
		}

		final Integer result1 = future1.get();
		final Integer result2 = future2.get();

		System.out.println(result1 + " and " + result2);

		exampleOfFuture.executor.shutdown();
	}
}
