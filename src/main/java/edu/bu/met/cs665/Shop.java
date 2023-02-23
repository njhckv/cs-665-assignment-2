/**
 * Name: HUANZHOU WANG
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2023
 * File Name: Shop.java
 * Description: Shop class with fields like name, id, and drivers list, in this class you can add a new driver to the list or remove driver from list, most importantly send notifications to all drivers in the list
 */
package edu.bu.met.cs665;

import java.util.ArrayList;

public class Shop implements Publisher{

    private final String name;
    private final String id;

    private ArrayList<Driver> drivers = new ArrayList<>();

    public Shop(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    @Override
    public void subscribe(Driver driver) {
        drivers.add(driver);
    }

    @Override
    public void unsubscribe(Driver driver) {
        drivers.remove(driver);
    }

    @Override
    public void notifySubscribers(DeliveryRequest deliveryRequest) {
        for (Driver driver: drivers) {
            if (driver.isAvailable()) {
                driver.getNotification(this, deliveryRequest);
            }
        }
    }
}
