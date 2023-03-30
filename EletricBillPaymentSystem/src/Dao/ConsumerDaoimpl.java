package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import Dto.Consumer;
import Exceptions.NoRecordFoundException;
import Exceptions.SomeThingWrongException;

public class ConsumerDaoimpl implements ConsumerDao {

	@Override
	public boolean userLogin(Scanner sc) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Consumer> View_His_Own_Transaction_History() throws SomeThingWrongException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Pay_Bill(Scanner sc) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void Login(String username, String password) throws SomeThingWrongException, NoRecordFoundException{
		Connection connection = null;
		try {
			//connect to database
			connection = DBUtils.connectToDatabase();
			//prepare the query
			String LOGIN_QUERY = "SELECT user_id FROM user WHERE username = ? AND password = ?";
			
			//get the prepared statement object
			PreparedStatement ps = connection.prepareStatement(LOGIN_QUERY);
			
			//stuff the data in the query
			ps.setString(1, username);
			ps.setString(2, password);
			
			//execute query
			ResultSet resultSet = ps.executeQuery();
			if(DBUtils.isResultSetEmpty(resultSet)) {
				throw new NoRecordFoundException("Invalid Username and Password");
			}
			
			//you are here means username and password combination is correct
			resultSet.next();
			LoggedINUser.loggedInUserId = resultSet.getInt("user_id");
		}catch(SQLException sqlEx) {
			//code to log the error in the file
			throw new SomeThingWrongException();
		}finally {
			try {
				//close the exception
				DBUtils.closeConnection(connection);				
			}catch(SQLException sqlEX) {
				throw new SomeThingWrongException();
			}
		}
	}
	
	@Override
	public void logout() {
		LoggedINUser.loggedInUserId = 0;
	}

}
