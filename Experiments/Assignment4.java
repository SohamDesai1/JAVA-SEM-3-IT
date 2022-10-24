package com.company;
import java.io.IOException;
import java.util.Scanner;
class LessBalanceException extends Exception {
    private double detail;

    LessBalanceException(double a) {
        detail = a;
    }
    public String toString() {
        return "WithDraw Amount is Not Valid.";
    }
}
class Bank {
    double balance;
    static void compute(double a) throws LessBalanceException {
        if (a < 1000) {
            throw new LessBalanceException(a);
        }
    }
    void createAccount(String name, long no, String address, double amount) {
        System.out.println("Account is created ");
        System.out.println("Username is " + name);
        System.out.println("Phone no is " + no);
        System.out.println("Address is " + address);
        System.out.println("Initial amount is : ");
        balance = amount;
    }
    void deposit(double money) {
        balance += money;
        displayBalance();
    }
    void withdraw(double money) {
        try {
            double b1 = balance - money;
            compute(b1);
            balance -= money;
            displayBalance();
        } catch (LessBalanceException ex) {
            System.out.println(ex);
        }
    }
    void computeInterest() {
        System.out.println("interest is = " + (balance * 0.05));
        balance *= 1.05;
        displayBalance();
    }
    void displayBalance() {
        System.out.println("The balance is : " + balance);
    }
    void menu() {
        System.out.println("1. createAccount()");
        System.out.println("2. deposit() ");
        System.out.println("3. withdraw()");
        System.out.println("4. computeInterest()");
        System.out.println("5. displayBalance()");
    }
}
public class Assignment4 {
    public static void main(String[] args) throws IOException {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
        while (true) {
            bank.menu();
            System.out.println("Enter the choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the name of person : ");
                    String x1 = sc.nextLine();
                    System.out.println("Enter the phone no : ");
                    long phone = sc.nextLong();
                    System.out.println("Enter the Address : ");
                    String add = sc.nextLine();
                    System.out.println("Enter the initial Amount: ");
                    double amo = sc.nextDouble();
                    bank.createAccount(x1, phone, add, amo);
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit : ");
                    bank.deposit(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw : ");
                    bank.withdraw(sc.nextDouble());
                    break;
                case 4:
                    System.out.println(" Amount after interest is : ");
                    bank.computeInterest();
                    break;
                case 5:
                    bank.displayBalance();
                    break;
                    case 0:
                        System.exit(0);
            }
        }
    }
}