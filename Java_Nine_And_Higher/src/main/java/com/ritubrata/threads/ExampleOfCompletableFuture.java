package com.ritubrata.threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.function.Supplier;

public class ExampleOfCompletableFuture implements Supplier<Integer> {
	private final int i;
	public ExampleOfCompletableFuture(final int i) {
		this.i = i;
	}

	@Override
	public Integer get() {
		try {
			Thread.sleep(1000);
		} catch (final InterruptedException e) {
			//Do nothing
		}
		return i*i;
	}

	public static void main(final String[] args) throws InterruptedException, ExecutionException {
		final ExecutorService exec = Executors.newCachedThreadPool();
		final CompletableFuture<Integer> f = CompletableFuture.supplyAsync(new ExampleOfCompletableFuture(11), exec);
		System.out.println("First task is done :" + f.isDone()); // False
		final CompletableFuture<Integer> f2 = f.thenApply(new PlusOne());
		System.out.println(f2.get()); // Waits until the "calculation" is done, then prints (11*11) +1
	}

	public static class PlusOne implements Function<Integer, Integer> {
		@Override
		public Integer apply(final Integer x) {
			return x + 1;
		}
	}

}


