package com.effectivejava3rd.ex1;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        계산기 a계산기 = new 계산기();
        a계산기.num1 = 10;
        a계산기.num2 = 20;

        int 결과1 = a계산기.수행((num1, num2) -> num1 + num2);
        System.out.println(결과1); // 30

        int 결과2 = a계산기.수행((num1, num2) -> num1 - num2);
        System.out.println(결과2); // -10

        int 결과3 = a계산기.수행((num1, num2) -> num1 * num2);
        System.out.println(결과3); // 300
    }
    static class 계산기 {
        int num1;
        int num2;

        int 수행(식 a식) {
            return a식.실행(num1, num2);
        }
    }
    interface 식 {
        public int 실행(int num1, int num2);
    }
}
