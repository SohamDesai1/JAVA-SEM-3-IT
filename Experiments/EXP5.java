package com.company;
import java.util.*;
class Area {
    int length, breadth;
    public void setDim(int a, int b) {
        length = a;
        breadth = b;
    }
    public int getArea() {
        return length * breadth;
    }
}
public class EXP5 {
    public static void main(String[] args) {
        Area rec = new Area();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The length and breadth of rectangle ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        rec.setDim(a, b);
        System.out.println("The area of rectangle is " + rec.getArea());
    }
}
