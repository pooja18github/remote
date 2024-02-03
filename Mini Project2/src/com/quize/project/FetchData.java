package com.quize.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchData {
     public static void main(String[] args) throws Exception
     {
    	 Class.forName("com.mysql.jdbc.Driver");
    	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quize", "root","root");
    	 
    	 PreparedStatement ps = con.prepareStatement("SELECT Score FROM studentdetails BY id");
    	 ResultSet rs = ps.executeQuery();
    	 
    	 while(rs.next())
    	 {
    		 int id=rs.getInt("Id");
    		 System.out.println("Id :"+id);
    		
    		 int score=rs.getInt("Score");
    		 System.out.println("Score :"+score);
    		 System.out.println("-------------------------------------------------------");
    	 } 	 
    	 
	}
}


