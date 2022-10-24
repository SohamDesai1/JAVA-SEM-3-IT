package com.company;
class MyThread extends Thread{
    @Override
    public void run(){
        while (true) {
            System.out.println("HEllo");
            System.out.println("bhag");
        }
    }
}
class mythread extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("etyhg");
        }
    }
}
public class Threading_bythreadclass {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        mythread m1 = new mythread();
        m.start();
        m1.start();
    }

}

