package com.effectivejava3rd.ex1;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String line = "Test 15 lqlq 35 bad 99999 guess 34";

        int sum = Arrays
                .stream(line.split(" "))
                .filter((s) -> s.matches("\\d+"))  // 10 진수 정수
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println(sum);
    }
}
