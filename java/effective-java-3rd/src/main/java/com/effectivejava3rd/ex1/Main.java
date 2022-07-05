package com.effectivejava3rd.ex1;


public class Main {
    public static void main(String[] args) {
        System.out.println("InstanceInner.cv = " + Outer.InstanceInner.cv);
        System.out.println("InstanceInner.CONST = " + Outer.InstanceInner.CONST);
        System.out.println("StaticInner.cv = " + Outer.StaticInner.cv);
    }
}

class Outer {
    private int outerIv = 10;
    private static int outerCv = 20;
    class InstanceInner {
        int iv = outerIv;
        static int cv = outerCv;
        final static int CONST = 30;  // final static은 상수이므로 허용
    }

    static class StaticInner {
        // 스태틱 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없다.
        int iv = outerCv;
        static int cv = 40;  // static 클래스만 static 멤버를 정의할 수 있음
    }

    void myMethod() {
        int Iv = 0;
        final int Lv = 0;  // JDK 1.8부터 final 생략 가능
//        Iv +=3;
        class LocalInner {
            int iv = Iv;
            static int cv = 20;
            final static int CONST = 300;
        }
    }
}