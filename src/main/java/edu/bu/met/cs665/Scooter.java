package edu.bu.met.cs665;

public class Scooter implements VehicleInterface{

    public String scooterBrand;
    public String engineType;

    public Scooter(String scooterBrand){
        this.scooterBrand = scooterBrand;
    }
    @Override
    public void setEngineType(String engineType) {
        this.engineType = engineType;

    }

    @Override
    public String getEngineType() {
        return this.engineType;
    }
}
