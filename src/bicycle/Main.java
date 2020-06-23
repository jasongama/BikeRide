package bicycle;

public class Main {

    public static void main(String[] args) {
        Bicycles brands = new Bicycles("Yellow", "Giant Bicycles");


        System.out.println("Accelerating... ");
        for (int seconds = 1; seconds <= 5; seconds++) {
            brands.accelerate();
            System.out.println("Current speed of the " + brands.getColor() + " " + brands.getBrandName() + " is " +
                    brands.currentSpeed() + " km/h");
        }
        System.out.println("\nbreaking... ");
        for (int seconds = 1; seconds <= 5; seconds++) {
            brands.brake();
            System.out.println("Current speed of the " + brands.getColor() + " " + brands.getBrandName() + " is " +
                    brands.currentSpeed() + " km/h");

        }
        System.out.println("\nstopping... ");
        for (int seconds = 1; seconds <= 5; seconds++) {
            brands.stop();
            System.out.println("Current speed of the " + brands.getColor() + " " + brands.getBrandName() + " is " +
                    brands.currentSpeed() + " km/h");
        }

    }
}
