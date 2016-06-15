package com.vnath;

import java.util.ArrayList;
import java.util.List;

public class Library {
	List<Book> books = new ArrayList<>();

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void addBook(Book book){
		books.add(book);
	}
	
	public int getNumberOfBooks(){
		return books.size();
	}

}
