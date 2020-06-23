package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MountainBikeTests {
    @Test
    public void MountainBikeShouldAccelerate() {

        MountainBike bicycle = new MountainBike();

        bicycle.accelerate();
        assertEquals(5, bicycle.currentSpeed());
    }

    @Test
    public void MountainBikeShouldAccelerateAndBrakeCorrect() {

        MountainBike bicycle = new MountainBike();

        bicycle.accelerate();
        bicycle.brake();
        assertEquals(2, bicycle.currentSpeed());
    }

    @Test
    public void MountainBikeShouldDoMultipleAcceleratesCorrectly() {

        MountainBike bicycle = new MountainBike();

        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(15, bicycle.currentSpeed());
    }

    @Test
    public void MountainBikeShouldDoMultipleAccelerateAndBrakesCorrectly() {

        MountainBike bicycle = new MountainBike();

        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        assertEquals(1, bicycle.currentSpeed());
    }

    @Test
    public void MountainBikeShouldBeAbleToStop() {

        MountainBike bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());
    }

}
