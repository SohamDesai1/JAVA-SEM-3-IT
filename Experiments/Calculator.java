package com.company;
import java.util.*;
public class Calculator {
    public static void add(float a, float b) {
        System.out.println("The result is:");
        System.out.println(a +" + "+b +" = " +(a + b));
    }

    public static void sub(float a, float b) {
        System.out.println("The result is:");
        System.out.println(a +" - "+b +" = " +(a - b));
    }

    public static void mul(float a, float b) {
        System.out.println("The result is:");
        System.out.println(a +" * "+b +" = " +(a * b));
    }

    public static void div(float a, float b) {
        System.out.println("The result is:");
        System.out.println(a +" / "+b +" = " +(a / b));
    }

    public static void main(String[] args) {
        int choice;
        float num1, num2;
        float result;
        do {
            System.out.println("Welcome to calculator");
            System.out.println("Enter your choice of operation");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");

            System.out.println("Enter your choice:");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter two numbers:");
                    num1 = sc.nextFloat();
                    num2 = sc.nextFloat();
                    add(num1, num2);
                    break;
                case 2:
                    System.out.println("Enter two numbers:");
                    num1 = sc.nextFloat();
                    num2 = sc.nextFloat();
                    sub(num1, num2);
                    break;
                case 3:
                    System.out.println("Enter two numbers:");
                    num1 = sc.nextFloat();
                    num2 = sc.nextFloat();
                    mul(num1, num2);
                    break;
                case 4:
                    System.out.println("Enter two numbers:");
                    num1 = sc.nextFloat();
                    num2 = sc.nextFloat();
                    div(num1, num2);
                    break;
                case 0:
                    System.out.println("Thank you for using calculator");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }
        } while (true);
    }
}

