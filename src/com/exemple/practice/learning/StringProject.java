package com.exemple.practice.learning;

import java.util.Scanner;

public class StringProject {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String text = scanner.nextLine();

        for (int i = 0; i <= text.length() -1; i++) {
            System.out.print(text.charAt(i) + " ");
        }
    }
}
