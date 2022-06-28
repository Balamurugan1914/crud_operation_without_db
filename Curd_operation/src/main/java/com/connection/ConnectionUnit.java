package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class ConnectionUnit {

	

	public static Connection getPostConnection() {
		Connection con = null;

		ResourceBundle app = ResourceBundle.getBundle("appilication");

		try {

			String Url = app.getString("datasource.postgres.url");
			String username = app.getString("datasource.postgres.username");
			String password = app.getString("datasource.postgres.password");
		String driverClass	=app.getString("datasource.postgres.driverclass");
			Class.forName(driverClass);

			con = DriverManager.getConnection(Url, username, password);

		} catch (Exception e) {
			System.out.println(e);
		}

		return con;

	}

}
