package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TandemTest {
    @Test
    public void TandemShouldAccelerateAndBrakeCorrect() {

        Tandem bicycle = new Tandem();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        assertEquals(10, bicycle.currentSpeed());
    }

    @Test
    public void TandemShouldDoMultipleAcceleratesCorrectly() {

        Tandem bicycle = new Tandem();

        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(36, bicycle.currentSpeed());
    }

    @Test
    public void TandemShouldDoMultipleAccelerateAndBrakesCorrectly() {

        Tandem bicycle = new Tandem();

        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        assertEquals(3, bicycle.currentSpeed());
    }

    @Test
    public void TandemShouldBeAbleToStop() {

        Tandem bicycle = new Tandem();

        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());
    }
}
