package com.example.demo.tacos;

import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class Ingredient implements Persistable<String> {
    
    @Id
    private String id;
    private String name;
    private Type type;
    // private transient boolean isNew = true; 

    @Override
    public boolean isNew() {
        return this.id == null || this.id.isEmpty();
    }

    public enum Type {
            WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}