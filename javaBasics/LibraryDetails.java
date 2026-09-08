package javaBasics;

public class LibraryDetails {
	static LibraryDetails L = new LibraryDetails();
	int bookId;
	String bookName;
	String authorName;
	int booksdistrubuted;
	int availableCopies;

	static String libraryName = "Bose Library";
	static String librarianName = "J.S.Prathap";

	void bookDetils() {

		System.out.println("----------BOOK DETAILS----------");
		System.out.println(" the book id is   :" + bookId);
		System.out.println("the book name  is   :" + bookName);
		System.out.println("the author  name   :" + authorName);

		System.out.println("the available copies of books :" + (availableCopies - booksdistrubuted));

	}

	static void libraryDetails() {
		System.out.println("----------LIBRARY DETAILS----------");
		System.out.println(" the library name is   :" + libraryName);
		System.out.println(" the librarian name is   :" + librarianName);

	}

	public static void main(String[] args) {
		LibraryDetails L1 = new LibraryDetails();
		libraryDetails();
		L1.bookId = 1234;
		L1.bookName = "peace of nature";
		L1.authorName = "Y.S.Devaraj";
		L1.booksdistrubuted = 2;
		L1.availableCopies = 24;

		L1.bookDetils();

		LibraryDetails L2 = new LibraryDetails();
		libraryDetails();
		L2.bookId = 14;
		L2.bookName = "Dreams In Life";
		L2.authorName = "Jagan";
		L2.booksdistrubuted = 3;
		L2.availableCopies = 5;
		L2.bookDetils();

	}
}
