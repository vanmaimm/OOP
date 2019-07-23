package human;

import java.util.ArrayList;
import java.util.Scanner;

public class TestUser {
	public static ArrayList<User> listUser = new ArrayList<User>();
	static Scanner input = new Scanner(System.in);

	public static void add() {
		listUser.add(new User("van.mai", "vanvan", "My Van", 12, "nu", "12234", "adsdf", "assdfs"));
	}

	public static int a = -1;

	public static void login() {
		boolean kt = false;

		do {
			System.out.println("Enter User name");
			String user = input.nextLine();
			System.out.println("Enter password");
			String password = input.nextLine();
			for (int i = 0; i < listUser.size(); i++) {
				if (user.equals(listUser.get(i).user) && password.equals(listUser.get(i).password)) {
					a = findLocalUserName(listUser, user);
					kt = true;
					System.out.println(" Login succesfull!");
					break;
				}
			}
			if (kt == false) {
				System.out.println("\nWrong username or password \n\tEnter again!");
			}
		} while (kt == false);
	}

	public static User addUser(ArrayList<User> listUser) {
		User addUsers = new User();
		do {
			addUsers.setName();
		} while (findNameOfUser(listUser, addUsers.name));

		do {
			addUsers.setUser();

		} while (findUserName(listUser, addUsers.user));
		addUsers.setPassword();

		addUsers.setAge();
		addUsers.setGender();
		addUsers.setEmail();
		addUsers.setPhoneNumer();
		addUsers.setAddress();
		return addUsers;
	}

	public static boolean findUserName(ArrayList<User> listUser, String username) {
		int i;
		boolean a = false;
		for (i = 0; i < listUser.size(); i++) {
			if (username.equals(listUser.get(i).getUser())) {

				a = true;
				break;
			} else
				a = false;
		}
		return a;
	}

	public static boolean findNameOfUser(ArrayList<User> listUser, String nameOfUser) {
		int i;
		boolean a = false;
		for (i = 0; i < listUser.size(); i++) {
			if (nameOfUser.equals(listUser.get(i).getName())) {

				a = true;
				break;
			} else
				a = false;
		}
		return a;
	}

	public static int findLocalUserName(ArrayList<User> listUser, String username) {
		int i, count = 0;
		for (i = 0; i < listUser.size(); i++) {
			if (username.equals(listUser.get(i).getUser())) {
				count = i;
				break;
			}
		}
		return count;
	}

	public static void removeUser(ArrayList<User> listUser, String name) {
		if (TestUser.findUserName(TestUser.listUser, name)) {
			TestUser.listUser.remove(TestUser.findLocalUserName(TestUser.listUser, name));
			System.out.println("SUCCESSFUL!");

		} else
			System.out.println("The Acount User doesn't exist!");

	}

	public static void displayArrListUser() {
		for (int i = 0; i < listUser.size(); i++) {
			System.out.println((i + 1) + "+" + TestUser.listUser.get(i).toString());
		}
	}

	public static void changePassword(ArrayList<User> listUser, int a) {

		System.out.println("Enter your password");
		String password = input.nextLine();
		if (password.equals(listUser.get(a).getPassword())) {
			System.out.println("Enter new password");
			String passNew = input.nextLine();
			listUser.get(a).setPassword(passNew);
			System.out.println("SUCCESFULL!");
		} else
			System.out.println("Password wrong!");

	}

	public static void displayArrListUser(int a) {
		System.out.println(TestUser.listUser.get(a).toString());
	}

}
