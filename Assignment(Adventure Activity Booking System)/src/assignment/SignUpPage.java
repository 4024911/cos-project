package assignment;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SignUpPage extends JFrame implements ActionListener{
	
	JButton searchButton = new JButton("Search...");
	JButton nextButton = new JButton("Next");
	JButton homeButton = new JButton("HOME");
	JTextField txtFirstName = new JTextField();
	JTextField txtSurname = new JTextField();
	JTextField txtEmailAddress = new JTextField();
	JTextField txtPhoneNumber = new JTextField();
	JTextField txtUsername = new JTextField();
	File file = new File("UserData.txt");
	
	SignUpPage(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 550);
		JPanel contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 255));
		panel.setBounds(0, 87, 884, 61);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 0));
		panel_1.setBounds(0, 450, 884, 61);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Sign Up:");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(357, 173, 98, 31);
		contentPane.add(lblNewLabel);
		
		nextButton.setBackground(new Color(255, 0, 0));
		nextButton.setBounds(367, 413, 73, 20);
		nextButton.addActionListener(this);
		contentPane.add(nextButton);
		
		txtFirstName.setText("First name...");
		txtFirstName.setBounds(336, 215, 150, 22);
		contentPane.add(txtFirstName);
		txtFirstName.setColumns(10);

		txtSurname.setText("Last name...");
		txtSurname.setColumns(10);
		txtSurname.setBounds(336, 248, 150, 20);
		contentPane.add(txtSurname);
		
		txtEmailAddress.setText("Email Address...");
		txtEmailAddress.setColumns(10);
		txtEmailAddress.setBounds(336, 279, 150, 20);
		contentPane.add(txtEmailAddress);
		
		txtPhoneNumber.setText("Phone number...");
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBounds(336, 310, 150, 20);
		contentPane.add(txtPhoneNumber);
		
		Checkbox checkbox = new Checkbox("I accept the terms and service agreement");
		checkbox.setBounds(307, 385, 219, 22);
		contentPane.add(checkbox);
		
		txtUsername.setText("Create Username...");
		txtUsername.setBounds(336, 341, 150, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Subscribe to our email newsletter for Discounts and Special Offers");
		chckbxNewCheckBox.setBounds(222, 368, 405, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_1 = new JLabel("ESCape");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel_1.setBounds(336, 11, 150, 47);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Escape the Boredom, Embrace the Adventure");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setBounds(268, 56, 295, 20);
		contentPane.add(lblNewLabel_2);
		
		homeButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		homeButton.setBounds(10, 11, 100, 23);
		homeButton.addActionListener(this);
		contentPane.add(homeButton);
		
		searchButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		searchButton.setBounds(774, 11, 100, 23);
		searchButton.addActionListener(this);
		contentPane.add(searchButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==homeButton) {
			dispose();
			HomePage homePage = new HomePage();
			homePage.setVisible(true);
		}
		else if(e.getSource()==nextButton) {
	        dispose();
			HomePage homePage = new HomePage();
			homePage.setVisible(true);
				try {
					FileWriter writer = new FileWriter(file);
					String a = "Firstname: " + txtFirstName.getText() + "\nSurname: " + txtSurname.getText() + "\nEmail Address: " + txtEmailAddress.getText() + "\nPhone Number: " + txtPhoneNumber.getText() + "\nUsername: " + txtUsername.getText();
					writer.append(a);
					writer.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
		}
	    else if(e.getSource()==searchButton) {
	        	dispose();
				SearchResults searchPage = new SearchResults();
				searchPage.setVisible(true);
	    }		
	}
}