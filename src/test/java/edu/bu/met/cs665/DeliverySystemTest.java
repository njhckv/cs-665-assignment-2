package edu.bu.met.cs665;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeliverySystemTest {

    private Shop shop;
    private Driver driver1;
    private Driver driver2;
    private DeliveryRequest deliveryRequest;

    @BeforeEach
    void setUp() {
        shop = new Shop("ShopA", "1");
        driver1 = new Driver("Driver1", "1", true);
        driver2 = new Driver("Driver2", "2", false);
        deliveryRequest = new DeliveryRequest("1", "123 Main St");
    }

    @Test
    void testSubscribe() {
        shop.subscribe(driver1);
        List<Driver> drivers = shop.getDrivers();
        assertTrue(drivers.contains(driver1), "Driver1 should be subscribed to the shop");
    }

    @Test
    void testUnsubscribe() {
        shop.subscribe(driver1);
        shop.unsubscribe(driver1);
        List<Driver> drivers = shop.getDrivers();
        assertFalse(drivers.contains(driver1), "Driver1 should be unsubscribed from the shop");
    }

    @Test
    void testNotifySubscribers() {
        shop.subscribe(driver1);
        shop.subscribe(driver2);

        shop.notifySubscribers(deliveryRequest);

        List<DeliveryRequest> driver1Requests = driver1.getRequestLists();
        assertTrue(driver1Requests.contains(deliveryRequest), "Driver1 should receive the delivery request");

        List<DeliveryRequest> driver2Requests = driver2.getRequestLists();
        assertFalse(driver2Requests.contains(deliveryRequest), "Driver2 should not receive the delivery request since they are unavailable");
    }

    @Test
    void testSetAvailability() {
        driver2.setAvailable(true);
        assertTrue(driver2.isAvailable(), "Driver2's availability should be updated to true");
    }
}

