package com.effectivejava3rd.ex1;


import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        // 기본적으로 stream은 직렬 stream
        IntStream.range(1, 10).sequential().forEach(System.out::print);
        System.out.println();
        IntStream.range(1, 10).sequential().forEachOrdered(System.out::print);
        System.out.println();

        IntStream.range(1, 10).parallel().forEach(System.out::print);
        System.out.println();
        IntStream.range(1, 10).parallel().forEachOrdered(System.out::print);
        System.out.println();
    }
}