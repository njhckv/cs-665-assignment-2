package edu.bu.met.cs665;

import org.junit.Test;

import static org.junit.Assert.*;

public class DriverTest {

    @Test
    public void getNotification() {
        Driver testDriver = new Driver("TestDriver","TestID",true);
        Shop TestShop = new Shop("TestShop","TestID");
        DeliveryRequest TestRequest = new DeliveryRequest("TestID","TestAdd");
        testDriver.getNotification(TestShop, TestRequest);
        assertEquals(1, testDriver.getRequestLists().size());
    }
}