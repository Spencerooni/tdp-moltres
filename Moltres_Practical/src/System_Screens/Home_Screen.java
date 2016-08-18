package System_Screens;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;

public class Home_Screen {

	private JLabel intro;
	private JButton newEmployeeBtn;
	private JButton printEmployeeBtn;
	
	private JFrame screen;
	private JPanel panel;
	
	public Home_Screen(){
		intro = new JLabel("Welcome User! :D");
		
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
				new EnterEmployeeDetails_Screen();
			}
		}); 
		
		printEmployeeBtn.addActionListener(new ActionListener() {		//when save button clicked
			public void actionPerformed(ActionEvent e){
				//code here for pushing text to the DB
			}
		}); 
		
	}
	
}
