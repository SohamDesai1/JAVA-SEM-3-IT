package com.company;
class Parent {
    Parent() {
        this(5);
        System.out.println("This is default");
    }
    Parent(int x) {
        this(5, 7);
        System.out.println("This is parameterized second");
    }
    Parent(int x, int y) {
        System.out.println("This is parameterized third");
    }
}
public class Constr_chain {
    public static void main(String[] args) {
        new Parent();
    }
}
