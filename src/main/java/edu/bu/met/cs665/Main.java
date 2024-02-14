package edu.bu.met.cs665;

public class Main {
    public static void main(String[] args){
        Shop foodShop = new Shop("MI", "Nowhere");
        for (int i =0; i < 5 ;i++){
            new Driver("Driver #" + i, "van", foodShop);
        }
        foodShop.createDeliveryRequest("new addr","customer 1");
        foodShop.sendOrderUpdate();
    }
}
