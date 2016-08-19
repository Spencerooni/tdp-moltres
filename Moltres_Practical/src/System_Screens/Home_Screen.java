package System_Screens;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class Home_Screen {

	private JLabel intro;
	private JButton newEmployeeBtn;
	private JButton printEmployeeBtn;
	
	private JFrame screen;
	private JPanel panel;
	private Connection connection;
	
	
	public Home_Screen(Connection conn){
		intro = new JLabel("Welcome User! :D");
		connection=conn;
		screen = new JFrame("Home Screen");
		screen.setSize(700, 700);						
		screen.setLayout(new GridLayout());
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screen.setLocationRelativeTo(null);
		screen.setVisible(true);
		screen.setResizable(false);
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(700,1000));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER,100,100));
		panel.setBorder(new EtchedBorder());
		
		newEmployeeBtn = new JButton();
		ImageIcon newEmp = new ImageIcon("images/newEmp.png");
		newEmployeeBtn.setSize(300, 300);
		newEmployeeBtn.setIcon(newEmp);
		
		printEmployeeBtn = new JButton();
		ImageIcon printEmp = new ImageIcon("images/printEmp.jpg");
		printEmployeeBtn.setSize(300, 300);
		printEmployeeBtn.setIcon(printEmp);
		
		panel.add(intro);
		panel.add(newEmployeeBtn);
		panel.add(printEmployeeBtn);
		
		screen.add(panel);	
		
		
		newEmployeeBtn.addActionListener(new ActionListener() {		//when save button clicked
			public void actionPerformed(ActionEvent e){
				new EnterEmployeeDetails_Screen(connection);
				screen.dispose();
			}
		}); 
		
		printEmployeeBtn.addActionListener(new ActionListener() {		//when save button clicked
			public void actionPerformed(ActionEvent e){
				//screen.dispose();
			}
		}); 
		
	}
	
}
