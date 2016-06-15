package com.vnath;

public class Book {
	private String bookTitle = null;
	private String bookAuthor = null;
	private String bookDept = null;

	public Book(String bookTitle, String bookAuthor, String bookDept) {
		super();
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookDept = bookDept;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookDept() {
		return bookDept;
	}

	public void setBookDept(String bookDept) {
		this.bookDept = bookDept;
	}

}
