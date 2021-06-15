package com.company;

public class NestedSwitchCase {
    public static void main(String[] args) {
        int tech = 2;
        int course = 4;
        switch (tech){
            case 1:
                System.out.println("AI");
                break;
            case 2:
                switch (course) {
                    case 1:
                        System.out.println("Python");
                        break;
                    case 2:
                        System.out.println("Advance Java");
                        break;
                    default:
                        System.out.println("We don't have that course, sorry");
                        break;
                }
                break;
            default:
                System.out.println("Learn S.E definitions , hehehe ");
                break;
        }
    }
}
