package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.SecondaryLoop;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class PersonListPanel extends JPanel {
	private JList<String> personlist;
	private JButton addPerson;
	private JScrollPane scrollpane;
	
	public PersonListPanel(){
		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createTitledBorder("Navn: "));
		
		String[] names={"Hans Melby", "Anne Sofie Solberg", "Martin Ervik", "Tormod Bjørnhaug"};
		
		GridBagConstraints gbc=new GridBagConstraints();
		
		gbc.anchor=GridBagConstraints.NORTH;
		gbc.fill=GridBagConstraints.BOTH;
		
		gbc.gridx=0;
		gbc.gridy=0;
		
		gbc.weightx=0.5;
		gbc.weighty=0.5;
		
		personlist=new JList<>(names);
		scrollpane=new JScrollPane(personlist);
		add(scrollpane, gbc);
		
		gbc.anchor=GridBagConstraints.SOUTH;
		gbc.fill=GridBagConstraints.SOUTH;
		gbc.gridx=0;
		gbc.gridy=1;
		addPerson=new JButton("Legg til ny person");
		add(addPerson, gbc);
	}
}
