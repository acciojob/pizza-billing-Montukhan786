package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheeseprice;

    private int topingprice;

    private boolean isCheese;

    private boolean isToppings;

    private boolean isTakeaway;

    private boolean isBillGenerated;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.bill = "";
        this.isCheese = false;
        this.isToppings = false;
        this.isTakeaway = false;
        this.isBillGenerated = false;
        // your code goes here
        if (isVeg) {
            this.price = 300;
            this.topingprice = 70;
        } else {
            this.price = 400;
            this.topingprice = 120;
        }
        this.cheeseprice = 80;
        this.bill += "Base Price Of The Pizza: "+this.price+"\n";
    }
    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheese){
            this.price = this.price + cheeseprice;
            this.isCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppings){
            this.price = this.price + topingprice;
            this.isToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeaway){
            this.price += 20;
            isTakeaway = true;
        }

    }

    public String getBill(){
        // your code goes here
        if( !isBillGenerated ){

            if(isCheese){
                this.bill += "Extra Cheese Added: "+this.cheeseprice+"\n";
            }
            if(isToppings){
                this.bill += "Extra Toppings Added: "+this.topingprice+"\n";
            }
            if(isTakeaway){
                this.bill += "Paperbag Added: "+"20"+"\n";
            }
            this.bill += "Total Price: "+this.price+"\n";

            isBillGenerated = true;

        }
        return this.bill;
    }
}


