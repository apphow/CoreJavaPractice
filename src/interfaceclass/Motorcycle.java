package interfaceclass;

public class Motorcycle implements Drivable{
    @Override
    public void turnLeft() {
        System.out.println("\nThis Motorcycle turns left!");
    }

    @Override
    public void turnRight() {
        System.out.println("\nThis Motorcycle turns right!");
    }
}
