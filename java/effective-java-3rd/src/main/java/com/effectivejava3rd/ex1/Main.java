package com.effectivejava3rd.ex1;


public class Main {
    public static void main(String[] args) {
        MyFunction f1 = () -> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction() {  // 익명 클래스로 run()을 구현
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(() -> System.out.println("f1.run"));
    }

    @FunctionalInterface
    interface MyFunction {
        void run();  // public abstract void run();
    }

    static void execute(MyFunction function) {
        function.run();
    }

    static MyFunction getMyFunction() {
        return () -> System.out.println("f3.run()");
    }
}