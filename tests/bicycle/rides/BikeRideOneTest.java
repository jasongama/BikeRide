package bicycle.rides;

import bicycle.models.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BikeRideOneTest {
    @Test
    public void MountainBikeRideOneShouldAccelerateAndBrake() {
        MountainBike mountainBike = new MountainBike();
        BikeRideOne bikeRideOne = new BikeRideOne(mountainBike);

        bikeRideOne.ride();

        assertEquals(13, bikeRideOne.getCurrentRideSpeed());

    }

    @Test
    public void RoadBikeRideOneShouldAccelerateAndBrake() {
        RoadBike roadBike = new RoadBike();
        BikeRideOne bikeRideOne = new BikeRideOne(roadBike);

        bikeRideOne.ride();

        assertEquals(39, bikeRideOne.getCurrentRideSpeed());

    }

    @Test
    public void TandemBikeRideOneShouldAccelerateAndBrake() {
        Tandem tandem = new Tandem();
        BikeRideOne bikeRideOne = new BikeRideOne(tandem);

        bikeRideOne.ride();

        assertEquals(32, bikeRideOne.getCurrentRideSpeed());

    }
}