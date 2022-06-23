package com.effectivejava3rd.item02;

import lombok.Builder;
import lombok.Singular;

import java.util.List;

@Builder
public class NutritionFactsLombok {
    private int servingSize;
    private int sodium;
    private int carbohydrate;
    private int servings;
    @Singular private List<String> names;

    public static void main(String[] args) {
        NutritionFactsLombok nutritionFactsLombok = NutritionFactsLombok.builder()
                .servings(10)
                .carbohydrate(100)
                .name("abc")
                .name("def")
                .build();
    }
}
