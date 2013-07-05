package gui;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class TestGui {
	public static void main(String[] args) {
		JFrame frame=new LoginPanel();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(450, 192);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try{
			displayFrameSize(frame);
		}
		catch(InterruptedException ie){
			System.out.println("Thread interrupted");
		}

	}
	public static void displayFrameSize(JFrame frame) throws InterruptedException{
		while(true){
			System.out.println(frame.getHeight()+", "+frame.getWidth());
			Thread.sleep(300);
		}
	}

}
