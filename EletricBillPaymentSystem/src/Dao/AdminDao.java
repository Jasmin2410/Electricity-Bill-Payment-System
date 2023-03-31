package Dao;

import java.util.List;


import Dto.Bill;
import Dto.Consumer;


public interface AdminDAO {

	public boolean adminLogin(String name,String password) throws WrongCredentials;
	
	public List<ConsumerBinClass> displayAllConsumers() throws EmptySet;
	
	public List<BillBinClass> displayBillofConsumer(int cid) throws EmptySet;
	
	public List<BillBinClass> displayAllBill() throws EmptySet;
	
	public void deleteConsumer(int cid) throws NoConsumerFound;
	
	
	
}