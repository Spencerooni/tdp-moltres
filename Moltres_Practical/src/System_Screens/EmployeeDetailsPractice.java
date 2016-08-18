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
			      //"SELECT first_name FROM employee");
			
			
			
			"select concat(first_name, ' ',last_name) 'name', department_name from employee join "
			+ "employee_department on employee.employee_no = employee_department.employee_no join "
			+ "department on employee_department.department_no = department.department_no order "
			+ "by department_name");
			
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter
					("home/tdp-moltres/employeeList.txt")),true);
			while(rs.next())
			{
				
				outt = String.format("%s is in %s.", 
				rs.getString("name"), rs.getString("department_name"));
				
			   out.write(outt);
			   
			   //outt  = rs.getString("first_name");
			   
			   System.out.println(outt);
			}
			
			
			
			
			
			
			out.flush();
			out.close();
			
			System.out.println("file has been written");
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e)
		{
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
