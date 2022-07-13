package com.effectivejava3rd.ex1;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        // list 모든 요소를 출력
        list.forEach(i -> System.out.print(i + ", "));
        System.out.println();

        // list 에서 2 또는 3의 배수를 제거
        list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
        System.out.println("list = " + list);

        list.replaceAll(i -> i * 10);  // 모든 요소에 10을 곱한다.
        System.out.println("list = " + list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");

        map.forEach((k, v) -> System.out.print("{" + k + ", " + v + "}, "));
    }
}