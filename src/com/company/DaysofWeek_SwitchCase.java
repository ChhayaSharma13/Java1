package com.company;

import java.util.Scanner;

public class DaysofWeek_SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day in number: ");
        int dayOfWeek = sc.nextInt();
        switch (dayOfWeek) {
            case 1:
                System.out.println("Today is Monday (:");
                break;
            case 2:
                System.out.println("Its Tuesday, again Workday");
                break;
            case 3:
                System.out.println("Its Wednesday, again Workday");
                break;
            case 4:
                System.out.println("Its Thursday, Weekend is close");
                break;
            case 5:
                System.out.println("Heavens, Its Friday");
                break;
            case 6:
                System.out.println("Saturday night, date night :) ");
                break;
            case 7:
                System.out.println("Sunday, is Fun day");
                break;
            default:
                System.out.println("You idiot, there are only 7 days, heheheh! ");
                break;
        }
    }
}
