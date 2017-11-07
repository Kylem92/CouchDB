package com.kyle;

import org.lightcouch.CouchDbClient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Amanda on 13/10/2016.
 */
public class deleteDocGui extends JFrame implements ActionListener {
    private JButton deleteButton;
    private JLabel idL;
    private JLabel revL;

    private JTextField idtxt;
    private JTextField revtxt;
    private String id, rev;




    public deleteDocGui(){
        Container cPane;
        setTitle("Create Doc");
        setSize(350,300);
        setResizable(true);
        setLocation(250,200);

        cPane = getContentPane();
        cPane.setLayout(new FlowLayout());

        idL = new JLabel("id:");
        cPane.add(idL);



        idtxt = new JTextField(15);
        cPane.add(idtxt);


        revL = new JLabel("rev:");
        cPane.add(revL);
        revtxt = new JTextField(15);
        cPane.add(revtxt);





        deleteButton = new JButton("Delete");
        cPane.add(deleteButton);


        deleteButton.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public void deleteDoc(JTextField idtxt, JTextField revtxt){
        id = idtxt.getText();
        rev = revtxt.getText();
        CouchDbClient dbClient = new CouchDbClient("cars", true, "http", "127.0.0.1", 5984, null, null);

        dbClient.remove(id, rev);

        dbClient.shutdown();

    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == deleteButton) {
            deleteDoc(idtxt, revtxt);

        }
    }

}
