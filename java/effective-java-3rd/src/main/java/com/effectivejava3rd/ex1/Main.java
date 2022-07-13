package com.effectivejava3rd.ex1;


public class Main {
    public static void main(String[] args) {
        // lambda
        MyFunction f = new MyFunction() {
            public int max(int a, int b) {  // 오버라이딩 접근 제어자는 좁게 못바꾼다.
                return a > b ? a : b;
            }
        };


        int value = f.max(3, 5);
        System.out.println("value = " + value);

        // 람다식(익명 객체)를 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
        MyFunction f2 = (a, b) -> a > b ? a : b;  // 람다식, 익명 객체
        int value2 = f2.max(7, 11);
        System.out.println("value2 = " + value2);

    }

    @FunctionalInterface // annotation 을 통해 함수형 인터페이스는 추상 메서드 1개를 컴파일 시점에 확인
    interface MyFunction {
        int max(int a, int b);
//        int max2(int a);
    }

}