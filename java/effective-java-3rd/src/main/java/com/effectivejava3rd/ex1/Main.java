package com.effectivejava3rd.ex1;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("myId", "1234");
        map.put("myd", "1234");
        map.put("myI", "1111");

        System.out.println("map = " + map);

        for (Object o : map.keySet()) {
            System.out.println("map.get(o) = " + map.get(o));
        }

        for (Object o : map.keySet()) {
            System.out.println("o = " + o);
        }
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