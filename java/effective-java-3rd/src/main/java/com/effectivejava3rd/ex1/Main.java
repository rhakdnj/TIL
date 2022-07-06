package com.effectivejava3rd.ex1;


import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main 메서드에서 예외를 처리");
        }
    }

    private static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1 메서드에서 예외를 처리");
            throw e;  // 다시 예외 발생.. 예외를 일부 처리
        }
    }
}