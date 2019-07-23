package application;

import java.util.Scanner;

import book.Cart;
import book.TestBook;
import book.TestOrder;
import human.TestAdmin;
import human.TestUser;

public class Application {
	public static Scanner ip = new Scanner(System.in);
	static boolean exit = false;

	static void title() {
		System.out.println("\n______________________________________________");
		System.out.println("|                                            |");
		System.out.println("|****************BOOK STORY******************|");
		System.out.println("|____________________________________________|");
	}

	static void userType() {

		System.out.println("\n______________________________________________");
		System.out.println("|               PLEASE  CHOOSE               |");
		System.out.println("| 1. Admin                                   |");
		System.out.println("| 2. User                                    | ");
		System.out.println("| 3. Exit                                    |");
		System.out.println("|____________________________________________|\n");

	}

	static void managementAdnim() {
		System.out.println("______________________________________________");
		System.out.println("|               PLEASE  CHOOSE               |");
		System.out.println("| 1. Book management                         |");
		System.out.println("| 2. User management                         |");
		System.out.println("| 3. Order management                        |");
		System.out.println("| 4. Logout                                  |");
		System.out.println("| 5. Exit                                    |");
		System.out.println("|____________________________________________|\n");
	}

	static void bookManagement() {
		System.out.println("______________________________________________");
		System.out.println("|              BOOK MANAGEMENT               |");
		System.out.println("| 1. Add book                                |");
		System.out.println("| 2. Remove book                             |");
		System.out.println("| 3. Find book                               |");
		System.out.println("| 4. Display book                            |");
		System.out.println("| 5. Come back Admin management              |");
		System.out.println("| 6. Exit                                    |");
		System.out.println("|____________________________________________|\n");
	}

	static void userManagent() {
		System.out.println("______________________________________________");
		System.out.println("|          USER ACCOUNT MANAGEMENT           |");
		System.out.println("| 1. Remove user                             |");
		System.out.println("| 2. Find user                               |");
		System.out.println("| 3. Display user                            |");
		System.out.println("| 4. Come back Admin management              |");
		System.out.println("| 5. Exit                                    |");
		System.out.println("|____________________________________________|\n");
	}

	static void OrderManagement() {
		System.out.println("______________________________________________");
		System.out.println("|              ORDER MANAGEMENT              |");
		System.out.println("| 1. Remove order                            |");
		System.out.println("| 2. Display order                           |");
		System.out.println("| 3. Come back Admin management              |");
		System.out.println("| 4. Exit                                    |");
		System.out.println("|____________________________________________|\n");
	}

	static void managementUser() {
		System.out.println("______________________________________________");
		System.out.println("|               PLEASE  CHOOSE               |");
		System.out.println("| 1. Login                                   |");
		System.out.println("| 2. Registration                            |");
		System.out.println("| 3. Come back system                        |");
		System.out.println("|____________________________________________|\n");
	}

	static void menu() {
		System.out.println("______________________________________________");
		System.out.println("|                     MENU                   |");
		System.out.println("| 1. Account                                 |");
		System.out.println("| 2. Information  Book                       |");
		System.out.println("| 3. Find name's book                        |");
		System.out.println("| 4. Add book to cart                        |");
		System.out.println("| 5. Check cart                              |");
		System.out.println("| 6. Order book                              |");
		System.out.println("| 7. Log out                                 |");
		System.out.println("| 8. Exit                                    |");
		System.out.println("|____________________________________________|\n");

	}

	static void accountUser() {
		System.out.println("______________________________________________");
		System.out.println("|               PLEASE  CHOOSE               |");
		System.out.println("| 1. Information your account                |");
		System.out.println("| 2. Change password                         |");
		System.out.println("| 3. Come back menu                          |");
		System.out.println("| 4. Exit                                    |");
		System.out.println("|____________________________________________|\n");

	}

	static void checkCart() {
		System.out.println("______________________________________________");
		System.out.println("|               PLEASE  CHOOSE               |");
		System.out.println("| 1. Information cart                        |");
		System.out.println("| 2. Remove book in cart                     |");
		System.out.println("| 3. Order book                              |");
		System.out.println("| 4. Come back menu                          |");
		System.out.println("| 5. Exit                                    |");
		System.out.println("|____________________________________________|\n");

	}

