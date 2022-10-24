package com.company;

import java.util.*;
class A{
    int a=10;
    public void showA(){
        System.out.println(a);
    }
}
class B extends A{
    int b =20;
    public void showB(){
        System.out.println(b);
    }
}
public class lec {
    public static void main(String[] args) {
        B b=new B();
        b.showA();
        b.showB();
    }
}
