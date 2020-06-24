package bicycle.models;

import bicycle.models.RoadBike;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoadBikeTest {
    @Test
    public void RoadBikeShouldAccelerate() {

        RoadBike bicycle = new RoadBike();

        bicycle.accelerate();
        assertEquals(11, bicycle.currentSpeed());
    }

    @Test
    public void RoadBikeShouldAccelerateAndBrakeCorrect() {

        RoadBike bicycle = new RoadBike();

        bicycle.accelerate();
        bicycle.brake();
        assertEquals(7, bicycle.currentSpeed());
    }

    @Test
    public void RoadBikeShouldDoMultipleAcceleratesCorrectly() {

        RoadBike bicycle = new RoadBike();

        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(33, bicycle.currentSpeed());
    }

    @Test
    public void RoadBikeShouldDoMultipleAccelerateAndBrakesCorrectly() {

        RoadBike bicycle = new RoadBike();

        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        assertEquals(10, bicycle.currentSpeed());
    }

    @Test
    public void RoadBikeShouldBeAbleToStop() {

        RoadBike bicycle = new RoadBike();

        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());
    }
}
