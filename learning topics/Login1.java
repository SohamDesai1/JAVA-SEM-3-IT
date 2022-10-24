package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public abstract class Login1 extends JFrame implements ActionListener{
    JLabel l1,l2,l3, l4;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1,b2, b3;
    JPanel p1,p2,p3,p4;
    Choice c1;
    Login1(){
        super("Login Page");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        l1 = new JLabel("Username");
        l1.setBounds(300, 20, 100, 20);
        add(l1);
        l2 = new JLabel("Password");
        l2.setBounds(300, 60, 100, 20);
        add(l2);

        tf1 = new JTextField(15);
        tf1.setBounds(400, 20, 150, 20);
        add(tf1);
        pf2 = new JPasswordField(15);
        pf2.setBounds(400, 60, 150, 20);
        add(pf2);

        l4 = new JLabel("Logging in as");
        l4.setBounds(300, 100, 100, 20);
        add(l4);

//        c1 = new Choice();
//        c1.add("Admin");
//        c1.add("Customer");
//        c1.setBounds(400, 100, 150, 20);
//        add(c1);

//        ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
//        Image i1 = ic1.getImage().getScaledInstance(16, 16,Image.SCALE_DEFAULT);
//        b1 = new JButton("Login", new ImageIcon(i1));
//        b1.setBounds(330, 160, 100, 20);
//        add(b1);
//
//        ImageIcon ic2 = new ImageIcon(ClassLoader.getSystemResource("icon/cancel.jpg"));
//        Image i2 = ic2.getImage().getScaledInstance(16, 16,Image.SCALE_DEFAULT);
//        b2 = new JButton("Cancel",new ImageIcon(i2));
//        b2.setBounds(450, 160, 100, 20);
//        add(b2);
//
//        ImageIcon ic4 = new ImageIcon(ClassLoader.getSystemResource("icon/signup.png"));
//        Image i4 = ic4.getImage().getScaledInstance(16, 16,Image.SCALE_DEFAULT);
//        b3 = new JButton("Signup",new ImageIcon(i4));
//        b3.setBounds(380, 200, 130, 20);
//        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public static void main(String[] args) {
        new Login1() {
            @Override
            public void actionPerformed(ActionEvent e) {
                        
            }
        };
    }
}
