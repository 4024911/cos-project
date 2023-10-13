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
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class SearchResults extends JFrame implements ActionListener{
	
	JButton homeButton = new JButton("HOME");
	JButton signInButton = new JButton("Sign In");
	JButton userProfileButton = new JButton("My Profile");
	JButton view1Button = new JButton("View");
	JButton view2Button = new JButton("View");
	JButton view3Button = new JButton("View");
	JButton view4Button = new JButton("View");
	JButton view5Button = new JButton("View");
	JButton view6Button = new JButton("View");
	
	SearchResults(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 550);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		homeButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		homeButton.setBounds(10, 11, 100, 23);
		homeButton.addActionListener(this);
		contentPane.add(homeButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(37, 178, 100, 100);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(37, 289, 100, 100);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLUE);
		panel_2.setBounds(37, 400, 100, 100);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("Search Results...");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(353, 136, 140, 18);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("_________________________\r\n_________________________\r\n_________________________\r\n_________________________");
		textArea_1.setBackground(UIManager.getColor("Button.background"));
		textArea_1.setBounds(147, 178, 200, 100);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setText("_________________________\r\n_________________________\r\n_________________________\r\n_________________________");
		textArea_2.setBackground(UIManager.getColor("Button.background"));
		textArea_2.setBounds(147, 289, 200, 100);
		contentPane.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setText("_________________________\r\n_________________________\r\n_________________________\r\n_________________________");
		textArea_3.setBackground(UIManager.getColor("Button.background"));
		textArea_3.setBounds(147, 400, 200, 100);
		contentPane.add(textArea_3);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(873, 0, 11, 511);
		contentPane.add(scrollBar);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBackground(Color.RED);
		panel_3_1_1.setBounds(460, 178, 100, 100);
		contentPane.add(panel_3_1_1);
		
		JPanel panel_3_1_2 = new JPanel();
		panel_3_1_2.setBackground(Color.BLUE);
		panel_3_1_2.setBounds(460, 289, 100, 100);
		contentPane.add(panel_3_1_2);
		
		JPanel panel_3_1_3 = new JPanel();
		panel_3_1_3.setBackground(Color.RED);
		panel_3_1_3.setBounds(460, 400, 100, 100);
		contentPane.add(panel_3_1_3);
		
		JTextArea textArea_4_1 = new JTextArea();
		textArea_4_1.setText("_________________________\r\n_________________________\r\n_________________________\r\n_________________________");
		textArea_4_1.setBackground(UIManager.getColor("Button.background"));
		textArea_4_1.setBounds(570, 178, 200, 100);
		contentPane.add(textArea_4_1);
		
		JTextArea textArea_4_2 = new JTextArea();
		textArea_4_2.setText("_________________________\r\n_________________________\r\n_________________________\r\n_________________________");
		textArea_4_2.setBackground(UIManager.getColor("Button.background"));
		textArea_4_2.setBounds(570, 289, 200, 100);
		contentPane.add(textArea_4_2);
		
		JTextArea textArea_4_3 = new JTextArea();
		textArea_4_3.setText("_________________________\r\n_________________________\r\n_________________________\r\n_________________________");
		textArea_4_3.setBackground(UIManager.getColor("Button.background"));
		textArea_4_3.setBounds(570, 400, 200, 100);
		contentPane.add(textArea_4_3);
		
		JLabel lblNewLabel1 = new JLabel("ESCape");
		lblNewLabel1.setForeground(Color.RED);
		lblNewLabel1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel1.setBounds(353, -1, 173, 53);
		contentPane.add(lblNewLabel1);
		
		JLabel lblNewLabel_1 = new JLabel("Escape the boredom, Embrace the Adventure");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(292, 47, 286, 14);
		contentPane.add(lblNewLabel_1);
		
		signInButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		signInButton.setBounds(774, 11, 100, 23);
		signInButton.addActionListener(this);
		contentPane.add(signInButton);
		
		userProfileButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		userProfileButton.setBounds(10, 38, 102, 23);
		userProfileButton.addActionListener(this);
		contentPane.add(userProfileButton);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.BLUE);
		panel_11.setBounds(0, 72, 872, 53);
		contentPane.add(panel_11);
		
		view1Button.setFont(new Font("Tahoma", Font.BOLD, 11));
		view1Button.setBounds(353, 215, 102, 23);
		view1Button.addActionListener(this);
		contentPane.add(view1Button);
		
		view2Button.setFont(new Font("Tahoma", Font.BOLD, 11));
		view2Button.setBounds(353, 322, 102, 23);
		view2Button.addActionListener(this);
		contentPane.add(view2Button);
		
		view3Button.setFont(new Font("Tahoma", Font.BOLD, 11));
		view3Button.setBounds(353, 435, 102, 23);
		view3Button.addActionListener(this);
		contentPane.add(view3Button);
		
		view4Button.setFont(new Font("Tahoma", Font.BOLD, 11));
		view4Button.setBounds(772, 215, 102, 23);
		view4Button.addActionListener(this);
		contentPane.add(view4Button);
		
		view5Button.setFont(new Font("Tahoma", Font.BOLD, 11));
		view5Button.setBounds(772, 322, 102, 23);
		view5Button.addActionListener(this);
		contentPane.add(view5Button);
		
		view6Button.setFont(new Font("Tahoma", Font.BOLD, 11));
		view6Button.setBounds(772, 435, 102, 23);
		view6Button.addActionListener(this);
		contentPane.add(view6Button);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==homeButton) {
        	dispose();
			HomePage homePage = new HomePage();
			homePage.setVisible(true);
		}
		else if(e.getSource()==signInButton) {
			dispose();
			SignInPage signInPage1 = new SignInPage();
			signInPage1.setVisible(true);			
		}
		else if(e.getSource()==userProfileButton) {
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
        else if(e.getSource()==view4Button) {
        	dispose();
			VendorPage vendorPage = new VendorPage();
			vendorPage.setVisible(true);
        }
        else if(e.getSource()==view5Button) {
        	dispose();
			VendorPage vendorPage = new VendorPage();
			vendorPage.setVisible(true);
        }
        else if(e.getSource()==view6Button) {
        	dispose();
			VendorPage vendorPage = new VendorPage();
			vendorPage.setVisible(true);
        }
	}
}