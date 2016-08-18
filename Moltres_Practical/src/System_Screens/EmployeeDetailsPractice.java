package System_Screens;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


public class EmployeeDetailsPractice 
{
	
	public static void main(String [] arags)
	{	
		Connection conn;
		Statement st;
		ResultSet rs;
		String outt;
				
		try
		{
			Class driver = Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/moltresDB?useSSL=false","root","password");
			
			st = conn.createStatement();
			rs = st.executeQuery(
			      "SELECT first_name FROM employee");
			while(rs.next())
			{
			   //String out = String.format("%s", 
			   //rs.getString("first_name"));
			   
			   outt  = rs.getString("first_name");
			   
			   System.out.println(outt);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	/*	try
		{
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter
					("home/trainee/employeeList.txt")),true);
			
			
			
			out.write(outt);
			
			
			out.flush();
			out.close();
			
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		*/
		
	}
	
}
