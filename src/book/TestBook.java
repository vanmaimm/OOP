package book;

import java.util.ArrayList;
import java.util.Scanner;

public class TestBook {
	public static Scanner ip = new Scanner(System.in);
	public static ArrayList<Book> listBook = new ArrayList<Book>();

	public static void dataBook() {
		listBook.add(new Book(listBook.size(), "Tony buoi sang", "abc", "cuoc song", 123));
		listBook.add(new Book(listBook.size(), "Love", "tony", "romantic", 123));
	}

	public static void displayArrListBook() {
		for (int i = 0; i < listBook.size(); i++) {
			System.out.println(listBook.get(i).toString());
		}
	}

	public static void removeBook(ArrayList<Book> listBook, String name) {
		if (findBook(TestBook.listBook, name)) {

			TestBook.listBook.remove(findLocalBook(TestBook.listBook, name));
			System.out.println(">>>>>>>>>>SUCCESSFUL!<<<<<<<<<<<<<<<");

		} else
			System.out.println("The name's of book doesn't exist!\n");
	}

	public static Book addBook(ArrayList<Book> listBook) {
		Book addBooks = new Book();
		addBooks.setIdBook(Book.numberBooks);
		do {
			addBooks.setNameBook();
		} while (findBook(listBook, addBooks.getNameBook()));
		addBooks.setAuthor();
		addBooks.setCategory();
		addBooks.setPrice();
		return addBooks;
	}

	public static boolean findBook(ArrayList<Book> listBook, String name) {
		int i;
		boolean a = false;
		for (i = 0; i < listBook.size(); i++) {
			if (name.equals(listBook.get(i).nameBook)) {

				a = true;
				break;
			} else
				a = false;
		}
		return a;
	}

	public static int findLocalBook(ArrayList<Book> listBook, String name) {
		int i, count = 0;
		for (i = 0; i < listBook.size(); i++) {
			if (name.equals(listBook.get(i).nameBook)) {
				count = i;
				break;
			}
		}
		return count;
	}
}
