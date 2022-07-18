package com.effectivejava3rd.ex1;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("ABCDE");
        Optional<Integer> optInt = optStr.map(String::length);
        System.out.println("optStr.get() = " + optStr.get());
        System.out.println("optInt.get() = " + optInt.get());

        Integer result1 = Optional.of("123")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt)
                .get();

        Integer result2 = Optional.of("")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).orElse(-1);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        Optional.of("456")
                .map(Integer::parseInt)
                .ifPresent(x -> System.out.println("x = " + x));


    }
}