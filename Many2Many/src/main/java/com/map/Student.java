package com.map;

import java.util.List;

public class Student {
	private int id;
	private String name;
	private List<String> books;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getBooks() {
		return books;
	}

	public void setBooks(List<String> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", books=" + books + "]";
	}
	
	
}
