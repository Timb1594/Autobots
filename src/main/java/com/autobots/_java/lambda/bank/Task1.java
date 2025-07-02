package com.autobots._java.lambda.bank;

public class Task1 {
    public static void main(String[] args) {
        printSquare(3);
        System.out.println(getSquare(2));
        System.out.println("__________");
        sayHello();
        sayHello1("Killian");
        System.out.println("__________");
        System.out.println(multiply(3,4));
Task1 sub = new Task1();
sub.subtract(10,5);
        System.out.println(sub.subtract(11,9));
    }
    public static void printSquare(int n){
        System.out.println(n*n);
    }
    public static int getSquare(int n){
        return n*n;
    }

    public static void sayHello(){
        System.out.println("Hello!");
    }
    public static void sayHello1(String name){
        System.out.println("Hello "+name);
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
}
