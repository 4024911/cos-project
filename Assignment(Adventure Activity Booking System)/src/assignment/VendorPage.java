package assignment;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class VendorPage extends JFrame implements ActionListener{
	
	JButton searchButton = new JButton("Search...");
	JButton signInButton = new JButton("Sign In");
	JButton userProfileButton = new JButton("My Profile");
	
	VendorPage(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 550);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ESCape");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setBounds(363, 11, 138, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Escape the Boredom, Embrace the Adventure");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(295, 56, 288, 18);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 79, 884, 100);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(64, 252, 200, 200);
		contentPane.add(panel_1);
		
		JTextArea txtrTitleDescriptionLocation = new JTextArea();
		txtrTitleDescriptionLocation.setBackground(SystemColor.menu);
		txtrTitleDescriptionLocation.setText("Title...\r\nDescription...\r\nPrice...\r\nLocation...\r\nReviews...");
		txtrTitleDescriptionLocation.setFont(new Font("Times New Roman", Font.BOLD, 30));
		txtrTitleDescriptionLocation.setBounds(363, 252, 400, 200);
		contentPane.add(txtrTitleDescriptionLocation);
		
		JButton btnNewButton = new JButton("Book Now!");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(108, 463, 111, 23);
		contentPane.add(btnNewButton);
		
		searchButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		searchButton.setBounds(757, 11, 102, 23);
		searchButton.addActionListener(this);
		contentPane.add(searchButton);
		
		signInButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		signInButton.setBounds(10, 11, 102, 23);
		signInButton.addActionListener(this);
		contentPane.add(signInButton);
		
		userProfileButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		userProfileButton.setBounds(10, 38, 102, 23);
		userProfileButton.addActionListener(this);
		contentPane.add(userProfileButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==searchButton) {
			dispose();
			SearchResults searchPage = new SearchResults();
			searchPage.setVisible(true);
		}
		else if(e.getSource()==signInButton) {
			dispose();
			SignInPage signInPage = new SignInPage();
			signInPage.setVisible(true);			
		}
		else if(e.getSource()==userProfileButton) {
			dispose();
			UserProfile userProfile = new UserProfile();
			userProfile.setVisible(true);			
		}
	}
}