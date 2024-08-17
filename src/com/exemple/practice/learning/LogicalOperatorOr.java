package com.exemple.practice.learning;

public class LogicalOperatorOr {
    public static void main(String[] args){
        boolean hasJob = true;
        boolean hasCompany = false;
        boolean has50k = true;
        boolean canFinance = (hasCompany || hasJob) && has50k;
        System.out.println(canFinance);
    }
}

