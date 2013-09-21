package gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MainPanel extends JPanel {
	public MainPanel(){
		setLayout(new BorderLayout());
		add(new PersonListPanel(), BorderLayout.WEST);
	}
	public static void showGUI(){
		JFrame frame=new JFrame("Kollektivapplikasjon");
		frame.setSize(new Dimension(1000, 600));
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().add(new MainPanel());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
	public static void main(String[] args) {
		showGUI();
	}
}
