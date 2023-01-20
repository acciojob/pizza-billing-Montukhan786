package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    System.out.println(dp.getPrice());
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addTakeaway();
    System.out.println(dp.getBill());

    Pizza p = new Pizza(true);
    p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();
    System.out.println(p.getBill());
  }
}

//        Veg pizza base price = 300
//        Non-veg pizza base price = 400
//        Extra Cheese Price = 80
//        Extra Toppings For Veg Pizza = 70
//        Extra Toppings For Non-veg Pizza = 120
//        Paper bag Price = 20


//      Bill Structure Example:
//
//        Example 1:
//        Base Price Of The Pizza: 300
//        Extra Cheese Added: 80
//        Extra Toppings Added: 70
//        Paperbag Added: 20
//        Total Price: 470
//
//        Example 2:
//        Base Price Of The Pizza: 400
//        Extra Cheese Added: 80
//        Extra Toppings Added: 120
//        Total Price: 600