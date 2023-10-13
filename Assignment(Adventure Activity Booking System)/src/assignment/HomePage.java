package assignment;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.border.EmptyBorder;

public class HomePage extends JFrame implements ActionListener{
	
	JButton searchButton = new JButton("Search...");
	JButton signInButton = new JButton("Sign In");
	JButton profileButton = new JButton("My Profile");
	JButton view1Button = new JButton("View...");
	JButton view2Button = new JButton("View...");
	JButton view3Button = new JButton("View...");

	HomePage(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 550);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 72, 874, 100);
		contentPane.add(panel);
		
		searchButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		searchButton.setBounds(757, 16, 102, 23);
		searchButton.addActionListener(this);
		contentPane.add(searchButton);
		
		JLabel lblNewLabel = new JLabel("ESCape");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setBounds(353, -1, 173, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Escape the boredom, Embrace the Adventure");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(280, 47, 286, 14);
		contentPane.add(lblNewLabel_1);
		
		signInButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		signInButton.setBounds(10, 11, 102, 23);
		signInButton.addActionListener(this);
		contentPane.add(signInButton);
		
		profileButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		profileButton.setBounds(10, 38, 102, 23);
		profileButton.addActionListener(this);
		contentPane.add(profileButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 0));
		panel_1.setBounds(10, 229, 400, 200);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Trending...");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(600, 189, 96, 29);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 255));
		panel_2.setBounds(460, 229, 50, 50);
		contentPane.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.BLUE);
		panel_2_1.setBounds(460, 302, 50, 50);
		contentPane.add(panel_2_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(Color.BLUE);
		panel_2_2.setBounds(460, 379, 50, 50);
		contentPane.add(panel_2_2);
		
		JLabel lblNewLabel_3 = new JLabel("______________________________________");
		lblNewLabel_3.setBounds(520, 229, 240, 14);
		contentPane.add(lblNewLabel_3);
		
		view1Button.setFont(new Font("Tahoma", Font.BOLD, 11));
		view1Button.setBounds(757, 244, 102, 23);
		view1Button.addActionListener(this);
		contentPane.add(view1Button);
		
		view2Button.setFont(new Font("Tahoma", Font.BOLD, 11));
		view2Button.setBounds(757, 319, 102, 23);
		view2Button.addActionListener(this);
		contentPane.add(view2Button);
		
		view3Button.setFont(new Font("Tahoma", Font.BOLD, 11));
		view3Button.setBounds(757, 394, 102, 23);
		view3Button.addActionListener(this);
		contentPane.add(view3Button);
		
		JLabel lblNewLabel_3_1 = new JLabel("______________________________________");
		lblNewLabel_3_1.setBounds(520, 248, 240, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("______________________________________");
		lblNewLabel_3_2.setBounds(520, 302, 240, 14);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("______________________________________");
		lblNewLabel_3_3.setBounds(520, 323, 240, 14);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("______________________________________");
		lblNewLabel_3_4.setBounds(520, 379, 240, 14);
		contentPane.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("______________________________________");
		lblNewLabel_3_5.setBounds(520, 398, 240, 14);
		contentPane.add(lblNewLabel_3_5);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(873, -1, 11, 512);
		contentPane.add(scrollBar);
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
		else if(e.getSource()==profileButton) {
			dispose();
			UserProfile userProfile = new UserProfile();
			userProfile.setVisible(true);			
		}
		else if(e.getSource()==view1Button) {
			dispose();
			VendorPage vendorPage = new VendorPage();
			vendorPage.setVisible(true);			
		}
        else if(e.getSource()==view2Button) {
        	dispose();
			VendorPage vendorPage = new VendorPage();
			vendorPage.setVisible(true);
		}
        else if(e.getSource()==view3Button) {
        	dispose();
			VendorPage vendorPage = new VendorPage();
			vendorPage.setVisible(true);
		}
	}
}