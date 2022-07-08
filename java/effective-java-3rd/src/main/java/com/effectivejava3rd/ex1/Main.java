package com.effectivejava3rd.ex1;


import java.util.*;

import static java.util.Collections.*;


public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        addAll(list, 1, 2, 3, 4, 5);
        System.out.println("list = " + list);

        rotate(list, 2);
        System.out.println("list = " + list);

        swap(list, 0, 2);
        System.out.println("list = " + list);

        shuffle(list);
        System.out.println("list = " + list);

        sort(list, reverseOrder());
        System.out.println("list = " + list);

        sort(list);
        System.out.println("list = " + list);

        int idx = binarySearch(list, 3);
        System.out.println("index of 3 = " + idx);

        System.out.println("max : " + max(list));
        System.out.println("min : " + min(list));

        fill(list, 11);
        System.out.println("list = " + list);

        // list와 같은 크기의 새로운 list를 생성하고 2로 채운다.
        List<Integer> newList = nCopies(list.size(), 2);

        // 공통요소가 없으면 true
        System.out.println(disjoint(newList, list));

        copy(list, newList);

        replaceAll(list, 2, 1);

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