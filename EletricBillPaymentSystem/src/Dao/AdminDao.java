package Dao;

import java.util.List;

import Dto.Admin;
import Dto.Bill;
import Dto.Consumer;
import Exceptions.NoRecordFoundException;
import Exceptions.SomeThingWrongException;


public interface AdminDAO {

	public Admin loginAdmin(String admin_Id, String admin_password) throws SomeThingWrongException, NoRecordFoundException;
	
	public List<Consumer> DisplayAllConsumers() throws SomeThingWrongException, NoRecordFoundException;
	
	public List<Bill> displayBillofConsumer(int cid) throws SomeThingWrongException ,NoRecordFoundException;
	
	public List<Bill> displayAllBill() throws SomeThingWrongException, NoRecordFoundException;
	
	public List<Bill> displayPaidAndPending () throws SomeThingWrongException, NoRecordFoundException;
	
	public String deleteConsumer(int cid) throws SomeThingWrongException, NoRecordFoundException;
	

	
}