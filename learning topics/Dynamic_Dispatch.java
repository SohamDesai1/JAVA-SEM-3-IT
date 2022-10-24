package com.company;

import java.util.*;
class A1{
    public void greet(){
        System.out.println("bhagg");
    }
    public void hello(){
        System.out.println("heeeyy");
    }
}
class B1 extends A1{
    @Override
    public void greet(){
        System.out.println("gandu");
    }
}

public class Dynamic_Dispatch {
    public static void main(String[] args) {
        A1 a1 =new A1();
        a1.greet();
        A1 obj = new B1();
        obj.greet();
    }
}
