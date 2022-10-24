package com.GUI;

import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class swing_scrollbar {
    JFrame frame;
    JLabel label;
    JScrollBar bar;

    public swing_scrollbar() {
        frame = new JFrame("demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

        label = new JLabel("hello");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(300, 300);
        frame.add(label);
        label.setVisible(true);

        bar = new JScrollBar(JScrollBar.VERTICAL, 0, 0, 0, 100);
        bar.setBounds(10, 10, 20, 20);
        bar.addAdjustmentListener(e -> {
            label.setText("Your position is " + e.getValue());
        });
        frame.add(bar);
    }

    public static void main(String[] args) {
        new swing_scrollbar();
    }
}
