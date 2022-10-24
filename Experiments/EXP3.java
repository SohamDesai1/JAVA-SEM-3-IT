package com.company;
import java.util.*;
public class EXP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the variables a, b and c of the quadratic equation ");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double discriminant = (b * b) - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("There are no real roots");
        }
        else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        }
    }
}
