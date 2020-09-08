package com.company.loop;

public class ForEachLoop {

    public static void main(String[] args) {

        /*
        // regular for loop
        char[] letters = {'h', 'e', 'l', 'l', 'o'};
            for(int i = 0; i<letters.length; i++) {
                System.out.print(letters[i] );
            }

         */

        /*
        // for each loop lessens code and doesn't use the index and counter
        char[] letters = {'h', 'e', 'l', 'l', 'o'};
        for(char item : letters) {
            System.out.print(item);
        }

         */
        // calculate the sum of all elements in the array
        int[] numbers = {6,4,3,5};
        int sum = 0;
        for(int num : numbers) {
            sum += num;
            System.out.println(num);
            System.out.println("Sum of num : " + sum);
        }


    }
}
