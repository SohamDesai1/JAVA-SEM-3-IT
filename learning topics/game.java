package com.company;
import java.util.*;
public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for stone, 1 for paper and 2 for scissors ");
        int x = sc.nextInt();
        Random random = new Random();
        int y = random.nextInt(3);
        if (y == x) {
            System.out.println("It is a draw");
        } else if (x == 0 && y == 2 || x == 1 && y == 0 || x == 2 && y == 1) {
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }
        System.out.println("the computer chose " + y);
    }
}
