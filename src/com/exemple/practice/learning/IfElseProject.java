package com.exemple.practice.learning;

import java.util.Scanner;

public class IfElseProject {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        String numberString = Integer.toString(number);

        if (numberString.length() <= 1) {
            System.out.print("The entered number has " + numberString.length() + " digit.");
        } else if (numberString.length() > 1 && numberString.length() < 5) {
            System.out.print("The entered number has " + numberString.length() + " digits.");
        } else if (numberString.length() >= 5) {
            System.out.println("The entered number has " + numberString.length() + " digits or more.");
        }
    }
}

