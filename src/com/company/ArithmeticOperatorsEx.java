package com.company;

import java.util.Scanner;

public class ArithmeticOperatorsEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operand 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter operand 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter operator: ");
        char op = sc.next().charAt(0);
        int result = 0;

        switch(op) {
            case '+':
                result = num1 + num2;
                System.out.println("Addition is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Subtraction is: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication is: " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Division is: " + result);
                break;
        }
    }
}
