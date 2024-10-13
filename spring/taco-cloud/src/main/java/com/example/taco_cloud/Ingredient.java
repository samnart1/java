package com.example.taco_cloud;

import lombok.Data;

@Data
public class Ingredient {
    
    private final String Id;
    private final String name;
    private final Type type;

    public enum Type {
        VEGGIES, WRAP, PROTEIN, CHEESE, SAUCE 
    }
}
