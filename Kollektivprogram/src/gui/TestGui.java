package gui;

import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestGui extends Object{
	public static String IMAGE_PATH="C://Users//Melbster//Desktop//Radioamatorlisens.jpg";
	public static void main(String[] args) throws IOException {
		JFrame frame=new LoginPanel();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(450, 192);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void displayFrameSize(JFrame frame) throws InterruptedException{
		while(true){
			System.out.println("Frameheight: " + frame.getHeight()+", "+"Framewidth: "+frame.getWidth());
			Thread.sleep(2000);
		}
	}
}
