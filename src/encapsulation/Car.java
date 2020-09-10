package encapsulation;

public class Car extends Vehicle{

    private boolean isAutomatic = false;

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public Car(String model, int maxSpeed, boolean isAutomatic) {
        super(model, maxSpeed);
        this.isAutomatic = isAutomatic;


    }
}
