package Methods;

public class MethodOverloading {
    public static void main(String[] args) {

        System.out.println("sum of two numbers : " + add (10, 20));

        System.out.println("sum of three numbers: " + add(10, 20, 30));

        System.out.println("sum of 2 doubles: " + add(10.0, 20.0));
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    public static double add (double x, double y) {
        return x + y;
    }
}
