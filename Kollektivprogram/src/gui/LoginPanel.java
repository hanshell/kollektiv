package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	private JButton loginButton;
	private JButton cancel;

	public LoginPanel(){
		super("Login frame");
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		setWelcomePanel();
		setLoginPanel();
		setButtonPanel();
		add(welcomePanel);
		add(loginPanel);
		add(buttonPanel);
		
		loginButton.addActionListener(new loginPressed());
		cancel.addActionListener(new cancelPressed());
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
		loginButton=new JButton("Log in");
		loginButton.setVisible(true);
		loginButton.setSize(10, 5);
		
		cancel=new JButton("Cancel");
		cancel.setVisible(true);
		cancel.setSize(10, 5);
		
		buttonPanel.add(loginButton);
		buttonPanel.add(cancel);
	}
	private class loginPressed implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(null, "You have logged out! Unfortunately, this button as of now does not have any logout-functionality");
		}
	}
	private class cancelPressed implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
			
		}
		
	}
	// TODO Auto-generated method stub
}		
