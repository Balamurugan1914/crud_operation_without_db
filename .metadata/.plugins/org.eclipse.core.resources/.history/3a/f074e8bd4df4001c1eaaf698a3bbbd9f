package com.training.util;

import java.sql.*;
import java.util.ResourceBundle;

import com.demo.service.BookService;
public class ConnectionFactory {

	public static Connection getpostgresqlconnection() {

		Connection con = null;

		ResourceBundle labels = ResourceBundle.getBundle("appilication"); // to implement the appilication.properties

		try {
			String url = labels.getString("datasource.postgres.url");
			String username = labels.getString("datasource.postgres.username");
			String password = labels.getString("datasource.postgres.password");

			String driverclass = labels.getString("datasource.postgres.driverclass");

			Class.forName(driverclass);
			
//			BookService service = new BookService(); //normal instance
//			Class <> cls = Class.forName("com.demo.service.BookService");
//			BookService 
			

			con = DriverManager.getConnection(url, username, password);

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return con;

	}
}
