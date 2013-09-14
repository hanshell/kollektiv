package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel welcomePanel;
	private JPanel loginPanel;
	private JPanel buttonPanel;
	private JLabel loginDisplay;
	private JTextField username;
	private JPasswordField password;
	private JLabel usernameLabel;
	private JLabel passwordLabel;
	private JButton button;
	
	public LoginPanel(){
		super("Login frame");
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		setWelcomePanel();
		setLoginPanel();
		setButtonPanel();
		add(welcomePanel);
		add(loginPanel);
		add(buttonPanel);
	}
	private void setWelcomePanel(){
		welcomePanel=new JPanel(new FlowLayout());
		welcomePanel.setPreferredSize(new Dimension(450, 40));
		loginDisplay=new JLabel("Type inn username and password");
		welcomePanel.add(loginDisplay);
	}
	private void setLoginPanel(){
		loginPanel=new JPanel(new GridLayout(2, 2, 3, 7));
		username=new JTextField();
		username.setPreferredSize(new Dimension(200, 20));
		password=new JPasswordField();
		password.setPreferredSize(new Dimension(200, 20));
		username.setEditable(true);
		password.setEditable(true);
		
		usernameLabel=new JLabel("Username: ");
		passwordLabel=new JLabel("Password: ");
	
		loginPanel.add(usernameLabel);
		loginPanel.add(username);
		loginPanel.add(passwordLabel);
		loginPanel.add(password);
	}
	private void setButtonPanel(){
		buttonPanel=new JPanel();
		button=new JButton("Log in");
		button.setVisible(true);
		button.setSize(10, 5);
		buttonPanel.add(button);
	}
}
