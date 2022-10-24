package com.company;
interface Vehicle {
    void speed();
    void apply_brake(int x);
    void fuel();
}
class Bike implements Vehicle {
    int speed = 45;
    @Override
    public void speed() {
        System.out.println("The speed of bike is " + speed);
    }
    @Override
    public void apply_brake(int x) {
        speed = speed - x;
        System.out.println("The speed of bike is reduced to " + speed);
    }
    @Override
    public void fuel() {
        System.out.println("The fuel used in bike is petrol");
    }
}
class bicycle1 implements Vehicle {
    int speed = 15;
    @Override
    public void speed() {
        System.out.println("The speed of bicycle is " + speed);
    }
    @Override
    public void apply_brake(int x) {
        speed = speed - x;
        System.out.println("speed of cycle is reduced to " + speed);
    }
    @Override
    public void fuel() {
        System.out.println("No fuel is needed");
    }
}
class car implements Vehicle {
    int speed = 60;
    String fuel = "Diesel";
    @Override
    public void speed() {
        System.out.println("The speed of car is " + speed);
    }
    @Override
    public void apply_brake(int x) {
        speed = speed - x;
        System.out.println("speed of car is reduced to " + speed);
    }
    @Override
    public void fuel() {
        System.out.println("The fuel of the car is " + fuel);
    }
}
public class EXP11 {
    public static void main(String[] args) {
        Bike a = new Bike();
        a.speed();
        a.apply_brake(13);
        a.fuel();
        bicycle1 b = new bicycle1();
        b.speed();
        b.apply_brake(3);
        b.fuel();
        car c = new car();
        c.speed();
        c.apply_brake(18);
        c.fuel();
    }
}
