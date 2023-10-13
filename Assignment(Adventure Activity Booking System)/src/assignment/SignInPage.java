package assignment;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SignInPage extends JFrame implements ActionListener{
	
	JButton forgotButton = new JButton("Forgot Username/Password?");
	JButton signUpButton = new JButton("Sign Up");
	JButton nextButton = new JButton("Next");
	JButton homeButton = new JButton("HOME");
	JButton searchButton = new JButton("Search...");
	
	SignInPage(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 550);
		JPanel contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 255));
		panel.setBounds(0, 81, 884, 100);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Sign in:");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(355, 192, 87, 31);
		contentPane.add(lblNewLabel);
		
		JTextField txtUsername = new JTextField();
		txtUsername.setText("Username...");
		txtUsername.setBounds(325, 246, 150, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JTextField txtPassword = new JTextField();
		txtPassword.setText("Password...");
		txtPassword.setColumns(10);
		txtPassword.setBounds(325, 267, 150, 20);
		contentPane.add(txtPassword);
		
		forgotButton.setBounds(297, 331, 200, 20);
		forgotButton.addActionListener(this);
		contentPane.add(forgotButton);
		
		signUpButton.setBounds(325, 352, 150, 20);
		signUpButton.addActionListener(this);
		contentPane.add(signUpButton);
		
		nextButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		nextButton.setBackground(new Color(255, 0, 0));
		nextButton.setBounds(367, 298, 60, 20);
		nextButton.addActionListener(this);
		contentPane.add(nextButton);
		
		JLabel lblNewLabel_1 = new JLabel("ESCape");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel_1.setBounds(336, 11, 150, 47);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Escape the Boredom, Embrace the Adventure");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setBounds(268, 56, 295, 20);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(0, 411, 884, 100);
		contentPane.add(panel_1);
		
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
		else if(e.getSource()==forgotButton) {
			dispose();
			ForgotPage forgotPage = new ForgotPage();
			forgotPage.setVisible(true);
		}
        else if(e.getSource()==signUpButton) {
        	dispose();
			SignUpPage signUpPage = new SignUpPage();
			signUpPage.setVisible(true);
		}
        else if(e.getSource()==nextButton) {
        	dispose();
			HomePage homePage = new HomePage();
			homePage.setVisible(true);
		}
        else if(e.getSource()==searchButton) {
        	dispose();
			SearchResults searchPage = new SearchResults();
			searchPage.setVisible(true);
        }		
	}	
}