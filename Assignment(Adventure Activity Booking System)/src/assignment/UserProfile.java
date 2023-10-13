package assignment;

import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class UserProfile extends JFrame implements ActionListener{
	
	JButton searchButton = new JButton("Search...");
	JButton signInButton = new JButton("Sign In");
	
	UserProfile(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 550);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 79, 884, 100);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setForeground(Color.WHITE);
		panel_1.setBounds(50, 253, 200, 200);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("About...");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(355, 253, 71, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Upcoming Bookings...");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(526, 253, 104, 24);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Reviews...");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(714, 256, 86, 18);
		contentPane.add(lblNewLabel_2_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.menu);
		textArea.setText("_________________\r\n_________________\r\n_________________\r\n_________________");
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textArea.setBounds(327, 288, 120, 150);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(SystemColor.menu);
		textArea_1.setText("_______________\r\n_______________\r\n_______________\r\n_______________");
		textArea_1.setBounds(520, 288, 120, 150);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBackground(SystemColor.menu);
		textArea_2.setText("_______________\r\n_______________\r\n_______________\r\n_______________");
		textArea_2.setBounds(698, 288, 120, 150);
		contentPane.add(textArea_2);
		
		JLabel lblNewLabel_3 = new JLabel("Username");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setBounds(110, 464, 104, 18);
		contentPane.add(lblNewLabel_3);
		
		searchButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		searchButton.setBounds(772, 11, 102, 23);
		searchButton.addActionListener(this);
		contentPane.add(searchButton);
		
		JLabel lblNewLabel1 = new JLabel("ESCape");
		lblNewLabel1.setForeground(Color.RED);
		lblNewLabel1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel1.setBounds(353, -1, 173, 47);
		contentPane.add(lblNewLabel1);
		
		JLabel lblNewLabel_11 = new JLabel("Escape the boredom, Embrace the Adventure");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_11.setBounds(280, 47, 286, 14);
		contentPane.add(lblNewLabel_11);
		
		signInButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		signInButton.setBounds(10, 11, 102, 23);
		signInButton.addActionListener(this);
		contentPane.add(signInButton);
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
	}
}