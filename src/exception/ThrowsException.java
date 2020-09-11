package exception;

public class ThrowsException {

    public static void divide () throws ArithmeticException, NumberFormatException {
        int a = Integer.parseInt("8");
        int b = Integer.parseInt("2");
        int c = a/b;
        System.out.println("Results : " + c);

    }

    public static void main(String[] args) {
        try {
            divide();
        }
        catch(ArithmeticException e) {
            System.out.println("Can't divide a number by zero");
        }

        catch(NumberFormatException e) {
            System.out.println("Invalid number format!");
        }
    }
}
