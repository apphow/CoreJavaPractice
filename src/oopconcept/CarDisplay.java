package oopconcept;

public class CarDisplay {

    public static void main(String[] args) {

        Car myCar = new Car("Ferrari");
        myCar.start();
        myCar.showSpeed();
        myCar.accelerate();
        myCar.showSpeed();
        myCar.decelarate();
        myCar.showSpeed();
        myCar.stop();
        myCar.showSpeed();

        Car myCar1 = new Car("Ferrari", "Red", 2015);
        System.out.println(myCar1);
    }
}
