package com.company;

interface Bicycle {
    void apply_brake(int decrement);
    void speedup(int increment);
}

class Avon_cycle implements Bicycle {
    int speed = 7;
    @Override
    public void apply_brake(int decrement) {
        speed = speed - decrement;
        System.out.println("The speed is reduced to "+speed);
    }
    @Override
    public void speedup(int increment) {
        speed = speed + increment;
        System.out.println("The speed is increased to "+speed);

    }
}

class Interface {
    public static void main(String[] args) {
        Avon_cycle soham = new Avon_cycle();
        soham.apply_brake(3);
        soham.speedup(5);
    }
}
