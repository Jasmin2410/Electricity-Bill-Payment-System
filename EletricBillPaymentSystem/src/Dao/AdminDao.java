package Dao;

import java.util.List;
import java.util.Scanner;

import Dto.Consumer;
import Exceptions.ConsumerException;

public interface AdminDao {
	
	
	boolean adminLogin(Scanner sc);
	
	List<Consumer> viewAllConsumers() throws ConsumerException;

	List<Consumer> ViewBillOfConsumer() throws ConsumerException;

	List<Consumer> viewAllBills() throws ConsumerException;

	List<Consumer> viewPaidPendingBills() throws ConsumerException;

	void deleteConsumer(String username) throws ConsumerException;
}
