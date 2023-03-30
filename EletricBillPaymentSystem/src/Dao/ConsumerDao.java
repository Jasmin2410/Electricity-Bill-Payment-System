package Dao;

import java.util.List;
import java.util.Scanner;

import Dto.Consumer;
import Exceptions.NoRecordFoundException;
import Exceptions.SomeThingWrongException;

public interface ConsumerDao {
			
	
	boolean userLogin(Scanner sc);
	
	List<Consumer> View_His_Own_Transaction_History() throws SomeThingWrongException;
	
	boolean  Pay_Bill(Scanner sc);
	
	void Login(String username, String password) throws SomeThingWrongException, NoRecordFoundException;
	
	void logout();
	
}



//1. The consumer can sign-up. At the time of sign up first name, last name, username,
//password, address, mobile number, and email should be taken.
//2. Login with his account
//3. Pay bill
//4. View his own transaction History