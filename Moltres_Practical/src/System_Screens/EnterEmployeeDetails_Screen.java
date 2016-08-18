package System_Screens;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EnterEmployeeDetails_Screen {
	private JFrame screen;
	private Button saveBtn;
	private JPanel left;
	//private JScrollPane finished;
	private JLabel instructions;

	private JLabel fNameLbl, lNameLbl, oNameLbl, 
	addressLbl, cityLbl, countyLbl,
	postcodeLbl, NINumberLbl, bankNameLbl, 
	accountNumLbl, sortCodeLbl, cardNameLbl, 
	IBANLbl, BICLbl, salaryLbl;

	private JTextField fNameTxt, lNameTxt, oNameTxt, 
	addressTxt, cityTxt, countyTxt,
	postcodeTxt, NINumberTxt, bankNameTxt, 
	accountNumTxt, sortCodeTxt, cardNameTxt, 
	IBANTxt, BICTxt, salaryTxt;

	public EnterEmployeeDetails_Screen(){

		screen = new JFrame("Employee Details");
		saveBtn = new Button();
		saveBtn.setSize(200, 100);
		left = new JPanel();

		instructions = new JLabel("Please enter the employees information: ");

		screen.setSize(700, 500);								//FORM 800w 1000h
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screen.setLocationRelativeTo(null);
		screen.setVisible(true);
		screen.setResizable(false);

		//Same size as the window
		left.setPreferredSize(new Dimension(700,1000));
		left.setLayout(new FlowLayout(FlowLayout.CENTER,300,10));
		left.setBorder(new EtchedBorder());

		fNameLbl = new JLabel("First Name: ");
		lNameLbl = new JLabel("Last Name: ");
		oNameLbl = new JLabel("Other Given Name(s): ");
		addressLbl = new JLabel("Address: ");
		cityLbl = new JLabel("City: ");
		countyLbl = new JLabel("County: ");
		postcodeLbl = new JLabel("Postcode: ");
		NINumberLbl = new JLabel("NI Number: ");
		bankNameLbl = new JLabel("Bank Name: ");
		accountNumLbl = new JLabel("Account Name: ");
		sortCodeLbl = new JLabel("Sort Code: ");
		cardNameLbl = new JLabel("Card Name: ");
		IBANLbl = new JLabel("IBAN: ");
		BICLbl = new JLabel("Bank ID Code: ");
		salaryLbl = new JLabel("Salary: ");

		fNameTxt = new JTextField(50);
		lNameTxt = new JTextField(50);
		oNameTxt = new JTextField(50);
		addressTxt = new JTextField(50);
		cityTxt = new JTextField(60);
		countyTxt = new JTextField(30);
		postcodeTxt = new JTextField(7);
		NINumberTxt = new JTextField(9);
		bankNameTxt = new JTextField(30);
		accountNumTxt = new JTextField(8);
		sortCodeTxt = new JTextField(6);
		cardNameTxt = new JTextField(50);
		IBANTxt = new JTextField(22);
		BICTxt = new JTextField(11);
		salaryTxt = new JTextField(10);

		left.add(instructions);
		left.add(fNameLbl);
		left.add(fNameTxt);

		left.add(lNameLbl);
		left.add(lNameTxt);

		left.add(oNameLbl);
		left.add(oNameTxt);

		left.add(addressLbl);
		left.add(addressTxt);

		left.add(cityLbl);
		left.add(cityTxt);

		left.add(countyLbl);
		left.add(countyTxt);

		left.add(postcodeLbl);
		left.add(postcodeTxt);

		left.add(NINumberLbl);
		left.add(NINumberTxt);

		left.add(bankNameLbl);
		left.add(bankNameTxt);

		left.add(accountNumLbl);
		left.add(accountNumTxt);

		left.add(sortCodeLbl);
		left.add(sortCodeTxt);

		left.add(cardNameLbl);
		left.add(cardNameTxt);

		left.add(IBANLbl);
		left.add(IBANTxt);

		left.add(BICLbl);
		left.add(BICTxt);

		left.add(salaryLbl);
		left.add(salaryTxt);
		
		left.add(saveBtn);

		int i = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int j = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane finished = new JScrollPane(left,i,j);
		finished.setSize(700, 500);

		
		saveBtn.addActionListener(new ActionListener() {		//when save button clicked
			public void actionPerformed(ActionEvent e){
				//code here for pushing text to the DB
			}
		});   

		screen.add(finished);

	}

}
