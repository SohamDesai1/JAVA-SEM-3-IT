package com.GUI;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class swing_table {
    JFrame frame;
    JLabel label;

    public swing_table() {
        frame = new JFrame("table");
//        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        label = new JLabel("password");
//        label.setBounds(40, 30, 100, 20);
//        frame.add(label);

        String[] columnNames = {"id", "name", "age"};
        String[][] data = {
                {"1", "mohamed", "23"},
                {"2", "ahmed", "24"},
                {"3", "ali", "25"},
        };

        final JTable table = new JTable(data, columnNames);
        table.setCellSelectionEnabled(true);
        ListSelectionModel cellSelectionModel = table.getSelectionModel();
        cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        cellSelectionModel.addListSelectionListener(e -> {
            String data1 = null;
            int[] row = table.getSelectedRows();
            int[] column = table.getSelectedColumns();
            for (int i = 0; i < row.length; i++) {
                for (int j = 0; j < column.length; j++) {
                    data1 = table.getValueAt(row[i], column[j]).toString();
                }
            }
            System.out.println("You selected this data"+data1);
        });
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);
        frame.add(table);
        table.setVisible(true);
    }

    public static void main(String[] args) {
        new swing_table();
    }
}

