package pkgService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionBD {
	private static String urlCOnnection =  "jdbc:mysql://localhost:3306/vodka_bd";
	private static String login = "amilette";
	private static String pwd = "1625Waldo";
	private static Connection connection = null;
	
	
	
	private static void connect(){
		//recup driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(urlCOnnection, login, pwd);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void disconnect(){
		try {
			connection.close();
			connection = null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static PreparedStatement getPS(String query){
		
		PreparedStatement ps = null;
		if(connection == null){
				connect();			
		}	
		try {
			
			ps = connection.prepareStatement(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("erreyr");
		}
		
		return ps;
	}
	
	
	
}
