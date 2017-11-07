package com.kyle;

import org.lightcouch.CouchDbClient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Kyle on 10/10/2016.
 */
public class deleteDbGui extends JFrame implements ActionListener {
    private JTextField name;
    private JButton delete;
    private String db;



    public deleteDbGui() {
        Container cPane;
        setTitle("Delete DB");
        setSize(350, 300);
        setResizable(true);
        setLocation(250, 200);

        cPane = getContentPane();
        cPane.setLayout(new FlowLayout());

        delete = new JButton("DeleteDb");
        cPane.add(delete);

        name = new JTextField(20);

        cPane.add(name);

        delete.addActionListener(this);

    }

    public void deleteDb(JTextField name) {
        db = name.getText();
        CouchDbClient dbClient = new CouchDbClient(db, true, "http", "127.0.0.1", 5984,null,null);

        dbClient.context().deleteDB(db,"delete database");

        dbClient.shutdown();


    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== delete){
            deleteDb(name);

        }
    }
}
