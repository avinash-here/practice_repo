package b;

import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Library l = new Library();
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.println("1. Add Book");
			System.out.println("2. Display all book details");
			System.out.println("3. Search Book by author");
			System.out.println("4. Search book by ISBN");
			System.out.println("5. Exit");
			System.out.println("Enter your choice:");
			
			String s = sc.next(); 
			sc.nextLine();
			
			if(s.equals("1")) {
				System.out.println("Enter the isbn no:");
				int isbn = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the book name:");
				String bookName = sc.nextLine();
				System.out.println("Enter the author name:");
				String authorName = sc.nextLine();
				
				try {
					l.addBook(new Book(isbn, bookName, authorName));
					System.out.println("Book added successfully!");
				}
				catch (BookException be) {
					System.out.println(be.getMessage());
				}				
			}
			else if(s.equals("2")) {
				
				try {
					List<Book> list = l.viewAllBooks();
					list.forEach(b -> System.out.println(b));
				}
				catch (BookException be) {
					System.out.println(be.getMessage());
				}
			}
			else if(s.equals("3")) {
				
				System.out.println("Enter the author name:");
				String author = sc.nextLine();
				try {
					List<Book> list = l.viewBooksByAuthor(author);
					list.forEach(b -> {
						System.out.println("ISBN No: " + b.getIsbn());
						System.out.println("Book Name: " + b.getBookName());
						System.out.println("Author Name: " + b.getAuthor());
					});
				}
				catch (BookException be) {
					System.out.println(be.getMessage());
				}
			}
			else if(s.equals("4")) {
				
				System.out.println("Enter the ISBN:");
				int isbn = sc.nextInt();
				try {
					Book book = l.getBookByISBN(isbn);
					System.out.println(book);
				}
				catch (BookException be) {
					System.out.println(be.getMessage());
				}
			}
			else if(s.equals("5")) {
				run = false;
				System.out.println("Thank You!!");	
			}
			else {
				System.out.println("Invalid Input");
			}
		}
		
	}

}
