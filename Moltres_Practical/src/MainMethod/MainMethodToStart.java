package MainMethod;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import System_Screens.Home_Screen;

public class MainMethodToStart 
{
static Connection conn;
	public static void main(String[] args) 
	{
		Runnable runnner = new Runnable() 
		{
			@Override
			public void run() 
			{
				try {
					Class driver = Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					conn = 
					      DriverManager.getConnection("jdbc:mysql://localhost/moltresDB?useSSL=false", 
					            "root", "password");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				new Home_Screen(conn);
			}
		};
		EventQueue.invokeLater(runnner);

	}

}
