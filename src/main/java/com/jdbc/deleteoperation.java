package com.jdbc;

import java.sql.*;

public class deleteoperation {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url="jdbc:mysql://localhost:3306/AIRINDIA";
        String username="root";
        String pass="ramchandu@#$55";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,pass);
        Statement st = con.createStatement();
        
        String q1 = "delete from  PASSDETAILS " +
                "where lOGINID=666";
        st.executeUpdate(q1);
          System.out.println("record deleted sucessfully");
        
	}
	

}
