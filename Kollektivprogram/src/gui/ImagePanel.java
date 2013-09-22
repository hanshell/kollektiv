package gui;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;

public class ImagePanel extends JPanel{
	private BufferedImage img;
	private JButton logout;

	public static boolean disposeFrame=false;
	
	private static int IMAGE_WIDTH=360;
	private static int IMAGE_HEIGHT=420;

	public ImagePanel(){
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createTitledBorder(null, "Bilde", TitledBorder.CENTER, TitledBorder.CENTER));

		try {
			img = ImageIO.read(new File("C:\\Users\\Melbster\\Desktop\\colors.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IO-error reading file");
		}
		Image personImage=img.getScaledInstance(IMAGE_WIDTH, IMAGE_HEIGHT, Image.SCALE_DEFAULT);

		JLabel pic = new JLabel(new ImageIcon(personImage)); //Converting to a type compatible with JPanel

		this.add(pic, BorderLayout.NORTH);

		logout=new JButton("Log out");
		logout.addActionListener(new LogoutPressed());
		this.add(logout, BorderLayout.SOUTH);
	}

	private class LogoutPressed implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			int confirm=JOptionPane.showConfirmDialog(null, "Er du sikker på at du vil logge ut?");
			if(confirm==JOptionPane.YES_OPTION) {
				MainPanel.disposeFrame();
				new LoginFrame();
			}
		}

	}

}
