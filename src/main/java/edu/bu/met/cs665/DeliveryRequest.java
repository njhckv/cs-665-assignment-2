/**
 * Name: HUANZHOU WANG
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2023
 * File Name: DeliveryRequest.java
 * Description: Delivery class with fields like request id and delivery address.
 */

package edu.bu.met.cs665;

public class DeliveryRequest {
    private final String id;
    private final String address;

    public DeliveryRequest(String id, String address) {
        this.id = id;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }
}
