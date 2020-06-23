package bicycle.rides;
import bicycle.Bicycle;
import bicycle.BikeRide;

public class BikeRideOne implements BikeRide {
    private final Bicycle bicycle;

    public BikeRideOne(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();


    }

    public int getCurrentRideSpeed(){

        return this.bicycle.currentSpeed();
    }

}
