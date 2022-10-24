package com.GUI;

import javax.swing.*;

public class swing_menu {
    JFrame frame;
    JMenuBar menuBar;
    JMenu file,edit,view,help;
    JMenuItem cut,copy,paste,save;
    JTextArea textArea;
    public swing_menu() {
        frame = new JFrame("demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

        file.add(save);
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);


        menuBar = new JMenuBar();
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(view);
        menuBar.add(help);

        frame.add(menuBar);
        menuBar.setVisible(true);
        frame.setJMenuBar(menuBar);


    }

    public static void main(String[] args) {
            new swing_menu();
    }
}
