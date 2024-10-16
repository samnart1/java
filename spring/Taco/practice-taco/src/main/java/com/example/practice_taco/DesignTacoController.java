package com.example.practice_taco;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.practice_taco.Ingredient.Type;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping
@SessionAttributes("tacoOrder")
public class DesignTacoController {

    @ModelAttribute
    public void addIngredientsToModel(Model model) {
        List<Ingredient> ingredients = Arrays.asList(
            new Ingredient("GHA", "Ghana", Type.CHEESE),
            new Ingredient("NIG", "Nigeria", Type.CHEESE),
            new Ingredient("ENG", "England", Type.PROTEIN),
            new Ingredient("GER", "Germany", Type.PROTEIN),
            new Ingredient("USA", "USA", Type.SAUCE),
            new Ingredient("JMA", "Jamaica", Type.SAUCE),
            new Ingredient("AUS", "Australia", Type.VEGGIES),
            new Ingredient("CHN", "China", Type.VEGGIES),
            new Ingredient("BRA", "Brazil", Type.WRAP),
            new Ingredient("URU", "Uruguay", Type.WRAP)
        );

        Type[] types = Ingredient.Type.values();

        for (Type type : types) {
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

    @GetMapping("/design")
    public String design() {
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

    @PostMapping("/design")
    public String processTaco(Taco taco, @ModelAttribute TacoOrder tacoOrder) {
        tacoOrder.addTacos(taco);
        log.info("Processing your taco: {}", taco);

        return "redirect:/orders/current";
    }
}