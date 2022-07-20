package com.effectivejava3rd.ex1;

public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {
        // 생성자는 private 로 하여 외부에서 객체 생성을 막음
    }

    public static Singleton getInstance() {
        return instance;
    }
}
