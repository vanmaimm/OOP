package book;

import java.util.Scanner;

public class Book {

	protected int idBook;
	protected String nameBook;
	protected String author;
	protected String category;
	protected double price;
	static int numberBooks = -1;

	Scanner input = new Scanner(System.in);

	public Book() {
		numberBooks++;
	}

	public Book(String nameBook, String author, String category, double price) {
		this.nameBook = nameBook;
		this.author = author;
		this.category = category;
		this.price = price;
		numberBooks++;
	}

	public Book(int idBook, String nameBook, String author, String category, double price) {
		this.idBook = idBook;
		this.nameBook = nameBook;
		this.author = author;
		this.category = category;
		this.price = price;
		numberBooks++;
	}

	public void setNameBook() {
		System.out.println("Enter Book's name: ");
		this.nameBook = input.nextLine();
	}

	public void setNameBook(String name) {
		this.nameBook = name;
	}

	public String getNameBook() {
		return this.nameBook;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setAuthor() {
		System.out.println("Enter Author's book:");
		this.author = input.nextLine();
	}

	public String getAuthor() {
		return this.author;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setCategory() {
		System.out.println("Enter category's book:");
		this.category = input.nextLine();
	}

	public String getCategory() {
		return this.category;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setPrice() {
		System.out.println("Enter price: ");
		this.price = Integer.parseInt(input.nextLine());
	}

	public double getPrice() {
		return this.price;
	}

	public static int getNumerBook() {
		return numberBooks;
	}

	public String toString() {
		return "IdBook: " + getIdBook() + ", Name's Book:" + getNameBook() + ", Author:" + getAuthor() + ", category:"
				+ getCategory() + ", price:" + getPrice();
	}

	public int getIdBook() {
		return idBook;
	}

	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}

}
