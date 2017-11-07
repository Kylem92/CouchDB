package com.kyle;

import org.lightcouch.CouchDbClient;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Amanda on 13/10/2016.
 */
public class viewBhp extends JFrame{
    private JTextArea bhpView;

    public viewBhp() {
        Container cPane;
        setTitle("ID");
        setSize(300, 200);
        setResizable(true);
        setLocation(250, 200);

        cPane = getContentPane();
        cPane.setLayout(new FlowLayout());

        bhpView = new JTextArea();
        cPane.add(bhpView);
    }
    public void getView()
    {
        CouchDbClient dbClient = new CouchDbClient("cars/_design/Audi/_view/by_Bhp", true, "http", "localhost", 5984, null, null);
        //View view = dbClient.view("_design/Audi/_view/by_Bhp")
               // .key(2011, 10, 15) // complex key as: values, or array
               // .reduce(false)
               // .includeDocs(true);
        //System.out.println(view);

        System.out.print(dbClient);
        bhpView.append(String.valueOf(dbClient.getGson()));
    }
}

