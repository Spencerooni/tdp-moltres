package System_Screens;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;

import Employee.Employee;

public class EnterEmployeeDetails_Screen {
	private JFrame screen;
	private Button saveBtn;
	private JPanel left;
	// private JScrollPane finished;
	private JLabel instructions;

	
	private JLabel IDLbl, fNameLbl, lNameLbl, oNameLbl, 
	addressLbl, cityLbl, countryLbl,
	postcodeLbl, NINumberLbl, bankNameLbl, 
	accountNumLbl, sortCodeLbl, cardNameLbl, 
	IBANLbl, BICLbl, salaryLbl;

	private JTextField IDTxt, fNameTxt, lNameTxt, oNameTxt, 
	addressTxt, cityTxt, countryTxt,
	postcodeTxt, NINumberTxt, bankNameTxt, 
	accountNumTxt, sortCodeTxt, cardNameTxt, 
	IBANTxt, BICTxt, salaryTxt;

	private Connection connection;

	public EnterEmployeeDetails_Screen(Connection conn) {

		connection = conn;
		screen = new JFrame("Employee Details");
		saveBtn = new Button("Create Employee");
		saveBtn.setSize(200, 100);
		left = new JPanel();

		instructions = new JLabel("Please enter the employees information: ");

		screen.setSize(700, 500); // FORM 800w 1000h
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screen.setLocationRelativeTo(null);
		screen.setVisible(true);
		screen.setResizable(false);

		// Same size as the window
		left.setPreferredSize(new Dimension(700, 1000));
		left.setLayout(new FlowLayout(FlowLayout.CENTER, 300, 10));
		left.setBorder(new EtchedBorder());

		IDLbl = new JLabel("ID: ");
		fNameLbl = new JLabel("First Name: ");
		lNameLbl = new JLabel("Last Name: ");
		oNameLbl = new JLabel("Other Given Name(s): ");
		addressLbl = new JLabel("Address: ");
		cityLbl = new JLabel("City: ");
		countryLbl = new JLabel("Country: ");
		postcodeLbl = new JLabel("Postcode: ");
		NINumberLbl = new JLabel("NI Number: ");
		bankNameLbl = new JLabel("Bank Name: ");
		accountNumLbl = new JLabel("Account Number: ");
		sortCodeLbl = new JLabel("Sort Code: ");
		cardNameLbl = new JLabel("Card Holder Name: ");
		IBANLbl = new JLabel("IBAN: ");
		BICLbl = new JLabel("Bank ID Code: ");
		salaryLbl = new JLabel("Salary: ");

		IDTxt = new JTextField(20);
		fNameTxt = new JTextField(20);
		lNameTxt = new JTextField(20);
		oNameTxt = new JTextField(20);
		addressTxt = new JTextField(20);
		cityTxt = new JTextField(20);
		countryTxt = new JTextField(20);
		postcodeTxt = new JTextField(20);
		NINumberTxt = new JTextField(20);
		bankNameTxt = new JTextField(20);
		accountNumTxt = new JTextField(20);
		sortCodeTxt = new JTextField(20);
		cardNameTxt = new JTextField(20);
		IBANTxt = new JTextField(20);
		BICTxt = new JTextField(20);
		salaryTxt = new JTextField(20);

		left.add(instructions);
		
		left.add(IDLbl);
		left.add(IDTxt);
		
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

		left.add(countryLbl);
		left.add(countryTxt);

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
		JScrollPane finished = new JScrollPane(left, i, j);
		finished.setSize(700, 500);

		saveBtn.addActionListener(new ActionListener() { // when save button
															// clicked
			public void actionPerformed(ActionEvent e) {
				Employee employee = new Employee(fNameTxt.getText(), lNameTxt.getText(), oNameTxt.getText(),
						addressTxt.getText(), cityTxt.getText(), countryTxt.getText(), postcodeTxt.getText(),
						NINumberTxt.getText(), Double.parseDouble(salaryTxt.getText()), bankNameTxt.getText(),
						accountNumTxt.getText(), sortCodeTxt.getText(), cardNameTxt.getText(), IBANTxt.getText(),
						BICTxt.getText());
				String query = " insert into employee(first_name, last_name, other_names, address, city, country, postcode, NI_no, starting_salary) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
				PreparedStatement preparedStmt;
				try {
					preparedStmt = connection.prepareStatement(query);
					preparedStmt.setString(1, employee.getF_name());
					preparedStmt.setString(2, employee.getL_name());
					preparedStmt.setString(3, employee.getO_names());
					preparedStmt.setString(4, employee.getAddress());
					preparedStmt.setString(5, employee.getCity());
					preparedStmt.setString(6, employee.getCountry());
					preparedStmt.setString(7, employee.getPostcode());
					preparedStmt.setString(8, employee.getNi_num());
					preparedStmt.setDouble(9, employee.getStarting_sal());

					preparedStmt.execute();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		screen.add(finished);

	}

}
