package com.kyle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kyle on 10/10/2016.
 */
public class gui extends JFrame implements ActionListener {

    private JButton createDbButton;
    private JButton deleteButton;
    private JButton updateButton;
    private JButton listButton;
    private JButton createButton;
    private JButton deleteDocButton;
    private JButton mapReduceModel;
    private JButton view;

    public static void main(String[] args){
        gui gui = new gui();
        gui.setVisible(true);

    }

    public gui(){
        Container cPane;
        setTitle("Cars");
        setSize(220,200);
        setResizable(true);
        setLocation(250,200);

        cPane = getContentPane();
        cPane.setLayout(new FlowLayout());

        createDbButton = new JButton("CreateDb");
        cPane.add(createDbButton);
        deleteButton = new JButton("DeleteDb");
        cPane.add(deleteButton);
        updateButton = new JButton("UpdateDoc");
        cPane.add(updateButton);
        createButton = new JButton("CreateDoc");
        cPane.add(createButton);

        deleteDocButton = new JButton("DeleteDoc");
        cPane.add(deleteDocButton);
        mapReduceModel = new JButton("MapReduce");
        cPane.add(mapReduceModel);
        view = new JButton("ViewBhp");
        cPane.add(view);

        createDbButton.addActionListener(this);
        deleteButton.addActionListener(this);
        updateButton.addActionListener(this);
        createButton.addActionListener(this);
        deleteDocButton.addActionListener(this);
        mapReduceModel.addActionListener(this);
        view.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == createDbButton ) {
            System.out.print("createDb");
            //this.setVisible(false);
            createDbGui db = new createDbGui();
            db.setVisible(true);
        }
        else if (e.getSource() == deleteButton ) {
            System.out.print("deleteDb");
            deleteDbGui db1 = new deleteDbGui();
            db1.setVisible(true);
        }
        else if (e.getSource() == updateButton) {
            System.out.print("updateDoc");
            updateGui db4 = new updateGui();
            db4.setVisible(true);
        }
        else if (e.getSource() == createButton ) {
            System.out.print("createDoc");
            createDocGui db2 = new createDocGui();
            db2.setVisible(true);
        }
        else if (e.getSource() == deleteDocButton ) {
            System.out.print("DeleteDoc");
            deleteDocGui db3 = new deleteDocGui();
            db3.setVisible(true);
        }
        else if (e.getSource() == mapReduceModel ) {
            System.out.print("map");
            MapReduce db6 = new MapReduce();
            db6.setVisible(true);
            db6.mapReduce();
        }
        else if (e.getSource() == view ) {
            System.out.print("viewById");
            viewBhp db5 = new viewBhp();
            db5.setVisible(true);
            db5.getView();

        }




        }
    }

