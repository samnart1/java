package com.example.practice_taco;

import java.util.HashMap;
import java.util.Map;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.practice_taco.Ingredient.Type;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient>{

    Map<String, Ingredient> something = new HashMap<>();

    public IngredientByIdConverter() {
            something.put("GHA", new Ingredient("GHA", "Ghana", Type.CHEESE));
            something.put("NIG", new Ingredient("NIG", "Nigeria", Type.CHEESE));
            something.put("ENG", new Ingredient("ENG", "England", Type.PROTEIN));
            something.put("GER", new Ingredient("GER", "Germany", Type.PROTEIN));
            something.put("BRA", new Ingredient("BRA", "Brazil", Type.SAUCE));
            something.put("ARG", new Ingredient("ARG", "Argentina", Type.SAUCE));
            something.put("USA", new Ingredient("USA", "USA", Type.VEGGIES));
            something.put("CAN", new Ingredient("CAN", "Canada", Type.VEGGIES));
            something.put("CHN", new Ingredient("CHN", "China", Type.WRAP));
            something.put("IDN", new Ingredient("IDN", "India", Type.WRAP));
    }

    @Override
    public Ingredient convert(String id) {
        return something.get(id);
    }
    
    
}
