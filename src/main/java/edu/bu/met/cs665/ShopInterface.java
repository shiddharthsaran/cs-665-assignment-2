package edu.bu.met.cs665;

public interface ShopInterface {
    void subscribe(DriverInterface driver);
    void unsubscribe(DriverInterface driver);
    void sendOrderUpdate();
}
