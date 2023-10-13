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

public class ForgotPage extends JFrame implements ActionListener{
	
	JButton homeButton = new JButton("HOME");
	JButton searchButton = new JButton("Search...");
	JButton finishButton = new JButton("Finish");
	
	ForgotPage(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 550);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 82, 884, 100);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(0, 411, 884, 100);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Enter Recovery Email:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(286, 193, 251, 47);
		contentPane.add(lblNewLabel);
		
		JTextField textField = new JTextField();
		textField.setBounds(336, 236, 150, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("*Link to change password/username will be sent to email address*");
		lblNewLabel_3.setBounds(256, 262, 405, 18);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("*Once changed sign in as per usual*");
		lblNewLabel_4.setBounds(328, 280, 209, 14);
		contentPane.add(lblNewLabel_4);
		
		finishButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		finishButton.setBounds(369, 305, 89, 23);
		finishButton.addActionListener(this);
		contentPane.add(finishButton);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==homeButton) {
			dispose();
			HomePage homepage = new HomePage();
			homepage.setVisible(true);
		}
		else if(e.getSource()==searchButton) {
			dispose();
			SearchResults searchPage = new SearchResults();
			searchPage.setVisible(true);
		}
		else if(e.getSource()==finishButton) {
			dispose();
			HomePage homepage = new HomePage();
			homepage.setVisible(true);
		}
	}
}