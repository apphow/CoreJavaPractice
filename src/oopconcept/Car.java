package oopconcept;

public class Car {

    // state of the car are model and current speed
    // declare them.

    //private-can't have access from another class
    private String model;
    private int currentSpeed;
    private String color;
    private int year;

    //constructors

    //takes one parameter
    // declar as public because we want to be able to access it from another class
    public Car (String model) {
        this. model = model;
    }

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // declare 4 public methods for the car class

    public void start() {
        System.out.println(this.model + " has started.");
    }
    // add 20 miles per hour to the current speed variable
    public void accelerate() {
        this.currentSpeed += 20;
    }

    public void decelarate() {
        this.currentSpeed -= 10;
    }

    // use the print method to display the car has stopped
    // message by adding the variable model
    public void stop() {
        System.out.println(this.model + " has stopped!");
        // return speed to zero
        this.currentSpeed = 0;
    }

    public void showSpeed() {
        System.out.println("The current speed of " + this.model + " is " + this.currentSpeed);
    }

    @Override
    public String toString() {
        return "Model : " + this.model + "\nColor : " + this.color + "\nYear  : " + this.year;
    }

}
