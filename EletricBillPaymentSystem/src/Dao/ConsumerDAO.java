package Dao;



import java.util.List;
import Dto.Consumer;
import Dto.Payment;
import Dto.Transaction;
import Exceptions.NoRecordFoundException;
import Exceptions.SomeThingWrongException;

public interface ConsumerDAO {

	public String signUpConsumer(Consumer consumer) throws SomeThingWrongException ;
	
	public Consumer loginConsumer(String userName,String password) throws SomeThingWrongException, NoRecordFoundException ;
	
	public String PayBill(Payment payment, int id)throws SomeThingWrongException, NoRecordFoundException;	
	

	public List<Transaction> View_his_own_transaction_History (int cid) throws SomeThingWrongException, NoRecordFoundException;
	
	
	
}