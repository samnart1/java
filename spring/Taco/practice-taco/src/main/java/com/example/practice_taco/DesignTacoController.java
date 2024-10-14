package com.example.practice_taco;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.practice_taco.Ingredient.Type;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/design")
@SessionAttributes("tacoOrder")
public class DesignTacoController {

    @ModelAttribute
    public void addTypeToModel(Model model) {

        List<Ingredient> ingredients = Arrays.asList(
            new Ingredient("", "", Type.CHEESE),
            new Ingredient("", "", Type.CHEESE),
            new Ingredient("", "", Type.PROTEIN),
            new Ingredient("", "", Type.PROTEIN),
            new Ingredient("", "", Type.SAUCE),
            new Ingredient("", "", Type.SAUCE),
            new Ingredient("", "", Type.VEGGIES),
            new Ingredient("", "", Type.VEGGIES),
            new Ingredient("", "", Type.WRAP),
            new Ingredient("", "", Type.WRAP)

        );

        Type[] types = Ingredient.Type.values();
        
        for(Type type : types) {
            model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, type));
        }
    }

    @ModelAttribute(name = "tacoOrder")
    public TacoOrder order() {
        return new TacoOrder();
    }

    @ModelAttribute(name = "taco")
    public Taco taco() {
        return new Taco();
    }


    @GetMapping
    public String showDesignForm() {
        return "design";
    }

    public Iterable<Ingredient> filterByType(List<Ingredient> ingredients, Type type) {
        return ingredients
            .stream()
            .filter(x -> x
                .getType()
                .equals(type)
            )
            .collect(Collectors.toList());
    }
}