package bicycle.models;
import bicycle.BicycleType;
import bicycle.BicyclesBase;

public class Tandem extends BicyclesBase {


    @Override
    public void accelerate() {
        changeSpeed(12);
    }


    @Override
    public void brake() {
        changeSpeed(-7);
    }

    @Override
    public BicycleType getBicycleType() {
        return BicycleType.Tandem;
    }
}
