package com.javathehat.classdesign6.equals;

public class EqualsExample {


	
	public static void main(String[] args){
		Book book1 = new Book("Funny book", "Me", 960, 2016);
		Book book2 = new Book("Funny book", "Me", 980, 2016);
		
		System.out.println(book1.equals(book2));
	}
}

class Book {
	String title;
	String author;
	int pages;
	int year;
	

	public Book(String title, String author, int pages, int year) {
		super();
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.year = year;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year;
		return result;
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
}
