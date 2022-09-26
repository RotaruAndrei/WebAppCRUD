package com.project.JDBCTest;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JDBCTest
 */
@WebServlet("/JDBCTest")
public class JDBCTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// set up variables
		String user = "Dedei";
		String pass = "admin";
		String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/?user=Dedei";
		String driver = "com.mysql.jdbc.Driver";
		
		//get a connection
		
		try {
			
			PrintWriter out = response.getWriter();
			out.print("Connecting to the database...");
			Class.forName(driver);
			Connection con = DriverManager.getConnection(jdbcUrl,user,pass);
			out.print("Connection successful please procede");
			con.close();
			
		} catch(Exception e) {e.printStackTrace();}
	}

}
