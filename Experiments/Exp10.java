package com.company;
class hierarchy {
    hierarchy() {
        System.out.println("Hello I am a sports player");
    }
    String name;
    protected int salary;
}
class Hockey extends hierarchy {
    String name = "Soham Desai";
    int no_of_matches = 20;
    int goals_scored = 9;
    String country = "India";

    Hockey() {
        System.out.println("I am a hockey player");
    }
    public void display_info() {
        System.out.println("The name of the player is " + name);
        System.out.println("The number of matches played are " + no_of_matches);
        System.out.println("The number of goals scored are " + goals_scored);
        System.out.println("The country from which I play is "+country);
    }
}
class Athlete extends hierarchy {
    Athlete() {
        System.out.println("I am athlete");
    }
    String event;
    int no_of_matches = 10;
    String name = "Soham";
    String country = "India";
    public void display_info() {
        System.out.println("The name of the player is " + name);
        System.out.println("The no of matches played are " + no_of_matches);
        System.out.println("The country from which I play is "+country);
    }
}
public class Exp10 {
    public static void main(String[] args) {
        Hockey hockey = new Hockey();
        hockey.display_info();
        System.out.println();
        Athlete athlete = new Athlete();
        athlete.display_info();
    }
}
