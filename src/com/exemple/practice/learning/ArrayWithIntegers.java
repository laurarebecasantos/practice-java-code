package com.exemple.practice.learning;

import java.util.Arrays;

public class ArrayWithIntegers {
    public static void main(String[] args) {
        int[] values = {10, 20, 15, 30, 40};
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
        System.out.println(values.length);
    }
}
