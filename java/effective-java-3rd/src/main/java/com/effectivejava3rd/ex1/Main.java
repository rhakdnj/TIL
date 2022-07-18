package com.effectivejava3rd.ex1;


public class Main {
    public static void main(String[] args) {
        Repo<Integer> a저장소1 = new Repo<Integer>();

        a저장소1.setData(30);
        int a = a저장소1.getData();

        System.out.println(a);

        Repo<Double> a저장소2 = new Repo<Double>();

        a저장소2.setData(5.5);
        double b = a저장소2.getData();

        System.out.println(b);


        Repo<사과> a저장소3 = new Repo<사과>();

        a저장소3.setData(new 사과());
        사과 c = a저장소3.getData();

        System.out.println(c);
    }

    static class Repo<T> {
        Object data;

        T getData() {
            return (T) data;
        }

        void setData(T data) {
            this.data = data;
        }
    }
    static class 사과 {
    }
}

