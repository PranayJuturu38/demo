package com.example.demo.creational.AbstractFactory;

public class GourmetPizzaFactory extends BasePizzaFactory {
    @Override
    public  Pizza createPizza(String type){
        Pizza pizza;
        BaseToppingFactory toppingFactory= new GourmetToppingFactory();
        switch (type.toLowerCase())
        {
            case "cheese":
                pizza = new CheesePizza(toppingFactory);
                break;
            case "veg":
                pizza = new VegPizza(toppingFactory);
                break;
            default: throw new IllegalArgumentException("No such pizza.");
        }
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}