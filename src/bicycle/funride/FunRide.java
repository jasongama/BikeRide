package bicycle.funride;
import bicycle.Bicycle;
import bicycle.BicycleType;
import java.util.ArrayList;
import java.util.List;

public class FunRide {
    private int bicycleTypeCount = 0;
    private int maximumRide;
    private List<Bicycle> bikeList = new ArrayList<Bicycle>();

    public FunRide(int maxSpeed) {
        this.maximumRide = maxSpeed;
    }

    public void acceptRides(Bicycle bicycle) {
        if ((!bikeList.contains(bicycle)) && (this.maximumRide > bikeList.size())) {

            bikeList.add(bicycle);
        } else {
            System.out.println("We can't accept rides anymore ");
        }

    }

    public int getEnterCountRides() {
        return this.bikeList.size();
    }

    public int getBicycleTypeCount(BicycleType bicycleType) {
        for (Bicycle bicycle : bikeList) {
            if (bicycle.getBicycleType() == bicycleType) {
                bicycleTypeCount++;
            }
        }

        return bicycleTypeCount;
    }

}
