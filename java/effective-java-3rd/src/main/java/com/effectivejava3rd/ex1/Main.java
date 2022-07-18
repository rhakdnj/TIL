package com.effectivejava3rd.ex1;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        int[] arr = null;          // 가능은 하지만 null pointer exception 발생 가능
        int[] arr = new int[0];
        System.out.println("arr.length = " + arr.length);

//        Optional<String> opt1 = null;  // OK. 하지만 바람직 하지 않음
        Optional<String> opt2 = Optional.empty();
        System.out.println("opt = " + opt2);
//        System.out.println("opt.get() = " + opt2.get());  // NoSuchElementException

        String str = "";
        str = opt2.orElseGet(String::new);
        System.out.println("str = " + str);  // 빈문자열
        str = opt2.orElse("abc");  // optional에 지정된 값이 null 이면 "abc" 반환
        System.out.println("str = " + str);  // abc

    }
}