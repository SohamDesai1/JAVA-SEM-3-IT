package com.company;

import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class ASS5 {
    ASS5(){
        Frame frame = new Frame();
        GridLayout G1 = new GridLayout(3,3);
        Button B1 = new Button("CYAN");
        Button B2= new Button("ORANGE");
        Button B3 = new Button("RED");
        Button B4 = new Button("BLUE");
        Button B5 = new Button("GREEN");
        Button B6 = new Button("GREY");
        Button B7 = new Button("MAGENTA");
        Button B8 = new Button("PINK");
        Button B9 = new Button("YELLOW");
        frame.add(B1);
        frame.add(B2);
        frame.add(B3);
        frame.add(B4);
        frame.add(B5);
        frame.add(B6);
        frame.add(B7);
        frame.add(B8);
        frame.add(B9);
        frame.setSize(400, 400);
        frame.setLayout(G1);
        frame.setVisible(true);
        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                B1.setBackground(Color.CYAN);
            }
        });
        B2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                B2.setBackground(Color.orange);
            }
        });
        B3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                B3.setBackground(Color.RED);
            }
        });
        B4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                B4.setBackground(Color.BLUE);
            }
        });
        B5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                B5.setBackground(Color.GREEN);
            }
        });
        B6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                B6.setBackground(Color.lightGray);
            }
        });
        B7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                B7.setBackground(Color.MAGENTA);
            }
        });
        B8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                B8.setBackground(Color.PINK);
            }
        });
        B9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                B9.setBackground(Color.YELLOW);
            }
        });
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
    public static void main(String[] args) {
        ASS5 L1 = new ASS5();
    }
}