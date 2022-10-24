package com.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class swing_basic {
    JButton button1;
    JButton button;
    JLabel label;
    JFrame frame;
    JCheckBox checkBox;

    JLabel label1;
    JTextField text;
    JTextArea area;

    public swing_basic() {
        frame = new JFrame("demo");
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button1 = new JButton("count");
        button1.setBounds(40, 160, 100, 30);
        frame.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = text.getText();
                String [] words = s.split(" ");
                label.setText("Total words = " + words.length);
            }
        });

        text = new JTextField();
        text.setBounds(40, 100, 100, 30);
        text.setBackground(Color.red);
        frame.add(text);


        frame.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                label.setText("clicked successfully");
            }
        });

        area = new JTextArea();
        area.setBounds(40, 140, 250, 250);
        area.setBackground(Color.yellow);
        frame.add(area);
    }

    public static void main(String[] args) {
        swing_basic swing = new swing_basic();
    }
}
