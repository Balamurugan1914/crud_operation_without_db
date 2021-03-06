package com.connection;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
public class ConnectionSource {

	public static Connection getConnection() {

		Connection con = null;

		ResourceBundle file = ResourceBundle.getBundle("connection");

		try {

			String Driver_class = file.getString("Driverclass");
			String URL = file.getString("url");
			String username = file.getString("username");
			String password = file.getString("password");

			Class.forName(Driver_class);

			con = DriverManager.getConnection(URL,username,password);

		} catch (SQLException | ClassNotFoundException e) {
			// TODO: handle exception

			e.printStackTrace();

		}

		return con;

	}
}
