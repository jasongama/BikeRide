package bicycle;

public class Bicycles {
    private int speed;
    private String color;
    private  String brandName;

    public String getColor(){
        return color;
    }
    public String getBrandName(){
        return brandName;
    }
    public void accelerate(){
        speed += 5;
    }
    public int currentSpeed(){
        return speed;
    }
    public void brake(){
        speed -= 3;

    }
    public void stop(){
        speed = 0;
    }
    public  Bicycles( String newColor, String newBrandName){
        color = newColor;
        brandName = newBrandName;
    }

}
