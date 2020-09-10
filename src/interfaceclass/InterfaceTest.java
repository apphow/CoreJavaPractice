package interfaceclass;

import abstractclass.Vehicle;

public class InterfaceTest {

    public static void main(String[] args) {
        Car car = new Car();

        car.turnLeft();
        car.turnRight();

        Motorcycle motorcycle = new Motorcycle();

        motorcycle.turnLeft();
        motorcycle.turnRight();

    }

}
