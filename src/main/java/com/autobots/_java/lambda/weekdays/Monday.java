package com.autobots._java.lambda.weekdays;

public class Monday {
    public static void main(String[] args) {
        Monday m = new Monday();
        System.out.println(m.roundIfNeeded(17));
        System.out.println(m.roundIfNeeded(12));
    }

    public int roundIfNeeded(int num) {
        int lastDigit = num % 10;
        if (lastDigit >= 5) {
            return (num / 10 + 1) * 10; // округлить вверх до ближайшего десятка
        } else {
            return (num / 10) * 10;     // округлить вниз
        }
    }
}