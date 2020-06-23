package bicycle.specifications;

import bicycle.BicycleType;

public class BicycleSpecification {
    private int accelerationSpeed;
    private int brakeSpeed;
    private BicycleType bicycleType;

    // add a variable for brakeSpeed

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType) {
        this.accelerationSpeed = accelerationSpeed;
        // initialize brakeSpeed private variable
        this.brakeSpeed = brakeSpeed;
        this.bicycleType = bicycleType;
    }

    public int getAccelerationSpeed() {
        return accelerationSpeed;
    }

    // add getters for brakeSpeed
    public int getBrakeSpeed() {
        return brakeSpeed;
    }

    public BicycleType getBicycleType() {
        return bicycleType;
    }
}
