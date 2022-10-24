package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
class JavaExp19 {
    int tap = 0;
    JavaExp19(){
        JFrame frame = new JFrame("Experiment 19.");
        DefaultListModel <String> collect = new DefaultListModel<>();
        collect.addElement("India");
        collect.addElement("America");
        collect.addElement("Russia");
        collect.addElement("Japan");
        JList list = new JList(collect);
        list.setBounds(20 , 40, 70, 200);
        JButton add = new JButton("ADD");
        add.setBounds(100, 40, 60, 20);
        JButton search = new JButton("SEARCH");
        search.setBounds(170, 40, 100, 20);
        JButton sort = new JButton("SORT");
        sort.setBounds(280, 40, 90, 20);
        JTextField box = new JTextField("");
        box.setBounds(100, 70, 210, 50);
        box.setVisible(false);
        JButton done = new JButton("DONE");
        done.setBounds(220, 125, 90, 20);
        done.setVisible(false);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tap = 1;
                box.setVisible(true);
                done.setVisible(true);
            }
        });
        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tap = 2;
                box.setVisible(true);
                done.setVisible(true);
            }
        });
        sort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i;
                ArrayList <String> A1 = new ArrayList<>();
                for(i=0; i<collect.size(); i++){
                    A1.add(collect.elementAt(i));
                }
                Collections.sort(A1);
                collect.removeAllElements();
                for(i=0; i<A1.size(); i++){
                    collect.addElement(A1.get(i));
                }
            }
        });
        done.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tap==1){
                    String data = box.getText();
                    String []arr = data.split(",");
                    for(String x : arr){
                        collect.addElement(x);
                    }
                    box.setText("");
                    box.setVisible(false);
                    done.setVisible(false);
                    JOptionPane.showMessageDialog(frame, "Elements Added To The List","Message",
                            JOptionPane.WARNING_MESSAGE);
                }
                if(tap==2){
                    int i;
                    String data = box.getText();
                    for(i=0; i<collect.size(); i++){
                        String d = collect.elementAt(i);
                        if(d.equals(data)){
                            JOptionPane.showMessageDialog(frame, data+" is present in the list","Message",
                                    JOptionPane.WARNING_MESSAGE);
                            break;
                        }
                    }
                    if(i==collect.size()){
                        JOptionPane.showMessageDialog(frame, data+" is not present in the list","Message",
                                JOptionPane.WARNING_MESSAGE);
                    }
                    box.setVisible(false);
                    done.setVisible(false);
                    box.setText("");
                }
            }
        });
        frame.add(sort);
        frame.add(search);
        frame.add(add);
        frame.add(list);
        frame.add(box);
        frame.add(done);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        JavaExp19 J1 = new JavaExp19();
    }
}
