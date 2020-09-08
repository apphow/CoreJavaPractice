package com.company.decisionmaking;

import java.util.Scanner;

public class IfLadderNestedIfStatement {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Please enter 3 number: ");
        int number1, number2, number3, largestNumber;

        number1 = number.nextInt();
        number2 = number.nextInt();
        number3 = number.nextInt();

        if((number1 >= number2) && (number1 >= number3)) {
                largestNumber = number1;
            } else if ((number2 >= number1) && (number2 >= number3)) {
                    largestNumber = number2;
                }else{
                    largestNumber = number3;
                }

        System.out.println(largestNumber);
        number.close();
     }

}
     /*
        Scanner age = new Scanner(System.in);
        System.out.println("Pleae enter your age : ");

        int yourAge = age.nextInt();

        if(yourAge < 13) {

            System.out.println("You are a child");
        } else if (yourAge < 19) {
            System.out.println("You are a teenager");
        } else if (yourAge < 65){
            System.out.println("You are an adult");
        } else{
            System.out.println("You are a senior");
        }

    }
}

         */
