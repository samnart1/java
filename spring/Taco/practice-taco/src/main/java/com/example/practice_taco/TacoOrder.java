package com.example.practice_taco;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class TacoOrder {

    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccCVV;
    private String ccExpiration;
    private String ccNumber;
    
    private List<Taco> tacos = new ArrayList<>();

    public void addTacos(Taco taco) {
        tacos.add(taco);
    }
    
}
