package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DBConnection;

public class Person {
	private String firstName;
	private String lastName;
	private String fieldOfStudy;
	private int birthYear;
	
	public Person(String firstName, String lastName, String fieldOfStudy, int birthYear) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.fieldOfStudy = fieldOfStudy;
		this.birthYear = birthYear;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFieldOfStudy() {
		return fieldOfStudy;
	}

	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}
	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public static void insertPerson(String firstName, String lastName, String fieldOfStudy, int birthYear) throws SQLException{
		String create="INSERT INTO PERSONS (firstName, lastName, fieldOfStudy, birthYear) VALUES (?, ?, ?, ?)";
		PreparedStatement ps=DBConnection.connection.prepareStatement(create);
		ps.setString(1, firstName);
		ps.setString(2, lastName);
		ps.setString(3, fieldOfStudy);
		ps.setInt(4, birthYear);
		ps.executeUpdate();
		ps.close();
	}
	public static void deletePerson(String firstName, String lastName) throws SQLException{
		String delete="DELETE FROM PERSONS WHERE firstName=? AND lastName=?";
		PreparedStatement ps=DBConnection.connection.prepareStatement(delete);
		ps.setString(1, firstName);
		ps.setString(2, lastName);
		ps.executeUpdate();
	}
	public static void printPersonContent() throws SQLException{
		String content="SELECT * FROM PERSONS";
		PreparedStatement ps=DBConnection.connection.prepareStatement(content);
		ResultSet rs=ps.executeQuery();
		while(rs.next()==true){
			System.out.print(rs.getString("firstName")+" ");
			System.out.print(rs.getString("lastName")+", ");
			System.out.print(rs.getString("fieldOfStudy")+", ");
			System.out.print(rs.getInt("birthYear"));
			System.out.println();
		}
		ps.close();
		rs.close();
	}
}
