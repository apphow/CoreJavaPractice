package polymorphism;

import staticexample.Car;

public class PolymorphismTest {

    public static void main(String[] args) {

        Vehicle vehicle = new DynamicPolymorphismMethodOverridingCar();

        vehicle.accelerate();

        Vehicle vehicle1 = new DynamicPolymorphismMethodOverridingMotorcycle();
        vehicle1.accelerate();
    }
}
