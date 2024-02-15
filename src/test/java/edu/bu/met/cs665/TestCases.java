package edu.bu.met.cs665;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;

public class TestCases {
    public TestCases(){

    }

    @Test
    public void testOrderUpdate(){
        Shop foodShop = new Shop("MI", "Nowhere");
        Driver driver = new Driver("Driver #0",  new Van("Mercedes"), foodShop);
        foodShop.createDeliveryRequest("new addr","customer 1");
        foodShop.sendOrderUpdate();
        assertEquals("Your delivery, should you choose to accept it, details are it is from MI at Nowhere with Order Id:0 and it need to be delivered to customer 1 at new addr.", driver.getOrderUpdate());
    }

    @Test
    public void testDriverUnsubscribe(){
        Shop foodShop = new Shop("MI", "Nowhere");
        Driver driver = new Driver("Driver #1",  new Van("Mercedes"), foodShop);
        foodShop.unsubscribe(driver);
        foodShop.createDeliveryRequest("new addr","customer 1");
        foodShop.sendOrderUpdate();
        assertEquals("", driver.getOrderUpdate());
    }

    @Test
    public void testDriverSubscribe(){
        Shop foodShop = new Shop("MI", "Nowhere");
        Driver driverOne = new Driver("Driver #1",  new Van("Mercedes"), foodShop);
        Driver driverTwo = new Driver("Driver #2", new Taxi("Uber"), foodShop);
        Driver driverThree = new Driver("Driver #3", new Scooter("Segway"), foodShop);
        foodShop.unsubscribe(driverTwo);
        ArrayList<DriverInterface> expectedDriverList = new ArrayList<>();
        expectedDriverList.add(driverOne);
        expectedDriverList.add(driverThree);
        assertEquals(expectedDriverList, foodShop.getDriverList());
    }


}
