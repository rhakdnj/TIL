package com.effectivejava3rd.item02;

public class NutritionFacts {

    private int servingSize;
    private int sodium;
    private int carbohydrate;
    private int servings;

    public NutritionFacts(int servingSize, int sodium, int carbohydrate, int servings) {
        this.servingSize = servingSize;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
        this.servings = servings;
    }

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts(1, 6, 10, 20);
    }
}
