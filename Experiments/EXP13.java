package com.company;
import java.util.*;
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        System.out.println(message);
    }
}
public class EXP13 {
    public static void main(String[] args) throws InvalidPasswordException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Login ID");
        String login_id = sc.next();
        System.out.println("Enter Password");
        String password = sc.next();
        try {
            if (password.matches("^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,}$")) {
                System.out.println("Login Successful");
            } else {
                throw new InvalidPasswordException("Please enter valid password of length 8 containing one digit and one Special Symbol");
            }
        }
        catch (InvalidPasswordException e) {
            System.out.println(e);
        }
    }
}


