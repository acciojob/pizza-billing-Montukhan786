package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {
        //super.addExtraCheese();  //The customer might ask for extra cheese or toppings by invoking your method multiple times, but you have to make sure you don’t add it in the bill multiple times.
    }

    @Override
    public void addExtraToppings() {
        //super.addExtraToppings(); //The customer might ask for extra cheese or toppings by invoking your method multiple times, but you have to make sure you don’t add it in the bill multiple times.
    }
}
