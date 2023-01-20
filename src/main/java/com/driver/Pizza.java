package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int basepizzaprice;

    private int cheeseprice = 80;

    private int topingpriceVeg = 70;

    private int topingpriceNonVeg = 120;

    private int paperBagPrice = 20;

    private boolean extracheese = false;

    private boolean extratoppings = false;

    private boolean takeaway = false;

    private boolean toppingVeg = false;

    private boolean toppingNonVeg = false;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        // your code goes here
        if (isVeg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basepizzaprice = this.price;
    }
    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        extracheese = true;
        this.price += cheeseprice;
    }

    public void addExtraToppings(){
        // your code goes here
        extratoppings = true;
        if(basepizzaprice == 300){
            toppingVeg = true;
            this.price += topingpriceVeg;
        }
        else{
            toppingNonVeg = true;
            this.price += topingpriceNonVeg;
        }
    }

    public void addTakeaway(){
        // your code goes here
        takeaway = true;
        this.price += paperBagPrice;
    }

    public String getBill(){
        // your code goes here
        bill = "Base Price Of The Pizza: "+this.basepizzaprice +"\n";
        if(extracheese){
            bill += "Extra Cheese Added: "+cheeseprice+"\n";
        }
        if(extratoppings){
            if(toppingVeg){
                bill += "Extra Toppings Added: "+topingpriceVeg+"\n";
            }
            else{
                bill += "Extra Toppings Added: "+topingpriceNonVeg+"\n";
            }
        }
        if(takeaway){
            bill += "Paperbag Added: "+paperBagPrice+"\n";
        }

        bill += "Total Price: "+price;
        return this.bill;
    }
}
