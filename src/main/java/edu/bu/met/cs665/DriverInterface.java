/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 02/22/2024
 * File Name: DriverInterface.java
 * Description: DriverInterface interface defines the contract for classes that need to receive delivery updates.
 */
package edu.bu.met.cs665;

public interface DriverInterface {
    /**
     * Method to receive delivery updates.
     * @param message The message containing the delivery update.
     */
    void deliveryUpdate(String message);
}
