package com.effectivejava3rd.ex1;


import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        String[] strings = {
                "inheritance", "java", "lambda", "stream",
                "optionalDouble", "IntStream", "count", "sum"
        };

        Stream.of(strings).forEach(System.out::println);

        boolean noEmptyStr = Stream.of(strings).noneMatch(s -> s.length() == 0);
        Optional<String> sWord = Stream.of(strings)
                .filter(s -> s.charAt(0) == 's').findFirst();
        Optional<String> sWord2 = Stream.of(strings).parallel()
                .filter(s -> s.charAt(0) == 's').findAny();

        System.out.println("noEmptyStr = " + noEmptyStr);
        System.out.println("sWord.get() = " + sWord.get());
        System.out.println("sWord2.get() = " + sWord2.get());

        // Stream<String> -> Stream<Integer>
        Stream<Integer> intStream = Stream.of(strings).map(String::length);

        IntStream intStream1 = Stream.of(strings).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strings).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strings).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strings).mapToInt(String::length);

        int count = intStream1.reduce(0, (a, b) -> a + 1);
        int sum = intStream2.reduce(0, (a, b) -> a + b);

        OptionalInt max = intStream3.reduce(Integer::max);
        OptionalInt min = intStream4.reduce(Integer::min);

        System.out.println("count = " + count);
        System.out.println("sum = " + sum);
        System.out.println("max = " + max.orElseGet(() -> 0));
        System.out.println("min = " + min.orElse(0));

    }
}