package com.example.demo.creational.factory;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veg");
    
}
