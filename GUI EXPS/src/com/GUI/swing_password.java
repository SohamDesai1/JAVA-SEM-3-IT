package com.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing_password {
    JFrame frame;
    JLabel label;
    JLabel label2;
    JTextField textField;
    JPasswordField password;
    JButton button;
    JButton button2;
    JCheckBox checkBox;

    public swing_password() {
        frame = new JFrame("Login");
        frame.setLayout(null);
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label2 = new JLabel("Username");
        label2.setBounds(120, 20, 80, 25);
        frame.add(label2);
        label2.setVisible(true);

        textField = new JTextField();
        textField.setBounds(220, 20, 150, 20);
        frame.add(textField);
        textField.setVisible(true);

        label = new JLabel("password");
        label.setBounds(120, 70, 70, 20);
        frame.add(label);
        label.setVisible(true);

        password = new JPasswordField();
        password.setBounds(220, 70, 150, 20);
        frame.add(password);
        password.setVisible(true);


        button = new JButton("Login");
        button.setBounds(90, 125, 100, 30);
        frame.add(button);
        button.setVisible(true);
        button.addActionListener(e -> {
            if (password.getPassword().length == 0) {
                JOptionPane.showMessageDialog(frame, "please enter password");
            }
               else if (textField.getText().length() == 0) {
                    JOptionPane.showMessageDialog(frame, "please enter username");
                }
               else if (password.getPassword().length == 0 && textField.getText().length() == 0) {
                    JOptionPane.showMessageDialog(frame, "please enter username and password");
            }
             else {
                JOptionPane.showMessageDialog(frame, "password entered successfully");
            }
        });

        button2 = new JButton("Cancel");
        button2.setBounds(230, 125, 100, 30);
        frame.add(button2);
        button2.setVisible(true);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        checkBox = new JCheckBox("show password");
        checkBox.setBounds(240, 95, 150, 20);
        frame.add(checkBox);
        checkBox.setVisible(true);
        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox.isSelected()) {
                    password.setEchoChar((char) 0);
                } else {
                    password.setEchoChar('*');
                }
            }
        });
    }

    public static void main(String[] args) {
        new swing_password();
    }
}
