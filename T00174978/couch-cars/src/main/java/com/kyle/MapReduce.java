package com.kyle;

import org.lightcouch.CouchDbClient;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Amanda on 13/10/2016.
 */
public class MapReduce extends JFrame {

    private JTextArea map;

    public MapReduce() {
        Container cPane;
        setTitle("Models");
        setSize(300, 200);
        setResizable(true);
        setLocation(250, 200);

        cPane = getContentPane();
        cPane.setLayout(new FlowLayout());

        map = new JTextArea();
        cPane.add(map);
    }
    public void mapReduce()
    {
        CouchDbClient dbClient = new CouchDbClient("cars/_design/Audi/_view/by_model_reduce", true, "http", "localhost", 5984, null, null);
        map.append(dbClient.toString());
        dbClient.shutdown();
    }
}
