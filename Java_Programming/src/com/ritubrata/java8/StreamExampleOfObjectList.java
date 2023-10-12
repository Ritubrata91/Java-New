package com.ritubrata.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class StreamExampleOfObjectList {


	public static void main(final String[] args) {
		//total pages in your book collection
		final Book book1 = new Book("Miss Peregrine's Home for Peculiar Children",
				"Ranson", "Riggs", 382, "Film");
		final Book book2 = new Book("Harry Potter and The Sorcerers Stone",
				"JK", "Rowling", 411, "Film");
		final Book book3 = new Book("The Cat in the Hat",
				"Dr", "Seuss", 45, "Comedy");

		final List<Book> bookList = Arrays.asList(book1, book2, book3);

		bookList.sort((b1,b2)->b1.getPages() - b2.getPages());
		System.out.println("use of sort. Books sorted by page number asc order : " );
		bookList.forEach(System.out::println);

		//use of summingInt
		final int total = bookList.stream()
				.collect(Collectors.summingInt(Book::getPages));
		System.out.println("use of summingInt . Total pages : "  +total);

		//use of count
		System.out.println(" use of count. Number of books having more than 30 pages : " +
				bookList.stream()
		.filter(book -> book.getPages()>30)
		.count());

		//use of findAny
		System.out.println("use of findAny : " + bookList.stream()
		.filter(e->e.getTitle().contains("The")).findAny().get());

		//use of groupBy
		final Map<String, List<Book>> map = bookList.stream()
				.collect(Collectors.groupingBy(Book::getCategory));
		map.forEach((category,bookListTemp)->System.out.println("Name: "+category+" ==>"+bookListTemp));


		//group books by category and find max pages for each category.
		bookList.stream()
		.collect(Collectors.toMap(
				Book::getCategory,
				b-> b,
				BinaryOperator.maxBy(Comparator.comparingInt(Book::getPages))))
		.forEach((category,book)->System.out.println("Category: "+category+" ==> Pages : " +book.getPages()));
	}




}
