package Dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Dto.Consumer;
import Dto.Transaction;
import Exceptions.NoRecordFoundException;
import Exceptions.SomeThingWrongException;

public class ConsumerDAOImpl implements ConsumerDAO {

	@Override
	public String signUpConsumer(Consumer consumer) throws SomeThingWrongException {
		String result = null;

		try (Connection connection = DBUtils.provideConnection()) {

			PreparedStatement statement = connection.prepareStatement("INSERT INTO Consumer (first_name, last_name, username, password, address, mobile_number, email)VALUES (?,?,?,?,?,?,?)");

			statement.setString(1, consumer.getfirst_name());
			statement.setString(2, consumer.getlast_name());
			statement.setString(3, consumer.getUsername());
			statement.setString(4, consumer.getPassword());
			statement.setString(5, consumer.getAddress());
			statement.setString(6, consumer.getMobile_number());
			statement.setString(7, consumer.getEmail());

			

			int response = statement.executeUpdate();

			if (response > 0) {
				result = "Consumer Signin Sucessfull !";
			}

		} catch (SQLException e) {
			result = e.getMessage();
		}

		return result;
		
		 
	}

	@Override
	public Consumer loginConsumer(String userName, String Password)throws SomeThingWrongException, NoRecordFoundException {

		Consumer consumer = null;

		try (Connection connection = DBUtils.provideConnection()) {

			PreparedStatement statement = connection
					.prepareStatement("SELECT * FROM Consumer WHERE id = ? AND password = ?");

			statement.setString(1, userName);
			statement.setString(2, Password);

			ResultSet result = statement.executeQuery();

			if (result.next()) {
				int id = result.getInt("id");
				String first_name = result.getString("first_name");
				String last_name = result.getString("last_name");
				String username = result.getString("username");
				String password = result.getString("password");
				String address = result.getString("address");
				String mobile_number = result.getString("mobile_number");
				String email = result.getString("email");
				String connection_status=result.getString("connection_status");
				boolean is_Deleted = result.getBoolean("is_Deleted");

				consumer = new Consumer(id, first_name, last_name, username, password,address,mobile_number,email,connection_status,is_Deleted);
			} else {
				throw new NoRecordFoundException("Invalid User Id & Password");
			}

		} catch (SQLException e) {

			throw new NoRecordFoundException(e.getMessage());

		}

		return consumer;
	}

	@Override
	public String PayBill( int id) throws SomeThingWrongException, NoRecordFoundException {
		
		String result = null;

		try (Connection connection = DBUtils.provideConnection()) {

			PreparedStatement statement = connection.prepareStatement("UPDATE Bill SET bill_status = 'paid' WHERE id = ?");

			statement.setInt(1, id);

			int response = statement.executeUpdate();

			if (response > 0) {
				result = "                                                    SUCESSFULLY BILL PAID !";
			}

		} catch (SQLException e) {

			result = e.getMessage();
		}

		return result;
	}
	

	@Override
	public List<Transaction> View_his_own_transaction_History(int cid) throws SomeThingWrongException, NoRecordFoundException {
		
		List<Transaction> trans = new ArrayList<Transaction>();

		try (Connection connection = DBUtils.provideConnection()) {

			PreparedStatement statement = connection.prepareStatement("SELECT b.bill_number,b.consumer_id, b.bill_cycle_start_date, b.bill_cycle_end_date, b.total_units_consumed, b.bill_status, p.payment_date, p.amount_paid \r\n"
					+ "FROM Bill b LEFT JOIN Payment p ON b.id = p.bill_id WHERE b.consumer_id = ?");

					
			statement.setInt(1, cid);

			ResultSet result = statement.executeQuery();

			while (result.next()) {

				String bill_number = result.getString("bill_number");
				
				int consumer_id = result.getInt("consumer_id");

				Date bill_cycle_start_date = result.getDate("bill_cycle_start_date");

				Date bill_cycle_end_date = result.getDate("bill_cycle_end_date");

				int total_units_consumed = result.getInt("total_units_consumed");

				String  bill_status = result.getString("bill_status");

				Date payment_date = result.getDate("payment_date");

				double amount_paid = result.getDouble("amount_paid");


				

				Transaction transa = new Transaction(bill_number,consumer_id,bill_cycle_start_date, bill_cycle_end_date, total_units_consumed, bill_status, payment_date, amount_paid);
				trans.add(transa);
				
			}

		} catch (SQLException e) {
			throw new SomeThingWrongException(e.getMessage());
		}

		if (trans.size() == 0) {
			throw new NoRecordFoundException("No Transaction Found");
		}

		return trans;
	}

	
	
}