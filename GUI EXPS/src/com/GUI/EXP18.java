package com.GUI;

import java.awt.*;
import java.awt.event.*;
class Traffic extends Frame implements ItemListener
{
    String clr="";
    Traffic()
    {
        Checkbox c1,c2,c3;
        CheckboxGroup cbg=new CheckboxGroup();
        c1=new Checkbox("red",true,cbg);
        c2=new Checkbox("yellow",true,cbg);
        c3=new Checkbox("green",true,cbg);
        setSize(500,500);
        setTitle("Traffic Signal");
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(c1); add(c2); add(c3);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

    public void itemStateChanged(ItemEvent e)
    {
        clr=(e.getItem()).toString();
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString("Traffic signals",190,200);
        g.drawOval(200,250,25,25);
        g.drawOval(200,330,25,25);
        g.drawOval(200,400,25,25);
        g.drawRect(180,100,100,350);
        if(clr.equals("red"))
        {
            g.setColor(Color.red);
            g.fillOval(200,250,25,25);
        }
        if(clr.equals("green"))
        {
            g.setColor(Color.green);
            g.fillOval(200,400,25,25);
        }
        if(clr.equals("yellow"))
        {
            g.setColor(Color.yellow);
            g.fillOval(200,330,25,25);
        }
    }
    public static void main(String[] args)
{
    new Traffic();
}
}
