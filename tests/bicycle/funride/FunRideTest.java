package bicycle.funride;

import bicycle.Bicycle;
import bicycle.BicycleType;
import org.junit.Test;
import bicycle.models.*;
import static org.junit.Assert.assertEquals;

public class FunRideTest {

    @Test
    public void funRideTestEnteredCountAccepted() {
        FunRide funRide = new FunRide(5);
        Bicycle roadBike = new RoadBike();
        Bicycle mountainBike = new MountainBike();
        funRide.acceptRides(mountainBike);
        funRide.acceptRides(mountainBike);
        funRide.acceptRides(mountainBike);
        funRide.acceptRides(roadBike);
        funRide.acceptRides(roadBike);
        assertEquals(2, funRide.getEnterCountRides());
    }

    @Test
    public void funRideTestEnteredCountShouldNotAcceptedMoreThanFive() {
        FunRide funRide = new FunRide(5);
        Bicycle roadBike = new RoadBike();
        Bicycle mountainBike = new MountainBike();

        funRide.acceptRides(mountainBike);
        funRide.acceptRides(mountainBike);
        funRide.acceptRides(mountainBike);
        funRide.acceptRides(mountainBike);
        funRide.acceptRides(mountainBike);
        funRide.acceptRides(mountainBike);
        funRide.acceptRides(roadBike);
        funRide.acceptRides(roadBike);
        funRide.acceptRides(roadBike);
        assertEquals(2, funRide.getEnterCountRides());
    }

    @Test
    public void funRideTestEnteredCountShouldNotAcceptedOnlyMountainBike() {
        FunRide funRide = new FunRide(6);
        Bicycle roadBike = new RoadBike();
        Bicycle mountainBike = new MountainBike();

        funRide.acceptRides(mountainBike);
        funRide.acceptRides(roadBike);
        funRide.acceptRides(roadBike);
        funRide.acceptRides(roadBike);
        funRide.acceptRides(roadBike);
        funRide.acceptRides(mountainBike);

        assertEquals(1, funRide.getBicycleTypeCount(BicycleType.MountainBike));
    }

    @Test
    public void funRideTestEnteredCountShouldAcceptedOnlyRoadBike() {
        FunRide funRide = new FunRide(5);
        Bicycle roadBike = new RoadBike();
        Bicycle mountainBike = new MountainBike();
        funRide.acceptRides(mountainBike);
        funRide.acceptRides(roadBike);
        funRide.acceptRides(roadBike);
        funRide.acceptRides(roadBike);
        funRide.acceptRides(roadBike);
        assertEquals(1, funRide.getBicycleTypeCount(BicycleType.RoadBike));
    }

    @Test
    public void funRideTestEnteredCountShouldAcceptedOnlyTandem() {
        FunRide funRide = new FunRide(9);
        Bicycle roadBike = new RoadBike();
        Bicycle tandem = new Tandem();
        funRide.acceptRides(tandem);
        funRide.acceptRides(tandem);
        funRide.acceptRides(tandem);
        funRide.acceptRides(tandem);
        funRide.acceptRides(roadBike);
        funRide.acceptRides(roadBike);
        funRide.acceptRides(roadBike);
        funRide.acceptRides(tandem);
        funRide.acceptRides(tandem);
        assertEquals(1, funRide.getBicycleTypeCount(BicycleType.Tandem));
    }
    @Test
    public void funRideTestEnteredCountShouldAcceptedOnlyTandemAndRoadBike() {
        FunRide funRide = new FunRide(9);
        Bicycle roadBike = new RoadBike();
        Bicycle tandem = new Tandem();
        funRide.acceptRides(tandem);
        funRide.acceptRides(tandem);
        funRide.acceptRides(tandem);
        funRide.acceptRides(tandem);
        funRide.acceptRides(roadBike);
        funRide.acceptRides(roadBike);
        funRide.acceptRides(roadBike);
        funRide.acceptRides(tandem);
        funRide.acceptRides(tandem);
        assertEquals(1, funRide.getBicycleTypeCount(BicycleType.Tandem));
        assertEquals(2, funRide.getBicycleTypeCount(BicycleType.RoadBike));
    }
}