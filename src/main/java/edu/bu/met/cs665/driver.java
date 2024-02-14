package edu.bu.met.cs665;

public class driver implements driverInterface{
    public String name;
    public String vehicleType;
    public shop shop;
    public String orderUpdate;
    public driver(String name, String vehicleType, shop shop){
        this.name = name;
        this.vehicleType = vehicleType;
        this.shop = shop;
        this.orderUpdate = "";

    }

    @Override
    public void deliveryUpdate(String message) {

    }
}
