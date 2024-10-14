package com.example.practice_taco;

import lombok.Data;

@Data
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public enum Type {
        VEGGIES, PROTEIN, WRAP, SAUCE, CHEESE
    }
    
}
