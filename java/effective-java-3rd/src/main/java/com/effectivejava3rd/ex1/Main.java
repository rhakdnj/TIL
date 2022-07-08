package com.effectivejava3rd.ex1;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strings);
        System.out.println("strings.toString() = " + Arrays.toString(strings));

        Arrays.sort(strings, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Arrays.toString(strings) = " + Arrays.toString(strings));

        Arrays.sort(strings, new Descending());
        System.out.println("Arrays.toString(strings) = " + Arrays.toString(strings));
    }

    static class Descending implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            if (o1 instanceof Comparable && o2 instanceof Comparable) {
                Comparable c1 = (Comparable) o1;
                Comparable c2 = (Comparable) o2;
                return c1.compareTo(c2) * -1;
            }
            return -1;
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