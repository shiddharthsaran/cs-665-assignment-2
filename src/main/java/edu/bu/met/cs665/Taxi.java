package edu.bu.met.cs665;

public class Taxi implements VehicleInterface{
    public String taxiName;
    public String engineType;

    public Taxi(String taxiName){
        this.taxiName = taxiName;
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
