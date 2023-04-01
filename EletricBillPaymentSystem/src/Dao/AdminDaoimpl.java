package Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dto.Admin;
import Dto.Bill;
import Dto.Consumer;
import Exceptions.NoRecordFoundException;
import Exceptions.SomeThingWrongException;

public class AdminDAOImpl implements AdminDAO{

	@Override
	
		public Admin loginAdmin(String admin_Id, String admin_password) throws SomeThingWrongException, NoRecordFoundException {

			Admin admin = null;

			try (Connection connection = DBUtils.provideConnection()) {

				PreparedStatement statement = connection
						.prepareStatement("SELECT * FROM admin WHERE admin_Id = ? AND admin_Password = ?");

				statement.setString(1, admin_Id);
				statement.setString(2, admin_password);

				ResultSet result = statement.executeQuery();

				if (result.next()) {

					String id = result.getString("admin_id");
					String password = result.getString("admin_password");

					admin = new Admin(id, password);
				} else {
					throw new SomeThingWrongException("Invalid Admin Id & Password");
				}

			} catch (SQLException e) {

				throw new SomeThingWrongException(e.getMessage());

			}

			return admin;
	}


	@Override
	public List<Consumer> DisplayAllConsumers() throws SomeThingWrongException {
		List<Consumer> listofconsumers = new ArrayList<Consumer>();

		try (Connection connection = DBUtils.provideConnection()) {

			PreparedStatement statement = connection.prepareStatement("SELECT * FROM consumer");

			

			ResultSet result = statement.executeQuery();

			while (result.next()) {
				
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
				
				 
				Consumer consumer = new Consumer (id,first_name,last_name,username,password,address,mobile_number,email,connection_status,is_Deleted);
				
				
				listofconsumers.add(consumer);
			}

		} catch (SQLException e) {

			throw new SomeThingWrongException(e.getMessage());
		}
		
		if (listofconsumers.size() == 0) {
			throw new SomeThingWrongException("No consumer found");
		}

		return listofconsumers;
	}


	@Override
	public List<Bill> displayBillofConsumer(int cid) throws SomeThingWrongException, NoRecordFoundException {

		List<Bill> bills = new ArrayList<Bill>();

		try (Connection connection = DBUtils.provideConnection()) {

			PreparedStatement statement = connection.prepareStatement("SELECT * FROM Bill WHERE consumer_id = ?;");

					
			statement.setInt(1, cid);

			ResultSet result = statement.executeQuery();
			while (result.next()) {
				
				int id=result.getInt("Id");
				
				String bill_number = result.getString("bill_number");

				int consumer_Id = result.getInt("consumer_Id");

				Date bill_cycle_start_date = result.getDate("bill_cycle_start_date");

				Date bill_cycle_end_date = result.getDate("bill_cycle_end_date");

				double fixed_charge = result.getDouble("fixed_charge");

				int total_units_consumed = result.getInt("total_units_consumed");

				double taxes = result.getDouble("taxes");

				double adjustment = result.getDouble("adjustment");

				String bill_status =result.getString("bill_status");
				
				int is_Deleted = result.getInt("is_Deleted");

				
				Bill bill = new Bill(id,bill_number, consumer_Id, bill_cycle_start_date, bill_cycle_end_date, fixed_charge, total_units_consumed, taxes, adjustment, bill_status, is_Deleted);
				
				
				bills.add(bill);
			
			}

		} catch (SQLException e) {
			throw new SomeThingWrongException(e.getMessage());
		}

		if (bills.size() == 0) {
			throw new NoRecordFoundException("No Ticket Reservations found");
		}

		return bills;
	}

	@Override
	public List<Bill> displayAllBill() throws SomeThingWrongException, NoRecordFoundException{
		List<Bill> listOfBills = new ArrayList<Bill>();

		try (Connection connection = DBUtils.provideConnection()) {

			PreparedStatement statement = connection.prepareStatement("SELECT * FROM bill");

			

			ResultSet result = statement.executeQuery();

			while (result.next()) {
				
				int id=result.getInt("Id");
				
				String bill_number = result.getString("bill_number");

				int consumer_Id = result.getInt("consumer_Id");

				Date bill_cycle_start_date = result.getDate("bill_cycle_start_date");

				Date bill_cycle_end_date = result.getDate("bill_cycle_end_date");

				double fixed_charge = result.getDouble("fixed_charge");

				int total_units_consumed = result.getInt("total_units_consumed");

				double taxes = result.getDouble("taxes");

				double adjustment = result.getDouble("adjustment");

				String bill_status =result.getString("bill_status");
				
				int is_Deleted = result.getInt("is_Deleted");

				
				Bill bill = new Bill(id,bill_number, consumer_Id, bill_cycle_start_date, bill_cycle_end_date, fixed_charge, total_units_consumed, taxes, adjustment, bill_status, is_Deleted);
				
				
				listOfBills.add(bill);
			}

		} catch (SQLException e) {

			throw new SomeThingWrongException(e.getMessage());
		}
		
		if (listOfBills.size() == 0) {
			throw new SomeThingWrongException("No Bill found");
		}

		return listOfBills;
		
	}

	@Override
	public List<Bill> displayPaidAndPending() throws SomeThingWrongException {
		
		List<Bill> listOfBills = new ArrayList<Bill>();

		try (Connection connection = DBUtils.provideConnection()) {

			PreparedStatement statement = connection.prepareStatement("select * from bill WHERE bill_status IN ('Paid', 'Pending')");

			

			ResultSet result = statement.executeQuery();

			while (result.next()) {
				
				int id=result.getInt("Id");
				
				String bill_number = result.getString("bill_number");

				int consumer_Id = result.getInt("consumer_Id");

				Date bill_cycle_start_date = result.getDate("bill_cycle_start_date");

				Date bill_cycle_end_date = result.getDate("bill_cycle_end_date");

				double fixed_charge = result.getDouble("fixed_charge");

				int total_units_consumed = result.getInt("total_units_consumed");

				double taxes = result.getDouble("taxes");

				double adjustment = result.getDouble("adjustment");

				String bill_status =result.getString("bill_status");
				
				int is_Deleted = result.getInt("is_Deleted");

				
				Bill bill = new Bill(id,bill_number, consumer_Id, bill_cycle_start_date, bill_cycle_end_date, fixed_charge, total_units_consumed, taxes, adjustment, bill_status, is_Deleted);

				listOfBills.add(bill);
			
			}

		} catch (SQLException e) {

			throw new SomeThingWrongException(e.getMessage());
		}
		
		if (listOfBills.size() == 0) {
			throw new SomeThingWrongException("No Bill found");
		}

		return listOfBills;
	}

	@Override
	public String deleteConsumer(int cid) throws SomeThingWrongException, NoRecordFoundException {
		
		String result = null;

		try (Connection connection = DBUtils.provideConnection()) {

			PreparedStatement statement = connection.prepareStatement("UPDATE consumer SET connection_status = 'inactive' WHERE id =?");

			statement.setInt(1, cid);

			int response = statement.executeUpdate();

			if (response > 0) {
				result = "                                                  CONSUMER SET INACTIVE SUCESSFULLY !";
			}

		} catch (SQLException e) {

			result = e.getMessage();
		}

		return result;
	}
	
}