package com.company;

import java.util.*;

public class PS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice:\n" +
                    "1.GCD and LCM of a number\n" +
                    "2.To print n fibonacci series\n" +
                    "3.Factorial of a number\n" +
                    "4.To solve 1 + 2 + 3 + 4 +...+ (n- 1 ) + n\n" +
                    "0.Quit");
            int user_choice = sc.nextInt();
            switch (user_choice) {
                case 1:
                    int a, b, t, x, y, lcm, gcd;
                    System.out.println("Enter Two Number");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    x = a;
                    y = b;
                    while (y != 0) {
                        t = y;
                        y = x % y;
                        x = t;
                    }
                    gcd = x;
                    lcm = (a * b) / gcd;
                    System.out.println("LCM = " + lcm);
                    System.out.println("GCD = " + gcd);
                    break;

                case 2:
                    System.out.println("Enter the number of fibonacci series numbers:");
                    int firstTerm = 0, secondTerm = 1;
                    int num2 = sc.nextInt();
                    System.out.println("The fibonacci series until " + num2 + " is:");
                    for (int l = 1; l <= num2; l++) {
                        System.out.print(+firstTerm);
                        System.out.println();
                        int nextTerm = firstTerm + secondTerm;
                        firstTerm = secondTerm;
                        secondTerm = nextTerm;
                    }
                    break;

                case 3:
                    System.out.println("Enter the number:");
                    int n1 = sc.nextInt();
                    int fact = 1;
                    for (int i = 1; i <= n1; i++) {
                        fact = fact * i;
                    }
                    System.out.println("Factorial of " + n1 + " is " + fact);
                    break;
                case 4:
                    int n, sum = 0;
                    System.out.println("Enter till where you want the sum");
                    n = sc.nextInt();
                    for (int i = 1; i <= n; i++)
                        sum = sum + i;
                    System.out.println("The sum of the series is " + sum);
                    break;

                case 0:
                    System.out.println("Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Please enter a valid choice");
            }
        }
    }
}
