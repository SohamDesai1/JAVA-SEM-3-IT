package com.GUI;
import javax.swing.*;
public class EXP16 {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JButton button;
    JButton deselectAll;
    JTextField textField;
    JCheckBox checkBox;
    JCheckBox checkBox2;
    JCheckBox checkBox3;
    JCheckBox selectAll;
    JRadioButton radioButton;
    JComboBox comboBox;

    public EXP16() {
        frame = new JFrame("Interactive program");
        frame.setLayout(null);
        frame.setSize(400, 440);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(1, 1, 400, 440);
        frame.add(panel);
        panel.setVisible(true);

        JLabel label1 = new JLabel("this is a program");
        label1.setBounds(150, 10, 110, 100);
        panel.add(label1);
        label1.setVisible(true);

        label = new JLabel("Text:- ");
        label.setBounds(10, 120, 110, 30);
        panel.add(label);
        label.setVisible(true);

        checkBox = new JCheckBox("Option 1");
        checkBox.setBounds(20, 240, 100, 30);
        panel.add(checkBox);
        checkBox.setVisible(true);

        checkBox2 = new JCheckBox("Option 2");
        checkBox2.setBounds(20, 270, 100, 30);
        panel.add(checkBox2);
        checkBox2.setVisible(true);

        checkBox3 = new JCheckBox("Option 3");
        checkBox3.setBounds(20, 300, 100, 30);
        panel.add(checkBox3);
        checkBox3.setVisible(true);

        selectAll = new JCheckBox("Select All");
        selectAll.setBounds(20, 330, 100, 30);
        panel.add(selectAll);
        selectAll.setVisible(true);

        deselectAll = new JButton("Deselect All");
        deselectAll.setBounds(20, 360, 150, 30);
        panel.add(deselectAll);
        deselectAll.setVisible(true);

        button = new JButton("Enter");
        button.setBounds(130, 180, 100, 20);
        button.setVisible(true);
        panel.add(button);

        String [] items = {"Select", "Option 1", "Option 2", "Option 3"};
        comboBox = new JComboBox(items);
        comboBox.setBounds(230, 330, 100, 30);
        comboBox.setVisible(true);
        panel.add(comboBox);

        radioButton = new JRadioButton("select it");
        radioButton.setBounds(230, 120, 100, 30);
        radioButton.setVisible(true);
        panel.add(radioButton);

        textField = new JTextField();
        textField.setBounds(60, 122, 150, 30);
        textField.setVisible(true);
        panel.add(textField);

        selectAll.addActionListener(e -> {
            if (selectAll.isSelected()) {
                checkBox.setSelected(true);
                checkBox2.setSelected(true);
                checkBox3.setSelected(true);
            }
        });

     deselectAll.addActionListener(e -> {
            if (selectAll.isValid()) {
                checkBox.setSelected(false);
                checkBox2.setSelected(false);
                checkBox3.setSelected(false);
                selectAll.setSelected(false);
            }
        });

        button.addActionListener(e -> {
            if (textField.isValid()) {
                JOptionPane.showMessageDialog(frame, "You have entered =" + textField.getText());
            }
        });

    }

    public static void main(String[] args) {
        new EXP16();
    }
}
