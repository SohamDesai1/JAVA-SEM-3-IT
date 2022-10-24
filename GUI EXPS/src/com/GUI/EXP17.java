package com.GUI;
import java.awt.*;
import java.awt.event.*;
class MyCalculator extends Frame implements ActionListener {
    TextField tf;
    Panel panel;
    String[] btnString = {"7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "C", "0", "=", "/"};
    Button[] btn = new Button[16];
    float num1 = 0, num2 = 0, result = 0;
    char op;
    public MyCalculator() {
        tf = new TextField(10);
        panel = new Panel();
        add(tf, "North");
        add(panel, "Center");
        panel.setLayout(new GridLayout(4, 4));
        for (int i = 0; i < 16; i++) {
            btn[i] = new Button(btnString[i]);
            btn[i].addActionListener(this);
            panel.add(btn[i]);
        }
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        switch (str) {
            case "+" -> {
                op = '+';
                num1 = Integer.parseInt(tf.getText());
                tf.setText("");
            }
            case "-" -> {
                op = '-';
                num1 = Integer.parseInt(tf.getText());
                tf.setText("");
            }
            case "*" -> {
                op = '*';
                num1 = Integer.parseInt(tf.getText());
                tf.setText("");
            }
            case "/" -> {
                op = '/';
                num1 = Integer.parseInt(tf.getText());
                tf.setText("");
            }
            case "=" -> {
                num2 = Integer.parseInt(tf.getText());
                switch (op) {
                    case '+' -> result = num1 + num2;
                    case '-' -> result = num1 - num2;
                    case '*' -> result = num1 * num2;
                    case '/' -> result = num1 / num2;
                }
                tf.setText(result + "");
                result = 0;
            }
            case "C" -> {
                tf.setText("");
                num1 = num2 = result = 0;
            }
            default -> tf.setText(tf.getText() + str);
        }
    }
    public static void main(String[] args) {
        MyCalculator m = new MyCalculator();
        m.setTitle("My Calculator");
        m.setSize(250, 300);
        m.setVisible(true);
    }
}
