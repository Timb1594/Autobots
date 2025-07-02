package com.autobots._java.lambda.bank;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(isEven(141));
        sum(12,13);
        printSum(11,1);
    }
    public static boolean isEven(int number){
        return true? number%2==0: number%2 ==1;
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static void printSum(int a, int b){
        System.out.println(sum(12,17));
    }
}
