package bicycle.models;
import bicycle.BicycleType;
import bicycle.BicyclesBase;

public class MountainBike extends BicyclesBase {

    @Override
    public void accelerate() {
        changeSpeed(5);
    }


    @Override
    public void brake() {
        changeSpeed(-3);
    }

    @Override
    public BicycleType getBicycleType() {
        return BicycleType.MountainBike;
    }
}