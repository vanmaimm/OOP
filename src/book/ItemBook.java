package book;

import java.util.Scanner;

public class ItemBook extends Book {

	protected static int quantity;
	public static Scanner ip = new Scanner(System.in);

	public ItemBook(String nameBook, double price) {
		this.nameBook = nameBook;
		this.price = price;
	}

	public ItemBook(int quantity) {
		ItemBook.quantity = quantity;
	}

	public static int getQuantity() {
		return quantity;
	}

	public static void setQuantity(int quantity) {
		ItemBook.quantity = quantity;
	}

	public static void setQuantity() {
		System.out.println("Enter quanlity");
		ItemBook.quantity = Integer.parseInt(ip.nextLine());
	}

	public String toString() {
		return "Name's Book: " + getNameBook() + "\tprice: " + getPrice() + "\tquanlity:" + getQuantity();
	}

}
