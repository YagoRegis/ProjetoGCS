package main.java.br.unb.gcs.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection getConnection() {
		
		Connection connection = null;
		System.out.println("Conectando ao banco");
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/helpdesk","root", "root");			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return connection;
	}

}
