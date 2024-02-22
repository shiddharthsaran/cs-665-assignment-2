/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 02/22/2024
 * File Name: Driver.java
 * Description: Driver class represents a driver who delivers orders. It implements the DriverInterface
 * interface and provides methods to manage driver information and receive delivery updates.
 */
package edu.bu.met.cs665;

public class Driver implements DriverInterface{
    // Instance variables to store driver information
    public String name;
    public VehicleInterface vehicle;
    public Shop shop;
    public String orderUpdate;
    /**
     * Constructor to initialize the Driver object with provided information.
     * @param name The name of the driver.
     * @param vehicle The vehicle associated with the driver.
     * @param shop The shop where the driver works.
     */
    public Driver(String name, VehicleInterface vehicle, Shop shop){
        this.name = name;
        this.vehicle = vehicle;
        this.orderUpdate = "";
        this.shop = shop;
        this.shop.subscribe(this);

    }
    /**
     * Method to receive delivery updates.
     * @param message The message containing the delivery update.
     */
    @Override
    public void deliveryUpdate(String message) {
        this.orderUpdate = message;
        System.out.println(this.name + " received " + message);

    }
    /**
     * Method to get the latest order update.
     * @return The latest order update message.
     */
    public String getOrderUpdate(){
        return this.orderUpdate;
    }
}
