package com.jdbc;

import java.sql.*;

public class insertoperation {
 
	 public static void main(String args[]) throws ClassNotFoundException, SQLException
	 {
		 int lOGINID=345;
		 int PASSENGERPASSWORD=674538;
		 String FROMCITY="america";
		 String TOCITY="SPAIN";
		 
		 String url="jdbc:mysql://localhost:3306/AIRINDIA";
	        String username="root";
	        String pass="ramchandu@#$55";
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection(url,username,pass);
	        Statement st = con.createStatement();
	       
	        ///INSERTING DATA IN DATABASE
	        int x = st.executeUpdate("insert into PASSDETAILS values('" +lOGINID+ "',  '" +PASSENGERPASSWORD+ "','"+FROMCITY+"','"+TOCITY+"')");
	        if (x > 0)   
	            System.out.println("Successfully Inserted");   
	           else   
	            System.out.println("Insert Failed");
	           st.close();
	           con.close();
	 }
	
}
