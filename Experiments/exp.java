package com.company;
import java.util.*;
public class exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice:\n" +
                    "1.factorial\n" +
                    "2.test an armstrong number\n" +
                    "3.test the palindrome\n" +
                    "4.test a prime number\n" +
                    "5.print fibonacci series\n" +
                    "0.Quit");
            int user_choice = sc.nextInt();
            switch (user_choice) {
                case 1:
                    int i, fact = 1;
                    System.out.println("Enter the number you want the factorial of:");
                    int n = sc.nextInt();
                    for (i = 1; i <= n; i++) {
                        fact = fact * i;
                    }
                    System.out.println("The factorial of " + n + " is " + fact);
                    break;
                case 2:
                    int x, rem, temp, num = 0;
                    System.out.println("Enter a positive number:");
                    x = sc.nextInt();
                    temp = x;
                    while (temp != 0) {
                        rem = temp % 10;
                        num += Math.pow(rem, 3);
                        temp = temp / 10;
                    }
                    if (num == x)
                        System.out.println("It is an armstrong number");
                    else
                        System.out.println("It is not an armstrong number");
                    break;
                case 3:
                    int n1, r, sum = 0, temp1;
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter the number ");
                    n1 = sc.nextInt();
                    temp1 = n1;
                    while (n1 > 0) {
                        r = n1 % 10;
                        sum = (sum * 10) + r;
                        n1 = n1 / 10;
                    }
                    if (temp1 == sum)
                        System.out.println("palindrome number ");
                    else
                        System.out.println("not a palindrome");
                    break;
                case 4:
                    System.out.println("Enter the number:");
                    int num1 = sc.nextInt();
                    boolean flag = false;
                    for (int k = 2; k <= num1 / 2; ++k) {
                        if (num1 % k == 0) {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag)
                        System.out.println(num1 + " is a prime number.");
                    else
                        System.out.println(num1 + " is not a prime number.");
                    break;
                case 5:
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
                case 0:
                    System.out.println("Thank you!");
                    System.exit(0);
            }
        }
    }
}

