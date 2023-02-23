/**
 * Name: HUANZHOU WANG
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2023
 * File Name: Main.java
 * Description: In this class I tested broadcast a single Delivery Request and send notifications to all Drivers regarding the delivery.
 *              I created a shop, 6 drivers, and a delivery request to test it out.
 */

package edu.bu.met.cs665;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project.  This could prove convenient to test as you are developing.
   * However, please note that every assignment/final projects requires JUnit tests.
   */
  public static void main(String[] args) {
    Shop ramenShop = new Shop("Ramen Shop","001");
    Driver driverA = new Driver("Driver A","001",true);
    Driver driverB = new Driver("Driver B","002",true);
    Driver driverC = new Driver("Driver C","003",true);
    Driver driverD = new Driver("Driver D","004",true);
    Driver driverE = new Driver("Driver E","005",true);
    Driver driverF = new Driver("Driver F","006",false);
    DeliveryRequest deliveryRequest = new DeliveryRequest("250","BU CDS");
    ramenShop.subscribe(driverA);
    ramenShop.subscribe(driverB);
    ramenShop.subscribe(driverC);
    ramenShop.subscribe(driverD);
    ramenShop.subscribe(driverE);
    ramenShop.subscribe(driverF);
    ramenShop.notifySubscribers(deliveryRequest);



  }

}
