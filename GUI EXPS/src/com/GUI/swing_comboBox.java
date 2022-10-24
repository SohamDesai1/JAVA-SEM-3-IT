package com.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing_comboBox {
    JFrame frame;
    JLabel label;
    JComboBox comboBox;
    JButton button;

    public swing_comboBox() {
        frame = new JFrame("password");
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        label = new JLabel("password");
//        label.setBounds(40, 30, 100, 20);
//        frame.add(label);

        String[] City = {"Cairo", "Alex", "Giza", "Aswan"};
        comboBox = new JComboBox(City);
        comboBox.setBounds(150, 50, 100, 20);
        comboBox.setVisible(true);
        frame.add(comboBox);

        button = new JButton("Confirm");
        button.setBounds(150, 100, 100, 30);
        button.setVisible(true);
        frame.add(button);
        button.addActionListener(e -> {
            if (comboBox.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(frame, "your choice is 1");
            } else {
                JOptionPane.showMessageDialog(frame, "your choice is 2");
            }
        });
    }

    public static void main(String[] args) {
        new swing_comboBox();
    }
}
