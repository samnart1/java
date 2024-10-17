package com.example.taco_cloud;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class Ingredient {
    
    @Id
    private final String Id;
    private final String name;
    private final Type type;

    public enum Type {
        VEGGIES, WRAP, PROTEIN, CHEESE, SAUCE 
    }
}
