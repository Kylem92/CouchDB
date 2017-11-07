package com.kyle;

import org.lightcouch.CouchDbClient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 * Created by Kyle on 11/10/2016.
 */
public class createDbGui extends JFrame implements ActionListener {
    private JLabel name;
    private JTextField dbtxt;
    private JButton createButton;
    private String db;


    public createDbGui() {
        Container cPane;
        setTitle("Create DB");
        setSize(350, 300);
        setResizable(true);
        setLocation(250, 200);

        cPane = getContentPane();
        cPane.setLayout(new FlowLayout());

        name = new JLabel("DB name:");
        cPane.add(name);


        dbtxt = new JTextField(20);
        cPane.add(dbtxt);



        createButton = new JButton("CreateDb");
        cPane.add(createButton);


        createButton.addActionListener(this);
    }
    public void createDb(JTextField dbt) {
        db = dbt.getText();
        CouchDbClient dbClient = new CouchDbClient(db, true, "http", "localhost", 5984,null,null);

        dbClient.shutdown();

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == createButton)
            createDb(dbtxt);

    }
}
