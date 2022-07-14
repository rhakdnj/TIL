package com.effectivejava3rd.ex1;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream();  // list 를 스트림으로 변환

        // stream 모든 요소를 출력
        intStream.forEach(System.out::print);  // 12345
        intStream.forEach(System.out::print);  // err. stream closed
    }
}