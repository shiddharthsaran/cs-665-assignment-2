/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 02/22/2024
 * File Name: DeliveryRequest.java
 * Description: DeliveryRequest class represents a request for delivery.
 */
package edu.bu.met.cs665;

public class DeliveryRequest {
    // Instance variables to store information about the delivery request
    public String shopName;
    public String shopAddress;
    public int orderId;
    public String deliveryAddress;
    public String customerName;
    /**
     * Constructor to initialize the DeliveryRequest object with provided information.
     * @param shopName The name of the shop.
     * @param shopAddress The address of the shop.
     * @param orderId The ID of the order.
     * @param deliveryAddress The delivery address.
     * @param customerName The name of the customer.
     */
    public DeliveryRequest(String shopName, String shopAddress, int orderId, String deliveryAddress, String customerName){
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.orderId = orderId;
        this.deliveryAddress = deliveryAddress;
        this.customerName = customerName;
    }
    /**
     * Method to get the details of the delivery request.
     * @return A string containing the details of the delivery request.
     */
    public String getDeliveryRequestDetails(){
        return String.format("Your delivery, should you choose to accept it, details are it is from %s at %s with Order Id:%d and it need to be delivered to %s at %s.", this.shopName, this.shopAddress, this.orderId, this.customerName, this.deliveryAddress);
    }
}
