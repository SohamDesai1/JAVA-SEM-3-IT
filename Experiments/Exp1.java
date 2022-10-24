package com.company;

import java.util.*;

public class Exp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full name");
        String name = sc.nextLine();
        System.out.println("Enter branch:");
        String br = sc.nextLine();
        System.out.println("Enter roll no:");
        int roll_no = sc.nextInt();
        int s1, s2, s3, s4, s5;
        System.out.println("Enter marks of 5 subjects:");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        s4 = sc.nextInt();
        s5 = sc.nextInt();
        int total = s1 + s2 + s3 + s4 + s5;

        System.out.println("Name is: " + name);
        System.out.println("Branch is: " + br);
        System.out.println("Roll no is: " + roll_no);
        System.out.println("marks of subject 1: " + s1);
        System.out.println("marks of subject 2: " + s2);
        System.out.println("marks of subject 3: " + s3);
        System.out.println("marks of subject 4: " + s4);
        System.out.println("marks of subject 5: " + s5);
        System.out.println("total marks = " + total);
    }
}
