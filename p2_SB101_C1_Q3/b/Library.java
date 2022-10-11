package b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
	
	public static List<Book> bookList = new ArrayList<>();
	
	public void addBook(Book book)throws BookException{
		
		boolean found = false;
		for(Book b : bookList) {
			if(b.getAuthor().equals(book.getAuthor()) &&
			   b.getBookName().equals(book.getBookName()) &&
			   b.getIsbn() == book.getIsbn())
			   found = true;				
		}
		
		if(found) {
			throw new BookException("Book already exists!");
		}
		else {
			bookList.add(book);
		}		
	}
	
	public List<Book> viewAllBooks()throws BookException{
		
		if(bookList.size() == 0) {
			throw new BookException("Book List is empty!");
		}
		else {
			Collections.sort(bookList, (b1, b2) -> b1.getBookName().compareTo(b2.getBookName()));
			return bookList;
		}
	}

	public List<Book> viewBooksByAuthor(String author)throws BookException{
		
	    List<Book> author_bookList = new ArrayList<>();
		
		for(Book b : bookList) {
			if(b.getAuthor().equals(author)) author_bookList.add(b);
		}
		
		if(author_bookList.size() == 0) {
			throw new BookException("None of the book published by the author " + author);
		}
		else {
			return author_bookList;
		}		
	}
	
	public Book getBookByISBN(int isbn)throws BookException{
		
		for(Book b : bookList) {
			if(b.getIsbn() == isbn) return b;
		}		
		
		throw new BookException("No Books found with ISBN: " + isbn);			
	}
}
