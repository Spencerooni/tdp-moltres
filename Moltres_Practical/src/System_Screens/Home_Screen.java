package System_Screens;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class Home_Screen {

	private JLabel intro;
	private JButton newEmployeeBtn;
	private JButton printEmployeeBtn;
	
	private JFrame screen;
	private JPanel panel;
	private Connection connection;
	private String outt;
	private Statement st;
	private ResultSet rs;
	
	
	public Home_Screen(Connection conn){
		intro = new JLabel("Welcome User! :D");
		connection=conn;
		screen = new JFrame("Home Screen");
		screen.setSize(500, 500);							
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screen.setLocationRelativeTo(null);
		screen.setVisible(true);
		screen.setResizable(false);
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(700,1000));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER,300,10));
		panel.setBorder(new EtchedBorder());
		
		newEmployeeBtn = new JButton();
		ImageIcon newEmp = new ImageIcon("images/newEmp.png");
		newEmployeeBtn.setSize(200, 100);
		newEmployeeBtn.setIcon(newEmp);
		
		printEmployeeBtn = new JButton();
		ImageIcon printEmp = new ImageIcon("images/printEmp.jpg");
		printEmployeeBtn.setSize(200, 100);
		printEmployeeBtn.setIcon(printEmp);
		
		panel.add(intro);
		panel.add(newEmployeeBtn);
		panel.add(printEmployeeBtn);
		
		screen.add(panel);	
		
		
		newEmployeeBtn.addActionListener(new ActionListener() {		//when save button clicked
			public void actionPerformed(ActionEvent e){
				new EnterEmployeeDetails_Screen(connection);
			}
		}); 
		
		printEmployeeBtn.addActionListener(new ActionListener() 
		{		//when save button clicked
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					st = conn.createStatement();
					rs = st.executeQuery(
					
					"select concat(first_name, ' ',last_name) 'name', department_name from employee join "
					+ "employee_department on employee.employee_no = employee_department.employee_no join "
					+ "department on employee_department.department_no = department.department_no order "
					+ "by department_name");
					
					PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter
							("/home/trainee/tdp-moltres/employeeList.txt")),true);
					while(rs.next())
					{
						
						outt = String.format("%s is in %s\n", 
						rs.getString("name"), rs.getString("department_name"));
						
					   out.write(outt);
					   
					   //outt  = rs.getString("first_name");
					   
					   System.out.println(outt);
					   
					   
					}
						
					out.flush();
					out.close();
					
					System.out.println("file has been written");
					JOptionPane.showMessageDialog(screen, "Data successfully written to text file called employeeList.txt");
				}
				catch(SQLException e1)
				{
					e1.printStackTrace();
				} 
		
				catch(IOException e2)
				{
					e2.printStackTrace();
				}
			}
		}); 
		
	}
	
}
