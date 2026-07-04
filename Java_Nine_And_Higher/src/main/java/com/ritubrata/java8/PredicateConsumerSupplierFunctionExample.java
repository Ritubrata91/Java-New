package com.ritubrata.java8;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateConsumerSupplierFunctionExample {


	public static void main(final String[] args) {
		//using the test method of Predicate
		final Predicate<String> stringLen  = s -> s.length() < 10;
		System.out.println(stringLen.test("Apples") + " - Apples is less than 10");

		//Consumer example uses accept method
		final Consumer<String> consumerStr = s -> System.out.println(s.toLowerCase());
		consumerStr.accept("ABCDefghijklmnopQRSTuvWxyZ");

		//example of the Consumer functional interface
		final Consumer<String> hello = name -> System.out.println("Hello, " + name);
		for (final String name : Arrays.asList("Duke", "Mickey", "Minnie")) {
			hello.accept(name);
		}

		//example of a lambda made from an instance method
		final Consumer<String> print = System.out::println;
		print.accept("Coming to you directly from a lambda...");


		//Supplier example
		final Supplier<String> s  = ()-> "Java is fun";
		System.out.println("Supplier: " + s.get());

		//Function example
		Function<Integer, Double> half = a -> a / 2.0;
		System.out.println("Function : " + half.apply(10));


	}
}
