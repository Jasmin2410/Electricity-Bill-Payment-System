package UiMain;

import java.util.Scanner;

import Dao.ConsumerDao;
import Dao.ConsumerDaoimpl;
import Exceptions.NoRecordFoundException;
import Exceptions.SomeThingWrongException;

public class UserUi {

	private ConsumerDao consumerDao;
	private Scanner scanner;
	
	public UserUi(Scanner scanner) {
		this.consumerDao = new ConsumerDaoimpl();
		this.scanner = scanner;
	}
	
	
	
	
	public boolean login() {
		boolean loginSuccessful = false;
		//code to take input username and password
		System.out.print("Enter username ");
		String username = scanner.next();
		
		System.out.print("Enter password ");
		String password = scanner.next();
		
		try {
			consumerDao.Login(username, password);
			loginSuccessful = true;
		}catch(SomeThingWrongException | NoRecordFoundException ex) {
			System.out.println(ex);
		}
		return loginSuccessful;
	}
	
	public void logout() {
		consumerDao.logout();
	}
}
