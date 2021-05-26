package com.company;

public class RandomNumbers {
    public static void main(String[] args) {
        for(int i=0; i<10;i++) {
            int a = (int) (Math.random() * 10);
            int b = (int) (Math.random() * 10);
            if (a == b) {
                System.out.println("Both numbers are equal " + a);
            } else {
                System.out.println("Numbers aren't equal " + a + " & " + b);
            }
        }
    }
}
