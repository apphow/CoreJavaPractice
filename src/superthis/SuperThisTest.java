package superthis;

public class SuperThisTest {

    public static void main(String[] args) {


        Soda soda = new Soda("Soda", "Dr. Pepper", 2, false);

        System.out.println("\nType : " + soda.getType() + "\nBrand : " + soda.getBrand() + "\nMost Sugar : " + soda.getMostSugar() + "\nIs a Diet Drink : " + soda.isDiet);


        Soda soda1 = new Soda("Soda", "Coke", 0, true);
        System.out.println("\nType : " + soda.getType() + "\nBrand : " + soda.getBrand() + "\nMost Sugar : " + soda.getMostSugar() + "\nIs a Diet Drink : " + true);
    }


}
