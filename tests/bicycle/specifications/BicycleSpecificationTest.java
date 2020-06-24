package bicycle.specifications;

import bicycle.BicycleType;
import bicycle.specifications.BicycleSpecification;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BicycleSpecificationTest {
    @Test
    public void MountainBicycleSpecShouldAccelerateAndBrake() {
        BicycleSpecification mountainBike = new BicycleSpecification(5,-3, BicycleType.MountainBike);
        assertEquals(BicycleType.MountainBike, mountainBike.getBicycleType());
    }
    @Test
    public void RoadBicycleSpecShouldAccelerateAndBrake() {
        BicycleSpecification roadBike = new BicycleSpecification(11,-4, BicycleType.RoadBike);
        assertEquals(BicycleType.RoadBike, roadBike.getBicycleType());
    }
    @Test
    public void TandemBicycleSpecShouldAccelerateAndBrake() {
        BicycleSpecification tandemBike = new BicycleSpecification(12,-7, BicycleType.Tandem);
        assertEquals(BicycleType.Tandem, tandemBike.getBicycleType());
    }
}
