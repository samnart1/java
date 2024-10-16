package com.example.practice_taco;

import lombok.Data;

@Data
public class Ingredient {

    private final String Id;
    private final String name;
    private final Type type;

    public enum Type {
        PROTEIN, WRAP, SAUCE, CHEESE, VEGGIES
    }
}
