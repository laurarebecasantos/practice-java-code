package com.exemple.practice.learning;

import java.text.NumberFormat;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        System.out.print("Enter the name of the fruit: ");
        String productName = scanner.nextLine();
        String fruit = productName.toLowerCase();

        switch (fruit) {
            case "banana":
                System.out.print(currencyFormat.format(9.50));
                break;
            case "tangerine":
                System.out.print(currencyFormat.format(18.00));
                break;
            case "acerola":
                System.out.print(currencyFormat.format(4.50));
                break;
            case "mango":
                System.out.println(currencyFormat.format(12.80));
                break;
            case "avocado":
                System.out.println(currencyFormat.format(16.10));
                break;
            default:
                System.out.println("Fruit not found.");
        }
    }
}
