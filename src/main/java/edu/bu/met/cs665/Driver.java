package edu.bu.met.cs665;

public class Driver implements DriverInterface{
    public String name;
    public String vehicleType;
    public Shop shop;
    public String orderUpdate;
    public Driver(String name, String vehicleType, Shop shop){
        this.name = name;
        this.vehicleType = vehicleType;
        this.orderUpdate = "";
        this.shop = shop;
        this.shop.subscribe(this);

    }

    @Override
    public void deliveryUpdate(String message) {
        this.orderUpdate = message;
        System.out.println(message);

    }
}
