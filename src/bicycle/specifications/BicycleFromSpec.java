package bicycle.specifications;

import bicycle.BicycleType;
import bicycle.BicyclesBase;

public class BicycleFromSpec extends BicyclesBase {
    private final bicycle.specifications.BicycleSpecification BicycleSpecification;

    public BicycleFromSpec(bicycle.specifications.BicycleSpecification bicycleSpecification) {
        this.BicycleSpecification = bicycleSpecification;
    }

    @Override
    public void accelerate() {
        this.BicycleSpecification.getAccelerationSpeed();
    }

    @Override
    public void brake() {
        this.BicycleSpecification.getBrakeSpeed();
    }

    @Override
    public BicycleType getBicycleType() {
        return this.BicycleSpecification.getBicycleType();
    }

}
