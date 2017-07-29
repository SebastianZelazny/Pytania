package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {

	public Connection Connection() throws SQLException, ClassNotFoundException {
		System.out.println("kliker");
		 Class.forName("com.mysql.jdbc.Driver");
		 System.out.println("kliker2");
         return DriverManager.getConnection("jdbc:mysql://localhost:3306/pytania","root","Tosi@2016");
	}

}
