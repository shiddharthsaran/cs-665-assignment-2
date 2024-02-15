package edu.bu.met.cs665;

public class Driver implements DriverInterface{
    public String name;
    public VehicleInterface vehicle;
    public Shop shop;
    public String orderUpdate;
    public Driver(String name, VehicleInterface vehicle, Shop shop){
        this.name = name;
        this.vehicle = vehicle;
        this.orderUpdate = "";
        this.shop = shop;
        this.shop.subscribe(this);

    }

    @Override
    public void deliveryUpdate(String message) {
        this.orderUpdate = message;
        System.out.println(this.name + " received " + message);

    }

    public String getOrderUpdate(){
        return this.orderUpdate;
    }
}
