package com.exemple.practice.learning;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double ticketPrice;
        System.out.print("What is the value of your ticket? R$");
        ticketPrice = scanner.nextDouble();
        String accessLevel = ticketPrice >= 500 ? "VIP" : "General";
        System.out.println("The value of your ticket is: R$" + ticketPrice + ". You are "
                + accessLevel);
    }
}

