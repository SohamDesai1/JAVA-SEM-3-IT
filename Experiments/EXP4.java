package com.company;
import java.util.*;

public class EXP4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float initial_bal = 0;
        float roi = 5;
        do {
            System.out.println("Welcome to our bank please enter 1 for filling your details");
        }
        while (!true);
        while (true) {
            System.out.print("enter your choice of the operation:\n" +
                    "1.Open your account\n" +
                    "2.Deposit money\n" +
                    "3.Withdraw money\n" +
                    "4.Compute interest\n" +
                    "5.Check balance\n" +
                    "0.To quit\n");
            int user_choice = sc.nextInt();
            switch (user_choice) {
                case 1:
                    sc.nextLine();
                    System.out.println("Please enter your name:");
                    String name = sc.nextLine();
                    System.out.println("Please enter your account number:");
                    int acc_no = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Please enter your address:");
                    String address = sc.nextLine();
                    System.out.println("Please enter your contact number:");
                    int contact_num = sc.nextInt();
                    System.out.println("Enter your initial amount:");
                    initial_bal = sc.nextFloat();
                    System.out.println("Account created!");
                    System.out.println("Your name is " + name);
                    System.out.println("Your account number is: " + acc_no);
                    System.out.println("Your contact number is: " + contact_num);
                    System.out.println("your address is: " + address);
                    System.out.println("Your initial balance in the account is: " + initial_bal);
                    break;
                case 2:
                    System.out.println("Enter the amount you want to deposit");
                    float amount = sc.nextFloat();
                    if (amount <= 0) {
                        System.out.println("amount cannot be deposited");
                    } else {
                        initial_bal += amount;
                        System.out.println(amount + " has been deposited");
                        break;
                    }
                case 3:
                    System.out.println("Enter the amount you want to withdraw");
                    amount = sc.nextFloat();
                    if (amount <= 0 || amount > initial_bal) {
                        System.out.println("amount cannot be withdrawn");
                    } else {
                        initial_bal -= amount;
                        System.out.println(amount + " has been withdrawn");
                    }
                    break;
                case 4:
                    System.out.println("computing the interest in your account:");
                    initial_bal = (initial_bal * roi) / 100 + initial_bal;
                    System.out.println("The interest is computed and balance is: " + initial_bal);
                    break;
                case 5:
                    System.out.println("The current balance in your account is: " + initial_bal);
                    break;
                case 0:
                    System.out.println("Thank you!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter valid choice");
                    break;
            }
        }
    }
}
