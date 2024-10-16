package com.example.practice_taco;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/orders")
@SessionAttributes("tacoOrder")
public class OrderController {

    @GetMapping("/current")
    public String order() {
        return "order";
    }

    @PostMapping
    public String processTacoOrder(TacoOrder tacoOrder, SessionStatus sessionStatus) {
        log.info("Taco Order has been places: {}", tacoOrder);
        sessionStatus.setComplete();

        return "redirect:/";
    }
}