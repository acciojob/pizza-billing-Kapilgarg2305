package com.driver;

public class Pizza {

    private int price;
    private int a=0,b=0;
    private Boolean isVeg;
    private int bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
       if(isVeg) {
           System.out.println("Base Price Of The Pizza: 300");
           price=300;
           bill=300;
       }
       else {
           System.out.println("Base Price Of The Pizza: 400");
           price =400;
           bill= 400;
       }
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(a==0){
        price=80;
        bill=bill+80;
        System.out.println("Extra Cheese Added: 80");
        a++;
    }

    }

    public void addExtraToppings(){
        // your code goes here
       if(b==0) {
            if (isVeg) {
                System.out.println("Extra Toppings Added: 70");
                price = 70;
                bill = bill + 70;
                b++;
            } else {
                System.out.println("Extra Toppings Added: 120");
                price = 120;
                bill = bill + 120;
                b++;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        price =20;
        bill=bill+20;
        System.out.println("Paperbag Added: 20");
    }

    public String getBill(){
        // your code goes here

        return "Total Price: "+this.bill;
    }
}
