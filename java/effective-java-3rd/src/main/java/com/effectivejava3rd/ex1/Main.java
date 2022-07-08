package com.effectivejava3rd.ex1;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.이름 = "홍길동";
        동물 a동물 = a사람;
        a동물.이름 = "홍길순";

        a사람.test();
        a동물.test();
    }
}

class 동물 {
    String 이름;

    void test() {
        System.out.println("이름 = " + 이름);
    }
}

class 사람 extends 동물 {
    String 이름;

    void test() {
        System.out.println("이름 = " + 이름);
    }
}

//    String line = "Test 15 lqlq 35 bad 99999 guess 34";
//
//        String[] arr = line.split(" ");
//        int sum1 = 0;
//        for (String s : arr) {
//            if (s.matches("\\d+")) {
//                sum1 += Integer.parseInt(s);
//            }
//        }
//        System.out.println("sum1 = " + sum1);
//
//        int sum = Arrays
//                .stream(line.split(" "))
//                .filter((s) -> s.matches("\\d+"))  // 10 진수 정수
//                .mapToInt(Integer::parseInt)
//                .sum();
//
//        String s = "30 + 40 + 20 + 40 + 20 + 50 + 11 +  -6 + -100";
//
//        int sum2 = Arrays
//                .stream(s.split("\\+"))
//                .map(String::trim)
//                .filter((c) -> c.matches("\\d+") || c.matches("-\\d+"))  // 10 진수 정수
//                .mapToInt(Integer::parseInt)
//                .sum();
//
//        System.out.println("sum2 = " + sum2);