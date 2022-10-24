package com.GUI;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class swing_exit {
    JFrame frame;
    public swing_exit(){
        frame = new JFrame("demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int a = JOptionPane.showConfirmDialog(frame, "do you want to really exit?");
                if(a == JOptionPane.YES_OPTION){
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
        });
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new swing_exit();
    }
}
