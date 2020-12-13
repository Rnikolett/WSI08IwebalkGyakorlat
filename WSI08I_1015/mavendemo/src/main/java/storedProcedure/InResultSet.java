package storedProcedure;

import java.sql.*;

public class InResultSet {

	public static void main(String[] args) {
		Connection connection;
		
		CallableStatement callableStatement;
			
		String dataBaseUrl = "jdbc:mysql://localhost:666/cats";
			
		String user = "wsi08i";
		String password = "password";
			
		try 
		{
			System.out.println("13");
			
			connection = DriverManager.getConnection(dataBaseUrl, user, password);
			
			callableStatement = connection.prepareCall("{call get_cats_for_owner(?)}"); 
			
			callableStatement.setString(1, "Tulajdonos");
			
			callableStatement.executeUpdate();
			
			callableStatement.close();
		}catch (Exception e)
		{				
			e.printStackTrace();
		}
	}

}
