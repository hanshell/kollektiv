package gui;

import java.awt.Dimension;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import db.DBConnection;

/*
 * Sets Panel-layout of main JFrame, adds other panels to main panel
 */

public class MainPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JFrame frame;
	public MainPanel(){
		DBConnection.connect();
		
		setLayout(new BorderLayout());
		add(new PersonListPanel(), BorderLayout.WEST);
		add(new InfoPanel(), BorderLayout.CENTER);
		add(new ImagePanel(), BorderLayout.EAST);
	}
	//method to dispose main frame from other classes
	public static void disposeFrame(){
		frame.dispose();
	}
	public static void showMainFrame() { //displays main frame
		frame=new JFrame("Kollektivapplikasjon");
		frame.setSize(new Dimension(1000, 600));
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().add(new MainPanel());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new LoginFrame();
	}
}
