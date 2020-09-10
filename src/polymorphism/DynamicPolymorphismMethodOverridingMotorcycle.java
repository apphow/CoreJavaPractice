package polymorphism;

public class DynamicPolymorphismMethodOverridingMotorcycle extends Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Motorcycle is accelerating!");
    }
}
