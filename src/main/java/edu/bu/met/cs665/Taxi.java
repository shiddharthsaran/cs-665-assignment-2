/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 02/22/2024
 * File Name: Taxi.java
 * Description: Taxi class represents a taxi vehicle. It implements the VehicleInterface
 * interface and provides methods to manage taxi information.
 */
package edu.bu.met.cs665;

public class Taxi implements VehicleInterface{
    // Instance variables to store taxi information
    public String taxiName;
    public String engineType;
    /**
     * Constructor to initialize the Taxi object with the provided name.
     * @param taxiName The name of the taxi.
     */
    public Taxi(String taxiName){
        this.taxiName = taxiName;
    }
    /**
     * Method to set the engine type of the taxi.
     * @param engineType The engine type to set.
     */
    @Override
    public void setEngineType(String engineType) {
        this.engineType = engineType;

    }
    /**
     * Method to get the engine type of the taxi.
     * @return The engine type of the taxi.
     */
    @Override
    public String getEngineType() {
        return this.engineType;
    }
}
