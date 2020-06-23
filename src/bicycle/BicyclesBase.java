package bicycle;


public abstract class BicyclesBase implements Bicycle {
    private int speed;

    protected void changeSpeed(int changeSpeed) {
        speed += changeSpeed;
    }

    @Override
    public int currentSpeed() {
        return speed;
    }

    @Override
    public void brake() {
        speed -= speed;
    }

    @Override
    public void stop() {
        speed = 0;
    }

 
}
