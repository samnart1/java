package com.example.demo.tacos.data;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.tacos.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

    
}
