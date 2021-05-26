package com.company;

public class typeCasting {
    static int myInteger = 2;
    static double myDouble = 23.67;
    static float myFloat = 2.56006f;

    static double newDouble = myInteger;

    public static void main(String[] args) {
        System.out.println("Automatically typecasted Integer to Double = "+ newDouble);
        System.out.println("float number = "+ myFloat);

//      Narrowing casting
        int newInt = (int) myDouble;
        System.out.println("Typecasted new integer = "+ newInt);
    }


}
