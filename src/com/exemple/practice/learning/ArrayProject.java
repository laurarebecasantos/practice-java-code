package com.exemple.practice.learning;

import java.util.Arrays;

public class ArrayProject {
    public static void main(String[] args){
        int[] arrayInt = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        String[] arrayString = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C programming",
                "C++"};
        System.out.println("Integer array - original: " + Arrays.toString(arrayInt));
        Arrays.sort(arrayInt);
        System.out.println("Integer array - Sorted: " + Arrays.toString(arrayInt));
        System.out.println("String array - original: " + Arrays.toString(arrayString));
        Arrays.sort(arrayString);
        System.out.println("String array - Sorted: " + Arrays.toString(arrayString));

    }
}
