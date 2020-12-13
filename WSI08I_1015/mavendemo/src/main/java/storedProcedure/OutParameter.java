package storedProcedure;

import java.sql.*;

public class OutParameter {

	public static void main(String[] args) {
Connection connection;
		
		CallableStatement callableStatement;
			
		String dataBaseUrl = "jdbc:mysql://localhost:666/cats";
			
		String user = "wsi08i";
		String password = "password";
			
		try 
		{
			System.out.println("15");
			
			connection = DriverManager.getConnection(dataBaseUrl, user, password);
			
			callableStatement = connection.prepareCall("{call count_breed(?,?)}"); 
			
			callableStatement.setString(1, "Perzsa");
			
			callableStatement.registerOutParameter(2,Types.INTEGER);
			
			callableStatement.executeUpdate();
			
			int count = callableStatement.getInt(2);
			
			System.out.println(count);
			
			callableStatement.close();
		}catch (Exception e)
		{				
			e.printStackTrace();
		}
	}

}
