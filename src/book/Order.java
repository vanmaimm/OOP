package book;

import java.util.Scanner;

public class Order extends Book {
	protected int idOrder;
	protected String customerName;
	protected String cusAddress;
	protected String cusPhone;
	protected int quanlity;
	static int numOrder = -1;

	public static Scanner ip = new Scanner(System.in);

	public Order() {
		super();
	}

	public Order(String nameBook, String author, String category, double price) {
		super(nameBook, author, category, price);
	}

	public Order(int idOrder, String nameBook, String author, String category, double price) {
		super(nameBook, author, category, price);
		this.idOrder = idOrder;
	}

	public Order(String nameBook, String author, String category, double price, String customerName, String cusAddress,
			String cusPhone, int quanlity) {
		super(nameBook, author, category, price);
		this.customerName = customerName;
		this.cusAddress = cusAddress;
		this.cusPhone = cusPhone;
	}

	public Order(int idOrder, String nameBook, String author, String category, double price, String customerName,
			String cusAddress, String cusPhone, int quanlity) {
		super(nameBook, author, category, price);
		this.idOrder = idOrder;
		this.customerName = customerName;
		this.cusAddress = cusAddress;
		this.cusPhone = cusPhone;

	}

	public int getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerName() {
		System.out.println("Enter custommer's name ");
		this.customerName = ip.nextLine();
	}

	public String getCusAddress() {
		return cusAddress;
	}

	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}

	public void setCusAddress() {
		System.out.println("Enter custommer's address ");
		this.cusAddress = ip.nextLine();
	}

	public String getCusPhone() {
		return cusPhone;
	}

	public void setCusPhone(String cusPhone) {
		this.cusPhone = cusPhone;
	}

	public void setCusPhone() {
		System.out.println("Enter custommer's phone ");
		this.cusPhone = ip.nextLine();
	}

	public int getQuanlity() {
		return quanlity;
	}

	public void setQuanlity() {
		System.out.println("Enter quantity ");
		this.quanlity = Integer.parseInt(ip.nextLine());
	}

	public void setQuanlity(int quantity) {
		this.quanlity = quantity;

	}

	public double total() {
		return this.getQuanlity() * this.getPrice();
	}

	public String toString() {
		return "Id" + getIdOrder() + "Custommer's name: " + this.customerName + "\nCustommer's Address: "
				+ this.cusAddress + "\nCustommer's phone: " + this.cusPhone + "\nBook's name: " + this.getNameBook()
				+ "\nPrice: " + this.getPrice() + "\nQuanlity: " + this.getQuanlity() + "\nTotal: " + this.total();
	}
}
