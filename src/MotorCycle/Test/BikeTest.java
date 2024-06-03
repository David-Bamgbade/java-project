package MotorCycle.Test;

import MotorCycle.Bike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

@Test
    void turnOnBike() {
    Bike myBike = new Bike();
    assertTrue(myBike.onBike());
    }

    @Test
    void turnOffBike() {
    Bike myBike1 = new Bike();
    assertFalse(myBike1.offBike());
    }

    @Test
    void increaseSpeed(){
    Bike myBike2 = new Bike();
    myBike2.increaseBikeSpeed(10);
    assertEquals(10, 10);
    }

    @Test
    void decreaseSpeed(){
    Bike myBike3 = new Bike();
    myBike3.decreaeBikeSpeed(20);
    assertEquals(20, 20);
    }

}