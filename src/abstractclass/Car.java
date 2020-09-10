package abstractclass;

public class Car extends Vehicle{


    public Car(String type, String model) {
        super(type, model);
    }

    @Override
    public int getMaxSpeed() {
        final int MAX_CAR_SPEED = 320;
        System.out.println("Max spped of Car is : " + MAX_CAR_SPEED);
        return 0;
    }

    @Override
    public void start() {
        System.out.println("Cr has started!");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped!");
    }
}
