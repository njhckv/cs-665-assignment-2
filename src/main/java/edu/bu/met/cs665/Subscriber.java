/**
 * Name: HUANZHOU WANG
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2023
 * File Name: Subscriber.java
 * Description: Subscriber interface where I created some abstract functions that a Subscriber might have
 */

package edu.bu.met.cs665;

public interface Subscriber {
    public void getNotification(Shop shop, DeliveryRequest deliveryRequest);
}
