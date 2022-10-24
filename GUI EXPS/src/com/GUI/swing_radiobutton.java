package com.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing_radiobutton {
    JFrame frame;
    JRadioButton radioButton;
    JButton button2;

    public swing_radiobutton() {
        frame = new JFrame("Radio");
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button2 = new JButton("click");
        button2.setBounds(150, 160, 100, 30);
        frame.add(button2);
        button2.setVisible(true);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioButton.isSelected()) {
                    JOptionPane.showMessageDialog(frame, "selected");
                } else {
                    JOptionPane.showMessageDialog(frame, "not selected");
                }
            }
        });

        radioButton = new JRadioButton("Demo1");
        radioButton.setBounds(150, 140, 100, 20);
        frame.add(radioButton);
        radioButton.setVisible(true);

    }

    public static void main(String[] args) {
        new swing_radiobutton();
    }
}

