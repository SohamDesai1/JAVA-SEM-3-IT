package com.company;

import java.util.*;

class EXP7 {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        Vector v2 = new Vector(20);
        Vector v3 = new Vector(30, 10);
        v2.add(100);
        v2.add(100);
        v2.add(100);

        Vector v4 = new Vector(v2);
        System.out.println("Vector v1 of capacity " + v1.capacity());
        System.out.println("Vector v2 of capacity " + v2.capacity());
        System.out.println("Vector v3 of capacity " + v3.capacity());
        System.out.println("Vector v4 of capacity " + v4.capacity());
    }
}
