package db;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Person;
public class DBConnection {
	private static String connectStatement="jdbc:derby:KollektivDatabase";
	public static Connection connection=null;
	public static void connect() {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
			System.out.println("Embedded driver found. Trying to connect...");
		} catch (InstantiationException e) {
			System.out.println("Driver not found");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.out.println("Driver not found");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found");
		}
		try {
			connection=DriverManager.getConnection(connectStatement);
			System.out.println("Connection successful");
		} catch (SQLException e) {
			System.out.println("Could not connect to database");
		}
	}
	
	public static void main(String[] args) {
		connect();
		try {
			Person.insertPerson("Morten", "Jansrud", "Teknisk Kybernetikk", 1991);
			Person.printPersonContent();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
