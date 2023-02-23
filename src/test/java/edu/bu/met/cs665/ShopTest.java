package edu.bu.met.cs665;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void subscribe() {
        Shop testShop = new Shop("TestShop","TestID");
        Driver driver = new Driver("TestDriver","TestID",true);
        testShop.subscribe(driver);
        assertEquals(1,testShop.getDrivers().size());
    }

    @Test
    public void unsubscribe() {
        Shop testShop = new Shop("TestShop","TestID");
        Driver driver = new Driver("TestDriver","TestID",true);
        testShop.subscribe(driver);
        testShop.unsubscribe(driver);
        assertEquals(0,testShop.getDrivers().size());
    }

    @Test
    public void notifySubscribers() {
        Shop testShop = new Shop("TestShop","TestID");
        Driver driver = new Driver("TestDriver","TestID",true);
        testShop.subscribe(driver);
        DeliveryRequest deliveryRequest = new DeliveryRequest("DeliveryID", "Test Address");
        testShop.notifySubscribers(deliveryRequest);
        assertEquals(1,driver.getRequestLists().size());
    }
}