package com.company;

import java.util.*;

public class lec_vector {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        Vector<Integer> v1 = new Vector<>(3);
        Vector<Integer> v2 = new Vector<>(3, 5);
        System.out.println("Initial size and capacity");
        System.out.println("Size of v " + v.size() + " capacity " + v.capacity());
        System.out.println("Size of v1 " + v1.size() + " capacity " + v1.capacity());
        System.out.println("Size of v2 " + v2.size() + " capacity " + v2.capacity());

        v.addElement("A");
        v.addElement("B");
        v.addElement("C");
        v1.addElement(10);
        v1.addElement(20);
        v1.addElement(30);
        v2.addElement(29);
        v2.addElement(16);

        System.out.println("size and capacity after insertion");
        System.out.println("Size of v " + v.size() + " capacity " + v.capacity());
        System.out.println("Size of v1 " + v1.size() + " capacity " + v1.capacity());
        System.out.println("Size of v2 " + v2.size() + " capacity " + v2.capacity());

        Enumeration en = v.elements();
        System.out.println("Elements of v: ");
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement() + " ");
        }
        Enumeration en2 = v2.elements();
        System.out.println("Elements of v2: ");
        while (en2.hasMoreElements()) {
            System.out.println(en2.nextElement() + " ");
        }
        Enumeration en1 = v1.elements();
        System.out.println("Elements of v1: ");
        while (en1.hasMoreElements()) {
            System.out.println(en1.nextElement() + " ");
        }

        Boolean b = v.contains("v");
        System.out.println(b);
    }
}