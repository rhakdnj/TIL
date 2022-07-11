package com.effectivejava3rd.ex1;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        appleBox.add(new Apple());
        appleBox.add(new Apple());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }

    static class Fruit {
        @Override
        public String toString() {
            return "Fruit";
        }
    }

    static class Apple extends Fruit {
        @Override
        public String toString() {
            return "Apple";
        }
    }

    static class Grape extends Fruit {
        @Override
        public String toString() {
            return "Grape";
        }
    }

    static class Juice {
        String name;
        Juice(String name) { this.name = name + "Juice";}
        public String toString() { return name;}
    }

    static class Juicer {
        // Fruit 과 Fruit의 자손 ok
        static Juice makeJuice(FruitBox<? extends Fruit> box) {
            StringBuilder temp = new StringBuilder();
            for (Fruit fruit : box.getList()) {
                temp.append(fruit).append(" ");
            }
            return new Juice(temp.toString());
        }
    }

    static class FruitBox<E extends Fruit> extends Box<E> {
    }

    static class Box<E> {
        ArrayList<E> list = new ArrayList<>();

        void add(E item) {
            list.add(item);
        }

        E get(int i) {
            return list.get(i);
        }

        ArrayList<E> getList() { return list;}

        int size() {
            return list.size();
        }

        public String toString() {
            return list.toString();
        }
    }

}
