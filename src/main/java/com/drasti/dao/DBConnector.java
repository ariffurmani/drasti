package com.drasti.dao;

import java.sql.*;

public class DBConnector {

	private static final String URL = "jdbc:mysql://localhost:3306/drasti";
	private static final String UNAME = "root";
	private static final String PASSWORD = "furmani";
	private static final String QUERY = "select * from info where barcode=";

	public static Boolean checkData(String[] data) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL, UNAME, PASSWORD);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(QUERY + data[0]);
			if (rs.next()) {

				String dbBarcode = rs.getString(1) + "\n\n";
				String dbFirstName = rs.getString(2) + "\n\n";
				String dbLastName = rs.getString(3) + "\n\n";
				String dbCity = rs.getString(4) + "\n\n";
				String dbState = rs.getString(5) + "\n\n";

//				System.out.println("Barcode:" + dbBarcode);
//				System.out.println("FirstName:" + dbFirstName);
//				System.out.println("LastName:" + dbLastName);
//				System.out.println("City:" + dbCity);
//				System.out.println("State:" + dbState);
//				System.out.println("Barcode found");

				if (data[1].equalsIgnoreCase(dbFirstName) && data[2].equalsIgnoreCase(dbLastName)
						&& data[3].equalsIgnoreCase(dbState) && data[4].equalsIgnoreCase(dbCity)) {
//					System.out.println("match found");
					return true;
				} else {
//					System.out.println("match not found");
					return false;
				}
			} else {
//				System.out.println("Invalid Certificate");
				return false;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
