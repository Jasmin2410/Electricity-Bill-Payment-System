package Dao;

import java.util.List;
import java.util.Scanner;

import Dto.Consumer;
import Exceptions.SomeThingWrongException;

public interface AdminDao {
	
	
	boolean adminLogin(Scanner sc);
	
	List<Consumer> viewAllConsumers() throws SomeThingWrongException;

	List<Consumer> ViewBillOfConsumer() throws SomeThingWrongException;

	List<Consumer> viewAllBills() throws SomeThingWrongException;

	List<Consumer> viewPaidPendingBills() throws SomeThingWrongException;

	void deleteConsumer(String username) throws SomeThingWrongException;
}
