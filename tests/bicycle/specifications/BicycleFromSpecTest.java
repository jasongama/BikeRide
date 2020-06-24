package bicycle.specifications;

import bicycle.Bicycle;
import bicycle.BicycleType;
import bicycle.specifications.BicycleFromSpec;
import bicycle.specifications.BicycleSpecification;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BicycleFromSpecTest {
    @Test
    public void MountainBicycleFromSpecShouldAccelerateAndBrake() {
        BicycleSpecification mountainBike = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle bicycleSpec = new BicycleFromSpec(mountainBike);

        assertEquals(5, mountainBike.getAccelerationSpeed());
        assertEquals(-3, mountainBike.getBrakeSpeed());
    }

    @Test
    public void RoadBicycleFromSpecShouldAccelerateAndBrake() {
        BicycleSpecification roadBike = new BicycleSpecification(11, -4, BicycleType.MountainBike);
        Bicycle bicycleSpec = new BicycleFromSpec(roadBike);

        assertEquals(11, roadBike.getAccelerationSpeed());
        assertEquals(-4, roadBike.getBrakeSpeed());
    }

    @Test
    public void TandemFromSpecShouldAccelerateAndBrake() {
        BicycleSpecification tandem = new BicycleSpecification(12, -7, BicycleType.MountainBike);
        Bicycle bicycleSpec = new BicycleFromSpec(tandem);

        assertEquals(12, tandem.getAccelerationSpeed());
        assertEquals(-7, tandem.getBrakeSpeed());
    }
}
