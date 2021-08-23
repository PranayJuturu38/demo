package com.example.demo.creational.AbstractFactory;

public abstract class Pizza {
    
        public abstract void addIngredients();
        public void bakePizza() {
            System.out.println("Ready");
        }
        
}
