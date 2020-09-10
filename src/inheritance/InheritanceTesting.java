package inheritance;

import staticexample.Car;

public class InheritanceTesting {

    public static void main(String[] args) {

        //Creating car object:
        Cars car = new Cars();
        car.type = "Car";
        car.model = "Ferrari";
        car.maxSpeed = 125;
        car.print();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.type = "Motorcycle";
        motorcycle.model = "Yamaha";
        motorcycle.maxSpeed = 65;
        motorcycle.print();


    }
}
