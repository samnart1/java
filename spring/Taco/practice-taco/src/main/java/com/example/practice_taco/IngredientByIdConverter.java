package com.example.practice_taco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.practice_taco.Ingredient.Type;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private Map<String, Ingredient> ingredientMap = new HashMap<>();

    public IngredientByIdConverter() {
        ingredientMap.put("GHA", new Ingredient("GHA", "Ghana", Type.CHEESE));
    }

    @Override
    public Ingredient convert(String id) {
        return ingredientMap.get(id);
    }
}