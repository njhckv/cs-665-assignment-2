/**
 * Name: HUANZHOU WANG
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2023
 * File Name: Publisher.java
 * Description: Publisher interface where I created some abstract functions that a Publisher might have
 */

package edu.bu.met.cs665;

public interface Publisher {
    void subscribe(Driver driver);
    void unsubscribe(Driver driver);
    void notifySubscribers(DeliveryRequest deliveryRequest);
}