	static int exit() {
		System.out.println("=============Do you want exit=============");
		System.out.println("1. Yes!");
		System.out.println("2. No!\n");
		int a = Integer.parseInt(ip.nextLine());
		if (a == 1) {
			System.exit(0);
		}

		return a;
	}

	public static void runUserManagement() {
		int b, c;
		do {
			userManagent();
			do {
				b = Integer.parseInt(ip.nextLine());

				switch (b) {
				case 1: {
					System.out.println(" ============REMOVE USER=============  ");
					System.out.println("Enter name's userAcount you want remove! ");
					String name = ip.nextLine();
					TestUser.removeUser(TestUser.listUser, name);
					break;

				}

				case 2: {
					System.out.println("============== FIND USER =============");
					System.out.println("Enter name's user account you want find! ");
					String name = ip.nextLine();
					if (TestUser.findUserName(TestUser.listUser, name)) {
						System.out.println(
								TestUser.listUser.get(TestUser.findLocalUserName(TestUser.listUser, name)).toString());
					} else
						System.out.println("The system hasn't the account!");
					break;

				}

				case 3: {
					System.out.println(" ============ DISPLAY USER ===========");
					TestUser.displayArrListUser();

					break;
				}
				case 4: {
					System.out.println("======COME BACK ADMIN MANAGEMENT!======");
					runManagementAdnim();
				}
				case 5: {
					if (exit() != 1)
						runUserManagement();
					break;
				}
				default: {
					userManagent();
					System.out.println(">>>>>>>>>Please choose 1 to 5<<<<<<<<<<<<<");
				}
				}
			} while (b < 1 || b > 5);
			System.out.println("===Choose 1(exit)--------choose 2(Come back)===");
			c = Integer.parseInt(ip.nextLine());
			if (c == 1)
				System.exit(0);
		} while (c != 1);
	}

	public static void runBookManagement() {
		int b, c;
		do {
			title();
			bookManagement();
			do {
				b = Integer.parseInt(ip.nextLine());
				switch (b) {
				case 1: {
					System.out.println("================ADD BOOK================\n");
					TestBook.listBook.add(TestBook.addBook(TestBook.listBook));
					System.out.println(">>>>>>>>>>>>>>>>SUCCESSFUL<<<<<<<<<<<<<<<");
					break;
				}

				case 2: {
					System.out.println("=================REMOVE BOOK============\n");
					System.out.println("Enter name's book you want remove! ");
					String name = ip.nextLine();
					TestBook.removeBook(TestBook.listBook, name);
					break;
				}

				case 3: {
					System.out.println("=================FIND BOOK===============");
					System.out.println("Enter name's book you want find! ");
					String name = ip.nextLine();
					if (TestBook.findBook(TestBook.listBook, name)) {
						System.out.println(
								TestBook.listBook.get(TestBook.findLocalBook(TestBook.listBook, name)).toString());
					} else
						System.out.println(">>>>>>The system hasn't the book<<<<<");
					break;
				}

				case 4: {
					System.out.println("================DISPLAY BOOK==============");
					TestBook.displayArrListBook();
					break;
				}
				case 5: {
					System.out.println("========COME BACK ADMIN MANAGEMENT!========");
					runManagementAdnim();
				}
				case 6: {
					if (exit() != 1)
						runBookManagement();
					break;
				}
				default: {
					title();
					bookManagement();
					System.out.println(">>>>>>>>>Please choose 1 to 6<<<<<<<<<<<<<");
				}
				}
			} while (b < 1 || b > 6);
			System.out.println("Choose 1(exit)--------choose 2(Come back)");
			c = Integer.parseInt(ip.nextLine());
			if (c == 1)
				System.exit(0);
		} while (c != 1);
	}

