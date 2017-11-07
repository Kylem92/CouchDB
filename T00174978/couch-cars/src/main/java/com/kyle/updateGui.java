package com.kyle;

import org.lightcouch.CouchDbClient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kyle on 10/10/2016.
 */
public class updateGui extends JFrame implements ActionListener {
    private JButton updateButton;
    private JLabel idL;
    private JLabel revL;
    private JLabel fieldL;
    private JLabel valueL;

    private JTextField idtxt;
    private JTextField revtxt;
    private JTextField fieldtxt;
    private JTextField valuetxt;

    private String id, rev, field, value;




    public updateGui(){
        Container cPane;
        setTitle("Update Car");
        setSize(450,300);
        setResizable(true);
        setLocation(250,200);

        cPane = getContentPane();
        cPane.setLayout(new FlowLayout());

        idL = new JLabel("id:");
        cPane.add(idL);
        idtxt = new JTextField(12);
        cPane.add(idtxt);


        revL = new JLabel("rev:");
        cPane.add(revL);
        revtxt = new JTextField(16);
        cPane.add(revtxt);


        fieldL = new JLabel("model:");
        cPane.add(fieldL);
        fieldtxt = new JTextField(10);
        cPane.add(fieldtxt);


        valueL = new JLabel("bhp:");
        cPane.add(valueL);
        valuetxt = new JTextField(10);
        cPane.add(valuetxt);




        updateButton = new JButton("Update");
        cPane.add(updateButton);


        updateButton.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void updateDoc(JTextField idtxt, JTextField revtxt, JTextField fieldtxt, JTextField valuetxt){
        id = idtxt.getText();
        rev = revtxt.getText();
        field = fieldtxt.getText();
        value = valuetxt.getText();
        CouchDbClient dbClient = new CouchDbClient("cars", true, "http", "localhost", 5984, null, null);
        Car car = new Car(id, rev, field, value);

        dbClient.update(car);

        dbClient.shutdown();
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==updateButton) {
            updateDoc(idtxt, revtxt, fieldtxt, valuetxt);
        }
    }

}
