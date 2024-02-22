/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 02/22/2024
 * File Name: Shop.java
 * Description: Shop class represents a shop from which orders are delivered. It implements the ShopInterface
 * interface and provides methods to manage shop information and handle delivery requests.
 */
package edu.bu.met.cs665;
import java.util.ArrayList;

public class Shop implements ShopInterface{
    // Instance variables to store shop information
    public String shopName;
    public String shopAddress;
    public int orderId;
    // List to maintain subscribed drivers
    public ArrayList <DriverInterface> driverList = new ArrayList<DriverInterface>();
    public DeliveryRequest deliveryRequest;
    /**
     * Constructor to initialize the Shop object with the provided name and address.
     * @param shopName The name of the shop.
     * @param shopAddress The address of the shop.
     */
    public Shop(String shopName, String shopAddress){
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.orderId = 0;
    }
    /**
     * Method to subscribe a driver to receive order updates.
     * @param driver The driver to subscribe.
     */
    @Override
    public void subscribe(DriverInterface driver) {
        driverList.add(driver);
    }
    /**
     * Method to unsubscribe a driver from receiving order updates.
     * @param driver The driver to unsubscribe.
     */
    @Override
    public void unsubscribe(DriverInterface driver) {
        driverList.remove(driver);
    }
    /**
     * Method to send order updates to subscribed drivers.
     */
    @Override
    public void sendOrderUpdate() {
        for (DriverInterface driver : driverList){
            driver.deliveryUpdate(this.deliveryRequest.getDeliveryRequestDetails());
        }
    }
    /**
     * Method to create a delivery request with the specified delivery address and customer name.
     * @param deliveryAddress The delivery address.
     * @param customerName The name of the customer.
     */
    public void createDeliveryRequest(String deliveryAddress, String customerName){
        DeliveryRequest deliveryRequest = new DeliveryRequest(this.shopName, this.shopAddress, this.orderId, deliveryAddress, customerName);
        this.orderId += 1;
        this.deliveryRequest = deliveryRequest;

    }
    /**
     * Method to get the list of subscribed drivers.
     * @return The Arraylist of subscribed drivers.
     */
    public ArrayList<DriverInterface> getDriverList() {
        return this.driverList;
    }
}
