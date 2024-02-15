package edu.bu.met.cs665;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;

public class Main {


    public static void main(String[] args){
        Dictionary<String, VehicleInterface> dict= new Hashtable<>();
        dict.put("Jack", new Van("Mercedes"));
        dict.put("Jil", new Scooter("Segway"));
        dict.put("Max", new Taxi("Uber"));
        dict.put("Tom", new Van("Ferrari"));
        dict.put("Jerry", new Scooter("Yamaha"));

        Shop foodShop = new Shop("MI", "Nowhere");

        Enumeration<String> keys = dict.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            VehicleInterface value = dict.get(key);
            new Driver(key, value, foodShop);
        }


        foodShop.createDeliveryRequest("new addr","customer 1");
        foodShop.sendOrderUpdate();
        System.out.println();
        foodShop.createDeliveryRequest("addr ","customer 2");
        foodShop.sendOrderUpdate();
    }
}
