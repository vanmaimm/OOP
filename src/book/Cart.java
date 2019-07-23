package book;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart extends ItemBook {
	public static ArrayList<Cart> cart = new ArrayList<Cart>();

	public Cart(String nameBook, double price) {
		super(nameBook, price);
	}

	public static Scanner ip = new Scanner(System.in);

	public static void addBookToCart() {
		int a = -1;
		System.out.println("Enter name book ");
		String name = ip.nextLine();
		for (int i = 0; i < TestBook.listBook.size(); i++) {
			if (name.equals(TestBook.listBook.get(i).getNameBook())) {
				ItemBook.setQuantity();
				cart.add(new Cart(TestBook.listBook.get(i).getNameBook(), TestBook.listBook.get(i).getPrice()));
				System.out.println("SUCCESSFUL!");
				a = i;
				break;
			}
		}
		if (a == -1) {
			System.out.println("UNSUCCESSFUL!");
		}

	}

	public static void displayCart() {
		for (int i = 0; i < Cart.cart.size(); i++) {
			System.out.println(Cart.cart.get(i).toString());
		}
	}

	public static int findBookCart(String name) {
		int a = -1;
		for (int i = 0; i < Cart.cart.size(); i++) {
			if (name.equals(Cart.cart.get(i).getNameBook())) {
				a = i;
				break;
			}
		}
		return a;
	}

	public static void removeBookInCart() {
		System.out.println("Enter Book in cart you want remove");
		String name = ip.nextLine();
		if (Cart.findBookCart(name) != -1) {
			Cart.cart.remove(Cart.findBookCart(name));
		} else
			System.out.println("Book doesn't exist!");

	}

}
