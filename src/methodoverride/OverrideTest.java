package methodoverride;

import inheritance.Vehicle;

public class OverrideTest {

    public static void main(String[] args) {

        // create vehicle object

        Vehicles vehicle = new Vehicles();

        //call start method
        vehicle.start();

        // call accelerate method
        vehicle.accelerate(80);

        // call the stop method
        vehicle.stop();

        Carr car = new Carr();
        car.start();
        car.accelerate(10);
        car.stop();

    }

}
