package com.company;
import java.util.*;
class Overloading{
    void display(){
        int a=7,b=4;
        System.out.println("The value of a is "+a+" and b is " +b);
    }
    void display(int x){
        System.out.println("Value of x is "+x);
    }
    void display(int x,int y){
        System.out.println("The value of x is "+x+ " and y is " +y);
    }
}
public class Method_overload {
    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        overloading.display();
        overloading.display(10);
        overloading.display(8,4);
    }
}
