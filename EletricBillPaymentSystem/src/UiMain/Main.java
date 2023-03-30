package UiMain;

import java.util.Scanner;

import Dao.LoggedINUser;

public class Main {
	
	private static UserUi userUI;

	static void displayAdminMenu() {
		System.out.println("1. View all consumers.");
		System.out.println("2. View the bill of the consumer.");
		System.out.println("3. View all the bills.");
		System.out.println("4. View all bills paid and pending");
		System.out.println("5. Delete consumer");
	
		System.out.println("0. for Exit");
	}
	
	static void adminMenu(Scanner sc) {
		int choice = 0;
		do {
			displayAdminMenu();
			System.out.print("Enter selection ");
			choice = sc.nextInt();
			switch(choice) {
				case 0:
					System.out.println("Bye Bye admin");
					break;
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				
				default:
					System.out.println("Invalid Selection, try again");
			}
		}while(choice != 0);
	}
	
	static void adminLogin(Scanner sc) {
		System.out.print("Enter username ");
		String username = sc.next();
		System.out.print("Enter password ");
		String password = sc.next();
		
		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
			adminMenu(sc);
		}else {
			System.out.println("Invalid Username and Password");
		}
	}



static void displayCustomerMenu() {
	System.out.println("1. Pay bill");
	System.out.println("2. View his own transaction History");
	System.out.println("6. Delete My Account");
	System.out.println("0. Logout");
}
static void customerLogin(Scanner sc) {
	if(!userUI.login())
		return;

	//you are here means login is successful
	int choice = 0;
	do {
		displayCustomerMenu();
		System.out.print("Enter selection ");
		choice = sc.nextInt();
		switch(choice) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				try{
					Thread.sleep(2000);
				}catch(InterruptedException ex) {
					
				}
				//no break statement here i.e. after deletion of user account, logout will also take place
			case 0:
				userUI.logout();
				break;
			default:
				System.out.println("Invalid Selection, try again");
		}
	}while(LoggedINUser.loggedInUserId != 0);
}


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	userUI = new UserUi(sc);
	
	int choice = 0;
	do {
		System.out.println("1. Admin Login\n2. Customer Login\n0. Exit");
		choice = sc.nextInt();
		switch(choice) {
			case 0:
				System.out.println("Thank you, Visit again");
				break;
			case 1:
				adminLogin(sc);
				break;
			case 2:
				customerLogin(sc);
				break;
			default:
				System.out.println("Invalid Selection, try again");
		}
	}while(choice != 0);
	sc.close();
}
}
