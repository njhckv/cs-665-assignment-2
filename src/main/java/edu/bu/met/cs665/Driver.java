/**
 * Name: HUANZHOU WANG
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2023
 * File Name: Driver.java
 * Description: Driver class with fields like name, id, requests list, and isAvailable status, in this class you can add a new request and get notified by shops
 */

package edu.bu.met.cs665;

import java.util.ArrayList;

public class Driver implements Subscriber{
    private final String name;
    private final String id;
    private boolean isAvailable;

    private ArrayList<DeliveryRequest> requestLists = new ArrayList<>();

    public Driver(String name, String id, boolean isAvailable) {
        this.name = name;
        this.id = id;
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public ArrayList<DeliveryRequest> getRequestLists() {
        return requestLists;
    }
    @Override
    public void getNotification(Shop shop, DeliveryRequest deliveryRequest) {
        requestLists.add(deliveryRequest);
        System.out.println(name + " with ID " + id + " got the delivery request " + deliveryRequest.getId() + " from " + shop.getName() +  " to address: " + deliveryRequest.getAddress());
    }
}
