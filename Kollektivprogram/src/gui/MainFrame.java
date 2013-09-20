package gui;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	public MainFrame(){
		super("Kollektivapplikasjon");
		setLayout(new BorderLayout());
		setVisible(true);
		setSize(new Dimension(1000, 600));
		setResizable(false);
		setLocationRelativeTo(null);
		
		add(new PersonListPanel(), BorderLayout.WEST);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new MainFrame();
	}
}
