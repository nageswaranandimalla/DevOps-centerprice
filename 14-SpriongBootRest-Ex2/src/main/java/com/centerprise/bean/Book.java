package com.centerprise.bean;

public class Book {
	
	private Integer id;
	private String bookname;
	private Double price;
	
	public Book(Integer id, String bookname, Double price) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookname=" + bookname + ", price=" + price + "]";
	}
	
	
	

}
