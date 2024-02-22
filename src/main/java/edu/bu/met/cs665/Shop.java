package edu.bu.met.cs665;

import java.util.ArrayList;

public class Shop implements ShopInterface{

    public String shopName;
    public String shopAddress;
    public int orderId;

    public ArrayList <DriverInterface> driverList = new ArrayList<DriverInterface>();
    public DeliveryRequest deliveryRequest;
    public Shop(String shopName, String shopAddress){
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.orderId = 0;
    }

    @Override
    public void subscribe(DriverInterface driver) {
        driverList.add(driver);
    }

    @Override
    public void unsubscribe(DriverInterface driver) {
        driverList.remove(driver);
    }

    @Override
    public void sendOrderUpdate() {
        for (DriverInterface driver : driverList){
            driver.deliveryUpdate(this.deliveryRequest.getDeliveryRequestDetails());
        }
    }

    public void createDeliveryRequest(String deliveryAddress, String customerName){
        DeliveryRequest deliveryRequest = new DeliveryRequest(this.shopName, this.shopAddress, this.orderId, deliveryAddress, customerName);
        this.orderId += 1;
        this.deliveryRequest = deliveryRequest;

    }

    public ArrayList<DriverInterface> getDriverList() {
        return this.driverList;
    }
}
