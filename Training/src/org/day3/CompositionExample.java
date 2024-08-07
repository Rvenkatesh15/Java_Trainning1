package org.day3;

class Book{
	private String title;
	private String author;
	private String isbn;
	public Book(String title, String author, String isbn) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void displayBookDetails() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(isbn);
		System.out.println("\n");
	}
	
	

	
}
class Library{
	Book[] books;
	int bookCapacity;
	public Library(int capacity) {
		books=new Book[capacity];
		bookCapacity=0;
	}
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
	public int getBookCapacity() {
		return bookCapacity;
	}
	public void setBookCapacity(int bookCapacity) {
		this.bookCapacity = bookCapacity;
	}
	
	public boolean addBook(Book book) {
		if(bookCapacity<books.length) {
			books[bookCapacity++]=book;
			return true;
			
		}else {
			System.out.println("Library is full");
			return false;
		}
		
	}
	public void displayLibraryBooks() {
		System.out.println("Library Books");
		for(int i=0;i<bookCapacity;i++) {
			System.out.println("Book "+(i+1)+":");
			books[i].displayBookDetails();
		}
		
	}
	
}

public class CompositionExample {
	public static void main(String[] args) {
		Library myLibrary=new Library(3);
		
		Book book1=new Book("The Catcher in the Rye","J>D.Salinger","544545454");
		Book book2=new Book("The Catcher","J>D.Salinger","52555");
		Book book3=new Book("The Catcher  Rye","J>D.Salinger","544545");
		Book book4=new Book("Catcher in the Rye","J>D.Salinger","9899879");
		
		myLibrary.addBook(book1);
		myLibrary.addBook(book2);
		myLibrary.addBook(book3);
		myLibrary.addBook(book4);
		
		myLibrary.displayLibraryBooks();
		
	}

}
