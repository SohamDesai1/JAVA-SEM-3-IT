package com.GUI;
import java.awt.*;
import java.awt.event.*;

public class awt implements WindowListener {
    Frame f = new Frame("demo");

    public awt() {
        TextField tf = new TextField(20);
        tf.setBounds(20, 120, 150, 30);

        TextArea ta = new TextArea("");
        ta.setBounds(250, 40, 200, 200);

        Label l = new Label("hello");
        l.setBackground(Color.CYAN);
        l.setBounds(20, 90, 150, 30);

        Button b = new Button("click me");
        b.setBackground(Color.red);
        b.setForeground(Color.white);
        b.setBounds(20, 40, 80, 30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText("pressed");
            }
        });

        Checkbox cb = new Checkbox("check me");
        cb.setBounds(20, 120, 90, 30);

        f.add(b);
        f.add(l);
//        f.add(tf);
//        f.add(ta);
        f.add(cb);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);

        f.addWindowListener(this);
    }

    public static void main(String[] args) {
//        new awt();
        awt a = new awt();

    }


    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
