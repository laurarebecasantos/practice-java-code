package com.exemple.practice.learning;

import java.util.Scanner;
    public class ScannerClass {
        public static void main(String[] args) {
        Scanner ageScanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        byte customerAge = ageScanner.nextByte();
        System.out.println("You are " + customerAge + " years old.");
    }
}
