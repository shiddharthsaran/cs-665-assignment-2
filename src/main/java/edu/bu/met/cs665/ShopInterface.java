/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 02/22/2024
 * File Name: ShopInterface.java
 * Description: ShopInterface interface defines the contract for classes that represent a shop and need to manage
 * subscriptions for drivers and send order updates.
 */
package edu.bu.met.cs665;

public interface ShopInterface {
    /**
     * Method to subscribe a driver to receive order updates.
     * @param driver The driver to subscribe.
     */
    void subscribe(DriverInterface driver);
    /**
     * Method to unsubscribe a driver from receiving order updates.
     * @param driver The driver to unsubscribe.
     */
    void unsubscribe(DriverInterface driver);
    /**
     * Method to send order updates to subscribed drivers.
     */
    void sendOrderUpdate();
}
