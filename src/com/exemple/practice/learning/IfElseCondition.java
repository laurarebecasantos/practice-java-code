package com.exemple.practice.learning;

public class IfElseCondition {
    public static void main(String[] args){
        int carValue = 80_000;
        if (carValue > 100_000) {
            System.out.println("Don't buy. Price is above the limit.");
        } else if (carValue >= 90_000 && carValue <= 100_000) {
            throw new RuntimeException("You may buy the car.");
        } else {
            System.out.println("Acceptable price. You may buy the car.");
        }
    }
}
