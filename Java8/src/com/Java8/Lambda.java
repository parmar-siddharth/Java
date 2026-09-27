package com.Java8;


@FunctionalInterface
interface Calculator {
    int calculate(int a,int b);
}


public class Lambda {
    static void main() {
        Calculator add = (a,b) -> a + b;

        Calculator sub = (a,b) -> a - b;

        Calculator mul = (a,b) -> a * b;


        System.out.println(add.calculate(5,6));
    }
}
