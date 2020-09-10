package encapsulation;

public class EncapsulationTest {

    public static void main(String[] args) {

        Car car = new Car("Ferrari", 360, true);

        System.out.println(car.getModel() + ", \n" + car.getMaxSpeed() + " miles per hour, \n" + car.isAutomatic() + ".");

    }
}
