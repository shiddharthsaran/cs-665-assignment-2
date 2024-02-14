package edu.bu.met.cs665;

public class DeliveryRequest {
    String shopName;
    String shopAddress;
    int orderId;
    String deliveryAddress;
    String customerName;

    public DeliveryRequest(String shopName, String shopAddress, int orderId, String deliveryAddress, String customerName){
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.orderId = orderId;
        this.deliveryAddress = deliveryAddress;
        this.customerName = customerName;
    }

    public String getDeliveryRequestDetails(){
        return String.format("Your delivery, should you choose to accept it, details are it is from %s at %s with Order Id:%d and it need to be delivered to %s at %s.", this.shopName, this.shopAddress, this.orderId, this.customerName, this.deliveryAddress);
    }
}
