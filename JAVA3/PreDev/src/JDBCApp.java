

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import sun.security.mscapi.CKeyPairGenerator.RSA;

public class JDBCApp {
	//driver
	private static final String CONNECT_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	//url
	private static final String CONNECT_URL = "jdbc:sqlserver://localhost:1433;"
			+ "DatabaseName=Test";
			//+ "integratedSecurity=true";
	//username
	private static final String CONNECT_USER = "sa";
	//password
	private static final String CONNECT_PASSWORD = "123456789";
	
	public static Connection getConnect() throws ClassNotFoundException {
		//dang ky driver
		//Class.forName(CONNECT_DRIVER);
		//KET NOI db
		//neu connection !=null thi thuc hien dong 
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(CONNECT_URL,CONNECT_USER,CONNECT_PASSWORD);
			System.out.println("Connect...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}
	
	public static void closeConnection(Connection connection) {
		if (connection!=null) {
		try {
			connection.close();
			System.out.println("Close...");
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
	}
	
	public static void testStatement() {
		Statement statement = null;
		Connection connection = null;
		try {
			connection = JDBCApp.getConnect();
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("Select * from deal");
			while (rs.next()) {
				System.out.println(rs.getString("deal_product_ID"));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			closeConnection(connection);
		}
	}
	
	public static void testPrepairStatement() {
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		try {
			connection = JDBCApp.getConnect();
			preparedStatement = connection.prepareStatement("Select * from deal where deal_quantity >= ? ");
			preparedStatement.setInt(1, 4);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getString("deal_product_ID"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			closeConnection(connection);
		}
		
	}
	public static void main(String[] args) {
		JDBCApp.testPrepairStatement();
	}
}
