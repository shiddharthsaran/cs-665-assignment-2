package edu.bu.met.cs665;

public class Van implements VehicleInterface{
    String vanBrand;

    String engineType;

    public Van(String vanBrand){
        this.vanBrand = vanBrand;
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
