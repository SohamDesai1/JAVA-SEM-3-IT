package com.company;
public class Exceptional_handling {
    public static void main(String[] args) {
        try {
            int x = 25 / 0;
            System.out.println(x);
        } catch (ArithmeticException a) {
            System.out.println(a);
        } finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code");
    }

}

