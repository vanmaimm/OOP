package book;

import java.util.ArrayList;
import java.util.Scanner;

public class TestOrder extends Order {
	public static ArrayList<Order> listOrder = new ArrayList<Order>();
	static Scanner ip = new Scanner(System.in);

	public static void addOrder(ArrayList<Book> listBook) {
		System.out.println("Enter book's name, you want order ");
		String name = ip.nextLine();
		if (TestBook.findBook(listBook, name)) {
			System.out.println(TestBook.listBook.get(TestBook.findLocalBook(listBook, name)).toString());
			listOrder.add(listOrder.size(), inforOder(listBook, name));
			try {
				System.out.println("\tBILL");
				System.out.println(listOrder.get(TestBook.findLocalBook(listBook, name)).toString());
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Error: " + e.getMessage());
			}
			System.out.println(">>>>>>>>>>>>SUCCESSFUL!<<<<<<<<<<<<<<<<");

		}
	}

	public static Order inforOder(ArrayList<Book> listBook, String name) {
		Order order = new Order();
		order.setCustomerName();
		order.setCusAddress();
		order.setCusPhone();
		order.setNameBook(name);
		order.setPrice(TestBook.listBook.get(TestBook.findLocalBook(listBook, name)).getPrice());
		order.setQuanlity();
		order.total();
		return order;
	}

	public static void addOdersCart() {
		System.out.println("Enter book's name, you want order ");
		String name = ip.nextLine();
		if (Cart.findBookCart(name) != -1) {
			listOrder.add(inforOderCart(Cart.cart, name));
			System.out.println("\tBILL");
			System.out.println(listOrder.get(TestBook.findLocalBook(TestBook.listBook, name)).toString());
		}

	}

	public static Order inforOderCart(ArrayList<Cart> cart, String name) {
		Order order = new Order();
		order.setIdOrder(TestOrder.listOrder.size());
		order.setCustomerName();
		order.setCusAddress();
		order.setCusPhone();
		order.setNameBook(name);
		order.setPrice(Cart.cart.get(Cart.findBookCart(name)).getPrice());
		order.setQuanlity(ItemBook.getQuantity());
		order.total();
		return order;
	}

	public static void removeOrder() {
		System.out.println("Enter id order you want remove ");
		int idOrder = Integer.parseInt(ip.nextLine());
		if (idOrder <= listOrder.size()) {
			listOrder.remove(idOrder);
		} else
			System.out.println("Id's wrong!");
	}

	public static void listOrders() {
		for (int i = 0; i < listOrder.size(); i++) {
			System.out.println("Id" + i + listOrder.get(i).toString());
		}
	}

}
