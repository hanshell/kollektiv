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
	private static JFrame frame;
	public MainPanel(){
		setLayout(new BorderLayout());
		add(new PersonListPanel(), BorderLayout.WEST);
		add(new InfoPanel(), BorderLayout.CENTER);
		add(new ImagePanel(), BorderLayout.EAST);
	}
	//method to dispose main frame from other classes
	public static void disposeFrame(){
		frame.dispose();
	}
	public static void s(){ //displays main frame. 's' is short for 'show', as the latter is a reserved java method name
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
