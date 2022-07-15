package com.effectivejava3rd.ex1;


import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String[]> strArrStream = Stream.of(new String[]{"abc", "def", "ghi"},
                new String[]{"ABC", "GHI", "JKL"});

        Stream<String> strStream = strArrStream.flatMap(Arrays::stream);

        strStream.map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        String[] lineArr = {
                "Believe or not It is true",
                "Do or do not There is no try",
        };

        Stream<String> lineStream = Arrays.stream(lineArr);

        List<String> strings = lineStream
                .flatMap(line -> Stream.of(line.split(" +"))) // 하나 이상의 공백 정규식
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .toList();

        for (String string : strings) {
            System.out.println(string);
        }

//        Stream<String[]> stream = lineStream.map(line -> line.split(" +"));
//
//        stream.forEach(s -> {3
//            for (String s1 : s) {
//                System.out.println("s1 = " + s1);
//            }
//        });
    }
}