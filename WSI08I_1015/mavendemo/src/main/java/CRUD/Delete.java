package CRUD;

import java.sql.*;

public class Delete {

	public static void main(String[] args) {
		Connection connection;
			
		PreparedStatement preparedStatement;
			
		String dataBaseUrl = "jdbc:mysql://localhost:666/cats";
			
		String user = "wsi08i";
		String password = "password";
			
		try 
		{
			System.out.println("12");
			connection = DriverManager.getConnection(dataBaseUrl, user, password);
			
			preparedStatement = connection.prepareStatement("delete from cats WHERE name = 'Perzsa' and owner='Gal Dora'");
			
			preparedStatement.executeUpdate();
			
			preparedStatement.close();
		}catch (Exception e)
		{				
			e.printStackTrace();
		}
	}

}
