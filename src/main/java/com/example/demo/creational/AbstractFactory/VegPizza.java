package com.example.demo.creational.AbstractFactory;

public class VegPizza extends Pizza {
    BaseToppingFactory toppingFactory;
    public VegPizza(BaseToppingFactory toppingFactory)
    {
        this.toppingFactory=toppingFactory;
    }
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for veg pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}