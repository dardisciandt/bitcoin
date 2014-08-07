package com.test.ut;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLServerTest {
	public static void main(String[] args) {
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");

			String userName = "dardis";
			String password = "Password1";
			String url = "jdbc:jtds:sqlserver://localhost:1433/master;user=dardis;password=dardis;";
			Connection con = DriverManager.getConnection(url);
			Statement s1 = con.createStatement();
			ResultSet rs = s1
					.executeQuery("SELECT TOP 1 * FROM HumanResources.Employee");
			String[] result = new String[20];
			if (rs != null) {
				while (rs.next()) {
					for (int i = 0; i < result.length; i++) {
						for (int j = 0; j < result.length; j++) {
							result[j] = rs.getString(i);
							System.out.println(result[j]);
						}
					}
				}
			}

			// String result = new result[20];

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
