/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 02/22/2024
 * File Name: Van.java
 * Description: Van class represents a van vehicle. It implements the VehicleInterface
 * interface and provides methods to manage van information.
 */
package edu.bu.met.cs665;

public class Van implements VehicleInterface{
    // Instance variables to store van information
    public String vanBrand;

    public String engineType;
    /**
     * Constructor to initialize the Van object with the provided brand.
     * @param vanBrand The brand of the van.
     */
    public Van(String vanBrand){
        this.vanBrand = vanBrand;
    }
    /**
     * Method to set the engine type of the van.
     * @param engineType The engine type to set.
     */
    @Override
    public void setEngineType(String engineType) {
        this.engineType = engineType;

    }
    /**
     * Method to get the engine type of the van.
     * @return The engine type of the van.
     */
    @Override
    public String getEngineType() {
        return this.engineType;
    }
}
