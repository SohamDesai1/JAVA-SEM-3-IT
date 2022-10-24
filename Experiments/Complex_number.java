package com.company;
import java.util.*;
class Complex {
    double a1, a2, b1, b2;
    double Re, Im;
    Complex(double m1, double n1, double m2, double n2) {
        a1 = m1;
        b1 = n1;
        a2 = m2;
        b2 = n2;
    }
    void Add() {
        System.out.println("The addition is");
        Re = a1 + a2;
        Im = b1 + b2;
        System.out.println("The Sum of Complex Numbers (" + a1 + ")+i(" + b1 + ") and (" + a2 + ")+i(" + b2 + ") is (" + Re + ")+i(" + Im + ")");
    }
    void Subtract() {
        System.out.println("The subtraction is");
        Re = a1 - a2;
        Im = b1 - b2;
        System.out.println("The Difference of Complex Numbers (" + a1 + ")+i(" + b1 + ") and (" + a2 + ")+i(" + b2 + ") is (" + Re + ")+i(" + Im + ")");
    }
    void Product() {
        System.out.println("The product is");
        Re = (a1 * a2) - (b1 * b2);
        Im = (a1 * b2) + (a2 * b1);
        System.out.println("The Product of Complex Numbers (" + a1 + ")+i(" + b1 + ") and (" + a2 + ")+i(" + b2 + ") is (" + Re + ")+i(" + Im + ")");
    }
}
public class Complex_number {
    public static void main(String[] args) {
        double x1,y1,x2,y2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Real part of 1st number: ");
        x1 = sc.nextDouble();
        System.out.print("Enter Imaginary part of 1st number: ");
        y1 = sc.nextDouble();
        System.out.print("Enter Real part of 2st number: ");
        x2 = sc.nextDouble();
        System.out.print("Enter Imaginary part of 2st number: ");
        y2 = sc.nextDouble();
        Complex c = new Complex(x1,y1,x2,y2);
        c.Add();
        c.Subtract();
        c.Product();
    }
}
