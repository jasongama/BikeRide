package bicycle.models;
import bicycle.BicycleType;
import bicycle.BicyclesBase;

public class RoadBike extends BicyclesBase {


    @Override
    public void accelerate() {
        changeSpeed(11);
    }


    @Override
    public void brake() {
        changeSpeed(-4);
    }

    @Override
    public BicycleType getBicycleType() {
        return BicycleType.RoadBike;
    }
}