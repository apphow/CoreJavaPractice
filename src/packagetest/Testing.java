package packagetest;

// user defined package
//Built-in package java.util
import packageoperation.*;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter 2 numbers to multiply : " );
        int number1 = userInput.nextInt();
        int number2 = userInput.nextInt();
        Multiply obj = new Multiply();
        System.out.println(number1 + " and " + number2 + " = " + obj.multiply(number1, number2));

        System.out.println("Please enter 2 numbers to add : ");
        int number3 = userInput.nextInt();
        int number4 = userInput.nextInt();
        Add ob1 = new Add();
        System.out.println(number3 + " plus " + number4 + " = " + ob1.add(number3, number4));
    }
}
