package CRUD;

import java.sql.*;

public class Insert {

	public static void main(String[] args) {
		Connection connection;
		
		PreparedStatement preparedStatement;
		
		String dataBaseUrl = "jdbc:mysql://localhost:666/cats";
		
		String user = "wsi08i";
		String password = "password";
		
		try 
		{
			System.out.println("10");
			connection = DriverManager.getConnection(dataBaseUrl, user, password);
			
			preparedStatement = connection.prepareStatement("INSERT INTO cats (id,name,breed,age,owner)VALUES(?,?,?,?,?);");
			
			preparedStatement.setInt(1, 5);
			preparedStatement.setString(2, "Kandur");
			preparedStatement.setString(3, "perzsa");
			preparedStatement.setInt(4, 10);
			preparedStatement.setString(5, "Petra");
			
			preparedStatement.executeUpdate();
			
			preparedStatement.close();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}