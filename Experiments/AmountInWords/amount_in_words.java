package com.company.AmountInWords;

import java.util.Scanner;

public class amount_in_words {
    private static final String [] Ones = {"null", "One", "Two", "Three", "Four", "Five", "Five",
            "Six", "Seven", "Eight", "Nine"};
    private static final String [] Teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String [] Tens = {"null", "null", "Twenty", "Thirty", "Forty", "Fifty", "Sixty",
            "Seventy", "Eighty", "Ninety"};
    public static String AmountInWords(int number) {
        if (number < 10) {
            return Ones[number];
        } else if (number < 20) {
            return Teens[number % 10];
        } else if (number < 100) {
            return Tens[number / 10] + ((number % 10 > 0) ? " " + AmountInWords(number % 10):"");
        } else if (number < 1000) {
            return Ones[number / 100] + ((number % 100 > 0) ? " " + AmountInWords(number %100):
                    "");
        }
        return AmountInWords(number / 1000)+((number%1000>0)? ""+
                AmountInWords(number%1000): "");
    }
}

class NumberToWords
{
    public static void main(String[] args)
    {
        int num;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the amount: ");
            amount_in_words obj = new amount_in_words();
            num= sc.nextInt();
            if (num >= 1 && num <= 100000) {
                System.out.println(obj.AmountInWords(num));
            } else {
                System.out.println("Enter right input");
            }
        }while(num<0 || num>100000);
    }
}
