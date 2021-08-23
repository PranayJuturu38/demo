package com.example.demo.creational.factory;

public class PizzaFactory extends BasePizzaFactory{
    @Override
    public  Pizza createPizza(String type){
        Pizza pizza;
        switch (type.toLowerCase())
        {
            case "cheese":
                pizza = new ChessePizza();
                break;
        
                case "veg":
                pizza = new VegPizza();
                break;

            default: throw new IllegalArgumentException("No such pizza.");
        }

        pizza.addIngredients();
        
        pizza.bakePizza();
        
        return pizza;
    }
}