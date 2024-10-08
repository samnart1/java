package com.example.demo.tacos.data;

import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.tacos.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

    
}
