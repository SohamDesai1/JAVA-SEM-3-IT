package com.company;

import java.util.*;

public class race {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int biker1, biker2, biker3, biker4, biker5;
        System.out.println("Enter the speed of bikers ");
        biker1 = sc.nextInt();
        biker2 = sc.nextInt();
        biker3 = sc.nextInt();
        biker4 = sc.nextInt();
        biker5 = sc.nextInt();
        int average = (biker1 + biker2 + biker3 + biker4 + biker5) / 5;
        System.out.println("The average speed of bikers is " + average);
        if (biker1 > average) {
            System.out.println("biker1 is qualified with speed of " + biker1);
        }
        if (biker2 > average) {
            System.out.println("biker2 is qualified with speed of " + biker2);
        }
        if (biker3 > average) {
            System.out.println("biker3 is qualified with speed of " + biker3);
        }
        if (biker4 > average) {
            System.out.println("biker4 is qualified with speed of " + biker4);
        }
        if (biker5 > average) {
            System.out.println("biker5 is qualified with speed of " + biker5);
        }

    }
}
