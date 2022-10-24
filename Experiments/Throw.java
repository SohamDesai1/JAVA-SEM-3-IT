package com.company;

class Main {
    public static void divideByZero() {

        // throw an exception
        throw new ArithmeticException("Trying to divide by 0");
    }

    public static void main(String[] args) {
        divideByZero();
    }
}
