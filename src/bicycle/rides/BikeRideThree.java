package bicycle.rides;

import bicycle.Bicycle;
import bicycle.BikeRide;

public class BikeRideThree implements BikeRide{

    private final Bicycle bicycle;

    public BikeRideThree(Bicycle bicycle) {
        this.bicycle = bicycle;
    }


    @Override
    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.brake();




    }
    @Override
    public int getCurrentRideSpeed(){
       return this.bicycle.currentSpeed();
    }

}