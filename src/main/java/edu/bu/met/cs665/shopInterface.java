package edu.bu.met.cs665;

public interface shopInterface {
    void subscribe(driverInterface driver);
    void unsubscribe(driverInterface driver);
    void sendOrderUpdate();
}
