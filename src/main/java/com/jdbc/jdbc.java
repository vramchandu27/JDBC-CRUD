package com.jdbc;
import java.sql.*;
public class jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	        String url="jdbc:mysql://localhost:3306/AIRINDIA";
	        String username="root";
	        String pass="ramchandu@#$55";
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection(url,username,pass);
	        Statement st = con.createStatement();
	        ResultSet rs = st.executeQuery("select * from PASSDETAILS");
	        
	        while(rs.next())
	        {
	        rs.getInt("LOGINID");
	        System.out.println(rs.getInt("LOGINID") +   ":"   +  rs.getInt("PASSENGERPASSWORD")+  ":"  +   rs.getString("FROMCITY")  +  ":"  +  rs.getString  ("TOCITY"));
	        }
	}
}

