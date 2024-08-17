package com.exemple.practice.learning;


public class CreateMethods {
    public static void main(String[] args) {
        productList("Orange", 12.0);
        productList("Banana", 13.0);
    }
    public static void productList(String productName, Double productValue) {
        System.out.println(productName + ": $" + productValue + " ");
    }
}

