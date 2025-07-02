package com.autobots._java.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaLesson {
    public static void main(String[] args) {
        MathOperation addition = (a,b) -> a + b;
        MathOperation multiply = (a,b) -> a * b;

        Predicate<String> isNotEmpty = s -> !s.isEmpty();
        System.out.println(isNotEmpty.test(""));
        System.out.println(isNotEmpty.test("fs"));
        System.out.println("5+3 = "+ addition.operation(5,3));
        System.out.println("5*3 = "+ multiply.operation(5,3));

        Function<Integer, String> toStringFun = i -> "Number: " + i;
        System.out.println(toStringFun.apply(10));

        Consumer<String> print = s -> System.out.println("Writing: "+ s);
        print.accept("Hello world");
    }
}
