package com.exemple.practice.learning;


import java.util.Arrays;

public class StringArray {
    public static void main(String[] args){
        String[] cars = {"BMW", "Tesla", "Jeep", "Fiat"};
        cars[2] = "Ferrari";
        System.out.println(Arrays.toString(cars));
        System.out.println(cars[2]);
    }
}
