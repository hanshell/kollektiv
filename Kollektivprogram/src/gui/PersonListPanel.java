package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class PersonListPanel extends JPanel {
	JList personlist;
	
	public PersonListPanel(){
		String[] names={"Dettefweafewafewafaw", "Erfwefawfewafwea", "Eawefwaefwaefn", "Tfawefwafewafewafaweest"};
		setLayout(new BorderLayout());
		
		personlist=new JList<>(names);
		personlist.setBackground(Color.WHITE);

		for(int i=0; i<personlist.getModel().getSize(); i++){
			System.out.println(personlist.getModel().getElementAt(i));
		}
		add(personlist);
	}
	public static void main(String[] args) {
		new PersonListPanel();
	}
}
