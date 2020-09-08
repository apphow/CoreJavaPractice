package com.company.loop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ForLoop {

    public static void main(String[] args) {

        // program to find the sum of all odd numbers 1-10
        int sum = 0;
        for (int i = 1; i <= 10; i += 2) {
            sum += i;
            System.out.println(i);
        }
        System.out.println("Sum of odd numbers : " + sum);
    }
}
        /*
        // program to find the sum of all even numbers 1-10

        int sum = 0;
        for (int i = 0; i <= 10; i += 2) {
            sum += i;
            System.out.println(i);
        }
        System.out.println("Sum of even numbers : " + sum);
    }
}

         */

/*
        int i;
        for (i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }



        int sum = 0;
        for(int k = 0; k<= 5; k++) {
            sum +=k;
            System.out.println(k);
        }
        System.out.println("Sum : " + sum);


 */
