package rides;

import bicycle.rides.BikeRideThree;
import models.MountainBike;
import models.RoadBike;
import models.Tandem;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BikeRideThreeTest {
    @Test
    public void MountainBikeRideThreeShouldAccelerateAndBrake() {
        MountainBike mountainBike = new MountainBike();
        BikeRideThree bikeRideOne = new BikeRideThree(mountainBike);

        bikeRideOne.ride();

        assertEquals(14, bikeRideOne.getCurrentRideSpeed());

    }

    @Test
    public void RoadBikeRideThreeShouldAccelerateAndBrake() {
        RoadBike roadBike = new RoadBike();
        BikeRideThree bikeRideOne = new BikeRideThree(roadBike);

        bikeRideOne.ride();

        assertEquals(36, bikeRideOne.getCurrentRideSpeed());

    }

    @Test
    public void TandemBikeRideThreeShouldAccelerateAndBrake() {
        Tandem tandem = new Tandem();
        BikeRideThree bikeRideOne = new BikeRideThree(tandem);

        bikeRideOne.ride();

        assertEquals(34, bikeRideOne.getCurrentRideSpeed());

    }
}
