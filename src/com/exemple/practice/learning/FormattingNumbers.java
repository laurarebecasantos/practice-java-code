package com.exemple.practice.learning;

import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args){
        NumberFormat pound = NumberFormat.getCurrencyInstance();
        String productValue = pound.format(2150.00);
        System.out.println(productValue);
    }
}

