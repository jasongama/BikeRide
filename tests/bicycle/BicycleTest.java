package bicycle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BicycleTest {

    @Test
    public void shouldAccelerate() {

        Bicycles bicycle = new Bicycles("blue", "6ku");
        bicycle.getColor();
        bicycle.getBrandName();
        bicycle.accelerate();
        assertEquals(5, bicycle.currentSpeed());
    }

    @Test
    public void shouldAccelerateAndBrakeCorrect() {

        Bicycles bicycle = new Bicycles("green", "3T");
        bicycle.getColor();
        bicycle.getBrandName();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(2, bicycle.currentSpeed());

    }

    @Test
    public void shouldDoMultipleAcceleratesCorrectly() {

        Bicycles bicycle = new Bicycles("Brown", "ALan Bike");
        bicycle.getColor();
        bicycle.getBrandName();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(15, bicycle.currentSpeed());

    }

    @Test
    public void shouldDoMultipleAccelerateAndBrakesCorrectly() {

        Bicycles bicycle = new Bicycles("Pink", "All-City");
        bicycle.getColor();
        bicycle.getBrandName();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        assertEquals(1, bicycle.currentSpeed());

    }

    @Test
    public void shouldBeAbleToStop() {

        Bicycles bicycle = new Bicycles("White", "Argon 18");
        bicycle.getColor();
        bicycle.getBrandName();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());

    }

}

