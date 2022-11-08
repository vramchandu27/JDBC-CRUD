package com.jdbc;

import java.sql.*;
public class updateoperation {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
	     int lOGINID=235;
		 int PASSENGERPASSWORD=2468563;
		 
		 
		 String url="jdbc:mysql://localhost:3306/AIRINDIA";
	        String username="root";
	        String pass="ramchandu@#$55";
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection(url,username,pass);
	        Statement st = con.createStatement();
	     //updating data into database
	        int x = st.executeUpdate("UPDATE PASSDETAILS set LOGINID = '" + lOGINID  +  "' WHERE PASSENGERPASSWORD = '" +PASSENGERPASSWORD+ "'");
	        System.out.println("Updated successfully");
            
            con.close();
	}
}
 
   