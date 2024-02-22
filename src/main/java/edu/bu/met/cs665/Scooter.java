/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 02/22/2024
 * File Name: Scooter.java
 * Description: Scooter class represents a scooter vehicle. It implements the VehicleInterface
 * interface and provides methods to manage scooter information.
 */
package edu.bu.met.cs665;

public class Scooter implements VehicleInterface{
    // Instance variables to store scooter information
    public String scooterBrand;
    public String engineType;
    /**
     * Constructor to initialize the Scooter object with the provided brand.
     * @param scooterBrand The brand of the scooter.
     */
    public Scooter(String scooterBrand){
        this.scooterBrand = scooterBrand;
    }
    /**
     * Method to set the engine type of the scooter.
     * @param engineType The engine type to set.
     */
    @Override
    public void setEngineType(String engineType) {
        this.engineType = engineType;

    }
    /**
     * Method to get the engine type of the scooter.
     * @return The engine type of the scooter.
     */
    @Override
    public String getEngineType() {
        return this.engineType;
    }
}
