package com.company;
import java.util.*;
public class Exp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name");
        String emp_name = sc.nextLine();
        System.out.println("Enter employee no");
        int emp_no = sc.nextInt();
        double basic = 25000;
        double DA = 0.7 * basic;
        double HRA = 0.3 * basic;
        double CCA = 240;
        double PF = 0.1 * basic;
        double PT = 100;
        double gross_salary = basic + DA + HRA + CCA;
        double net_salary = gross_salary - PF - PT;
        System.out.println("The name of the employee is " + emp_name);
        System.out.println("The employee number is " + emp_no);
        System.out.println("The gross salary is " + gross_salary);
        System.out.println("The net salary is " + net_salary);
    }
}
