package com.effectivejava3rd.ex1;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "aaa", "bb", "dd", "aaa");

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });

        Collections.sort(list, (s1, s2) -> s2.compareTo(s1));

        System.out.println("list : " + list);
    }
}