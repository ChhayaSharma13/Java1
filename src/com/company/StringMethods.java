package com.company;

import java.util.Locale;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Length of the String: "+ str.length());
        System.out.println("String to lowercase: "+ str.toLowerCase());
        System.out.println("Character at 3 is: "+ str.charAt(2));
        System.out.println("\"Java\" is my favorite programming language");
    }
}
