/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 02/22/2024
 * File Name: Main.java
 * Description: Main class serves as the entry point to the application.
 */
package edu.bu.met.cs665;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;

public class Main {


    public static void main(String[] args){
        // Create a dictionary to store driver names and their associated vehicles
        Dictionary<String, VehicleInterface> dict= new Hashtable<>();
        dict.put("Jack", new Van("Mercedes"));
        dict.put("Jil", new Scooter("Segway"));
        dict.put("Max", new Taxi("Uber"));
        dict.put("Tom", new Van("Ferrari"));
        dict.put("Jerry", new Scooter("Yamaha"));
        // Create a shop
        Shop foodShop = new Shop("MI", "Nowhere");
        // Iterate over the dictionary keys and create drivers associated with each vehicle
        Enumeration<String> keys = dict.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            VehicleInterface value = dict.get(key);
            new Driver(key, value, foodShop);
        }

        // Simulate creating a delivery request and sending order update
        foodShop.createDeliveryRequest("new addr","customer 1");
        foodShop.sendOrderUpdate();
        System.out.println();
        foodShop.createDeliveryRequest("addr ","customer 2");
        foodShop.sendOrderUpdate();
    }
}
