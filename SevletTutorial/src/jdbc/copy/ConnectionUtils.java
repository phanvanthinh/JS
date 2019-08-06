package jdbc.copy;

import java.sql.Connection;
import java.sql.DriverManager;

import user.user;

public class ConnectionUtils {

	public static Connection getMyConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String hostName = "localhost";
		String dbName = "jsp";
		String userName = "root";
		String password = "1211";
		String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
		Connection conn = DriverManager.getConnection(connectionURL, userName,password);
		return conn;
	}

	
	

}
