package human;

import java.util.Scanner;

public class TestAdmin {
	static Scanner ip = new Scanner(System.in);

	public static void login() {
		boolean kt=false;
		do {
		System.out.println("Enter Admin account");
		String account = ip.next();
		System.out.println("Enter password account");
		String password = ip.next();
		if (account.equals(Admin.account) && password.equals(Admin.accountPassWord)) {
			kt = true;
			System.out.println("Login succesfull!\n");
		}
		else System.out.println("\nWrong username or password \n    Enter again!\n");
		}while(kt==false);
	}
 
	
}
