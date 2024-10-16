package com.example.practice_taco;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class TacoOrder {

    private String DeliveryName;
    private String DeliveryStreet;
    private String DeliveryCity;
    private String DeliveryState;
    private String DeliveryZip;
    private String ccNumber;
    private String ccCCV;
    private String CCExpiration;

    private List<Taco> tacos = new ArrayList<>();

    public void addTacos(Taco taco) {
        tacos.add(taco);
    }
}
