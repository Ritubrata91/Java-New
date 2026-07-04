package com.ritubrata.java8;
public class Book {
	private String title;
	private String authorFName;
	private String authorLName;
	private int pages;
	private String category;

	public Book(final String title, final String authorFName, final String authorLName,
			final int pages, final String category) {
		this.title = title;
		this.authorFName = authorFName;
		this.authorLName = authorLName;
		this.pages = pages;
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public String getAuthorFName() {
		return authorFName;
	}

	public void setAuthorFName(final String authorFName) {
		this.authorFName = authorFName;
	}

	public String getAuthorLName() {
		return authorLName;
	}

	public void setAuthorLName(final String authorLName) {
		this.authorLName = authorLName;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(final int pages) {
		this.pages = pages;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(final String category) {
		this.category = category;
	}
	@Override
	public String toString()
	{
		return getTitle()+" Written By: "+getAuthorFName()+" " +getAuthorLName()+"\n";
	}
}
