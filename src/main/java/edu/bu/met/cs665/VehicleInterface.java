/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 02/22/2024
 * File Name: VehicleInterface.java
 * Description: VehicleInterface interface defines the contract for classes that represent a vehicle.
 * It contains methods to set and get the engine type of the vehicle.
 */
package edu.bu.met.cs665;

public interface VehicleInterface {
    /**
     * Method to set the engine type of the vehicle.
     * @param engineType The engine type to set.
     */
    void setEngineType(String engineType);
    /**
     * Method to get the engine type of the vehicle.
     * @return The engine type of the vehicle.
     */
    String getEngineType();

}
