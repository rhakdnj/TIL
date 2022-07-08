package com.effectivejava3rd.ex1;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Tv());
        products.add(new Audio());

        for (Product product : products) {
            System.out.println("product = " + product);
        }
    }

    static class Product {}
    static class Tv extends Product {}
    static class Audio extends Product {}
}