	public static void runOrderManagement() {
		int b, c;
		do {
			title();
			OrderManagement();
			do {
				b = Integer.parseInt(ip.nextLine());
				switch (b) {

				case 1: {
					System.out.println("==================REMOVE ORDER==============");
					TestOrder.removeOrder();
					break;
				}

				case 2: {
					System.out.println("=================DISPLAY ORDER=============");
					if (TestOrder.listOrder.size() > 0) {
						TestOrder.listOrders();
					} else
						System.out.println(">>>>>>>>>>>>>>Order is empty!<<<<<<<<<<<<<");
					break;
				}
				case 3: {
					System.out.println("==========COME BACK ADMIN MANAGEMENT!=======");
					runManagementAdnim();
				}
				case 4: {
					if (exit() != 1)
						runOrderManagement();
					break;
				}
				default: {
					title();
					OrderManagement();
					System.out.println(">>>>>>>>>Please choose 1 to 4<<<<<<<<<<<<<");
				}
				}
			} while (b < 1 || b > 4);
			System.out.println("Choose 1(exit)--------choose 2(Come back)");
			c = Integer.parseInt(ip.nextLine());
			if (c == 1)
				System.exit(0);
		} while (c != 1);
	}

	public static void runManagementAdnim() {
		int b, c;
		do {
			title();
			managementAdnim();
			do {
				b = Integer.parseInt(ip.nextLine());
				switch (b) {
				case 1: {
					runBookManagement();
					break;
				}

				case 2: {
					runUserManagement();
					break;
				}

				case 3: {
					runOrderManagement();
					break;
				}
				case 4: {
					System.out.println("=================LOG OUT===================");
					runApplicaton();
				}
				case 5: {
					if (exit() != 1)
						runManagementAdnim();
					break;
				}
				default: {
					title();
					managementAdnim();
					System.out.println(">>>>>>>>>Please choose 1 to 5<<<<<<<<<<<<<");
				}
				}
			} while (b < 1 || b > 5);
			System.out.println("Choose 1(exit)--------choose 2(Come back)");
			c = Integer.parseInt(ip.nextLine());
			if (c == 1)
				System.exit(0);
		} while (c != 1);
	}

	public static void runCheckCart() {
		int b, c;
		do {
			title();
			checkCart();
			do {
				b = Integer.parseInt(ip.nextLine());
				switch (b) {

				case 1: {
					System.out.println("===============INFORMATION CART==============");
					Cart.displayCart();
					break;
				}

				case 2: {
					System.out.println("============REMOVE BOOK IN CART==============");
					Cart.removeBookInCart();
					break;
				}
				case 3: {
					System.out.println("=================ORDER BOOK =================");
					TestOrder.addOdersCart();
					break;
				}
				case 4: {
					System.out.println("==============COME BACK MENU================");
					runMenu();
					break;
				}
				case 5: {
					if (exit() != 1)
						runCheckCart();
					TestOrder.listOrders();
					break;
				}
				default: {
					title();
					checkCart();
					System.out.println(">>>>>>>>>Please choose 1 to 5<<<<<<<<<<<<<");
				}
				}
			} while (b < 1 || b > 5);
			System.out.println("Choose 1(exit)--------choose 2(Come back)");
			c = Integer.parseInt(ip.nextLine());
			if (c == 1)
				System.exit(0);
		} while (c != 1);
	}

	public static void runAccountUser() {
		int b, c;
		do {
			title();
			accountUser();
			do {
				b = Integer.parseInt(ip.nextLine());
				switch (b) {

				case 1: {
					System.out.println("========INFORMATION YOUR ACCOUNT============");
					TestUser.displayArrListUser(TestUser.a);

					break;
				}

				case 2: {
					System.out.println("=======CHANGE PASSWORD YOUR ACCOUNT========");
					System.out.println("Change password your account");
					TestUser.changePassword(TestUser.listUser, TestUser.a);

					break;
				}

				case 3: {
					System.out.println("==============COME BACK MENU================");
					runMenu();
					break;
				}
				case 4: {
					if (exit() != 1)
						runAccountUser();
					break;
				}
				default: {
					title();
					accountUser();
					System.out.println(">>>>>>>>>Please choose 1 to 4<<<<<<<<<<<<<");
				}
				}
			} while (b < 1 || b > 4);
			System.out.println("Choose 1(exit)--------choose 2(Come back)");
			c = Integer.parseInt(ip.nextLine());
			if (c == 1)
				System.exit(0);
		} while (c != 1);
	}

