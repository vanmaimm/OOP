package human;

import java.util.Scanner;

abstract public class Human {
	protected String name;
	protected int age;
	protected String gender;
	protected String phoneNumer;
	protected String email;
	protected String address;

	public Human() {
	}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Human(String name, int age, String gender, String phoneNumber, String email, String address) {
		this.name = name;
		this.gender = gender;
		this.phoneNumer = phoneNumber;
		this.email = email;
		this.address = address;

	}

	Scanner input = new Scanner(System.in);

	public abstract void setName();

	public String getName() {
		return this.name;
	}

	public void setAge() {
		System.out.println("Enter age:");
		this.age = Integer.parseInt(input.nextLine());
	}

	public int getAge() {
		return this.age;
	}

	public void setGender() {
		System.out.println("Enter gender:");
		this.gender = input.nextLine();
	}

	public String getGender() {
		return this.gender;
	}

	public void setPhoneNumer() {
		System.out.println("Enter phone number:");
		this.phoneNumer = input.nextLine();
	}

	public String getPhoneNumer() {
		return this.phoneNumer;
	}

	public void setEmail() {
		System.out.println("Enter email:");
		this.email = input.nextLine();

	}

	public String getEmail() {
		return this.email;
	}

	public void setAddress() {
		System.out.println("Enter address:");
		this.address = input.nextLine();
	}

	public String getAddress() {
		return this.address;
	}

	public String toString() {
		return " Name:" + getName() + ", Gender:" + getGender();
	}
}
