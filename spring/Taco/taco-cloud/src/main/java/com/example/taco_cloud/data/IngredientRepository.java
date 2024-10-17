package com.example.taco_cloud.data;

import org.springframework.data.repository.CrudRepository;

import com.example.taco_cloud.Ingredient;

public interface  IngredientRepository extends CrudRepository<Ingredient, String> {
    
}