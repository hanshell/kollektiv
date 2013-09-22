package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class InfoPanel extends JPanel{
	private JLabel personInfoLabel;
	private JLabel nameLabel;
	private JLabel fieldOfStudyLabel;
	private JLabel emailLabel;
	private JLabel phoneNumberLabel;
	private JLabel genderLabel;
	
	private JTextField name;
	private JTextField fieldOfStudy;
	private JTextField email;
	private JTextField phoneNumber;
	private JTextField gender;
	
	public InfoPanel(){
		//setting layout
		this.setLayout(new GridBagLayout());
		
		this.setBorder(BorderFactory.createTitledBorder(null, "Person-info", TitledBorder.CENTER, TitledBorder.CENTER));
		
		
		this.setBackground(Color.YELLOW);
		
		GridBagConstraints gbc=new GridBagConstraints();

		//instantiating labels
		nameLabel=new JLabel("Navn: ");
		fieldOfStudyLabel=new JLabel("Studiefelt: ");
		emailLabel=new JLabel("E-mail: ");
		phoneNumberLabel=new JLabel("Tlf. nr: ");
		genderLabel=new JLabel("Gender: ");
		
		//instantiating textfields
		name=new JTextField(15);
		fieldOfStudy=new JTextField(15);
		email=new JTextField(15);
		phoneNumber=new JTextField(15);
		gender=new JTextField(15);
		
		//setting GridBagConstraint-values and adding to inherited JPanel
				
		gbc.anchor=GridBagConstraints.NORTHWEST;
		
		gbc.weightx=0.5;
		gbc.weighty=0.5;
		
		gbc.insets=new Insets(30, 50, 30, 0);
		
		gbc.gridx=0;
		gbc.gridy=0;
		this.add(nameLabel, gbc);
		
		
		gbc.gridx=1;
		gbc.gridy=0;
		this.add(name, gbc);
		
		gbc.gridx=0;
		gbc.gridy=1;
		add(fieldOfStudyLabel, gbc);
		
		gbc.gridx=1;
		gbc.gridy=1;
		add(fieldOfStudy, gbc);
		
		gbc.gridx=0;
		gbc.gridy=2;
		add(emailLabel, gbc);
		
		gbc.gridx=1;
		gbc.gridy=2;
		add(email, gbc);
		
		gbc.gridx=0;
		gbc.gridy=3;
		add(phoneNumberLabel, gbc);
		
		gbc.gridx=1;
		gbc.gridy=3;
		add(phoneNumber, gbc);
		
		
		gbc.gridx=0;
		gbc.gridy=4;
		add(genderLabel, gbc);
		
		gbc.gridx=1;
		gbc.gridy=4;
		add(gender, gbc);
		
		for(Component c: getComponents())
			if(c instanceof JTextField)
				((JTextField) c).setEditable(false); //Sets every JTextField-editable field to false
		
	}
}
