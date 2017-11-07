package com.kyle;

import com.google.gson.JsonObject;
import org.lightcouch.CouchDbClient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kyle on 10/10/2016.
 */

public class createDocGui  extends JFrame implements ActionListener {

    private JButton createButton;
    private JLabel name;
    private JLabel dob;
	private JLabel club;
	private JLabel achievements;
	
    private JTextField nametxt;
    private JTextField dobtxt;
	private JTextField clubtxt;
	private JTextField achievementstxt;
    private String nameString, dobString, clubString, achievementsString;




    public createDocGui(){
        Container cPane;
        setTitle("Insert to Collection");
        setSize(350,300);
        setResizable(true);
        setLocation(250,200);

        cPane = getContentPane();
        cPane.setLayout(new FlowLayout());

        name = new JLabel("name:");
        cPane.add(name);
		nametxt = new JTextField(25);
        cPane.add(nametxt);
        
        
		dob = new JLabel("dob:");
        cPane.add(dob);
        dobtxt = new JTextField();
        cPane.add(dobtxt);
        
		club = new JLabel("club:");
        cPane.add(club);
        clubtxt = new JTextField();
        cPane.add(clubtxt);
        
		achievements = new JLabel("Achievements:");
		cPane.add(achievements);
		achievementstxt = new JTextField();
        cPane.add(achievementstxt);


        createButton = new JButton("Create");
        cPane.add(createButton);


        createButton.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public void insert(JTextField nametxt, JTextField dobtxt, JTextField clubtxt, JTextField achievementstxt){
			nameString = nametxt.getText()
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == createButton) {
            insert(nametxt, dobtxt, clubtxt, achievementstxt);

        }
    }
}