	public static void runMenu() {
		int b, c;
		do {
			title();
			menu();
			do {
				b = Integer.parseInt(ip.nextLine());
				switch (b) {
				case 1: {
					System.out.println("=================ACCOUNT====================");
					runAccountUser();
					break;
				}

				case 2: {
					System.out.println("===========INFORMATION BOOK=================");
					TestBook.displayArrListBook();
					break;
				}

				case 3: {
					System.out.println("=================FIND BOOK===================");
					System.out.println("Enter name's book you want find! ");
					String name = ip.nextLine();
					if (TestBook.findBook(TestBook.listBook, name)) {
						System.out.println(
								TestBook.listBook.get(TestBook.findLocalBook(TestBook.listBook, name)).toString());
					}
					break;
				}
				case 4: {
					System.out.println("===========ADD BOOK TO CART=================");
					Cart.addBookToCart();
					break;
				}
				case 5: {
					System.out.println("=================CHECK CART=================");
					runCheckCart();
					break;
				}
				case 6: {
					System.out.println("=================ORDER BOOK=================");
					TestOrder.addOrder(TestBook.listBook);

					break;
				}
				case 7: {
					System.out.println("================= LOG OUT===================");
					runManagementUser();
				}
				case 8: {
					if (exit() != 1)
						runMenu();
					break;
				}
				default: {
					title();
					menu();
					System.out.println(">>>>>>>>>Please choose 1 to 8<<<<<<<<<<<<<");
				}
				}
			} while (b < 1 || b > 8);
			System.out.println("Choose 1(exit)--------choose 2(Come back)");
			c = Integer.parseInt(ip.nextLine());
			if (c == 1)
				System.exit(0);
		} while (c != 1);
	}

	public static void runManagementUser() {
		int b, c;
		do {
			title();
			managementUser();
			do {
				b = Integer.parseInt(ip.nextLine());
				switch (b) {
				case 1: {
					System.out.println("===================LOGIN====================");
					TestUser.login();
					runMenu();
					break;
				}

				case 2: {
					System.out.println("===============REGISTRATOR==================");
					TestUser.listUser.add(TestUser.addUser(TestUser.listUser));
					System.out.println("Registration is successful!\n");

					System.out.println("-------------Can you Login------------------");
					runManagementUser();
					break;
				}
				case 3: {
					System.out.println(">>>>>>>>>>>Come back the system<<<<<<<<<<<<<");
					runApplicaton();
				}

				default: {
					title();
					managementUser();
					System.out.println(">>>>>>>>>Please choose 1 to 3<<<<<<<<<<<<<");

				}
				}
			} while (b < 1 || b > 3);
			System.out.println("Choose 1(exit)--------choose 2(Come back)");
			c = Integer.parseInt(ip.nextLine());
			if (c == 1)
				System.exit(0);
		} while (c != 1);
	}

	public static void runApplicaton() {
		int b, c;
		do {

			title();
			userType();
			do {
				b = Integer.parseInt(ip.nextLine());
				switch (b) {
				case 1: {
					System.out.println("--------------- ADMINITRATOR-----------------\n");
					TestAdmin.login();
					runManagementAdnim();
					break;
				}

				case 2: {

					runManagementUser();
					break;
				}
				case 3: {
					if (exit() != 1)
						runMenu();
					break;
				}

				default: {
					title();
					userType();
					System.out.println(">>>>>>>>>Please choose 1 to 3<<<<<<<<<<<<<");

				}
				}
			} while (b < 1 || b > 3);
			System.out.println("Choose 1 (exit)--------choose 2 (Come back)");
			c = Integer.parseInt(ip.nextLine());
			if (c == 1)
				System.exit(0);
		} while (c != 1);

	}

	public static void main(String[] args) {
		TestBook.dataBook();
		TestUser.add();
		runApplicaton();
	}

}
