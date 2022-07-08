package com.effectivejava3rd.ex1;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> aBox = new FruitBox<>();
        // extends 가 아니여서 안됨
//        FruitBox<Toy> toyBox = FruitBox < Toy > ();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Banana());

        // fruit 과  그 자손들
        FruitBox<? extends Fruit> fruitBox2 = new FruitBox<>();
    }

    static class Fruit implements Eatable {
    }

    static class Apple extends Fruit {
    }

    static class Banana extends Fruit {
    }

    static class Toy {
    }

    interface Eatable {
    }

    static class FruitBox<E extends Fruit & Eatable> extends Box<E> {
    }

    static class Box<E> {
        ArrayList<E> list = new ArrayList<>();

        void add(E item) {
            list.add(item);
        }

        E get(int i) {
            return list.get(i);
        }

        int size() {
            return list.size();
        }

        public String toString() {
            return list.toString();
        }
    }

}
