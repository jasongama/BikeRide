package rides;

import bicycle.rides.BikeRideTwo;
import models.MountainBike;
import models.RoadBike;
import models.Tandem;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BikeRideTwoTest {
    @Test
    public void MountainBikeRideTwoShouldAccelerateAndBrake() {
        MountainBike mountainBike = new MountainBike();
        BikeRideTwo bikeRideOne = new BikeRideTwo(mountainBike);

        bikeRideOne.ride();

        assertEquals(16, bikeRideOne.getCurrentRideSpeed());

    }

    @Test
    public void RoadBikeRideTwoShouldAccelerateAndBrake() {
        RoadBike roadBike = new RoadBike();
        BikeRideTwo bikeRideOne = new BikeRideTwo(roadBike);

        bikeRideOne.ride();

        assertEquals(43, bikeRideOne.getCurrentRideSpeed());

    }

    @Test
    public void TandemBikeRideTwoShouldAccelerateAndBrake() {
        Tandem tandem = new Tandem();
        BikeRideTwo bikeRideOne = new BikeRideTwo(tandem);

        bikeRideOne.ride();

        assertEquals(39, bikeRideOne.getCurrentRideSpeed());

    }

}
