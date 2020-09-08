package com.company;

public class Arrays {

    public static void main(String[] args) {

        int[] numbers;
        numbers = new int[4];

        numbers[0] = 4;
        numbers[1] = 6;
        numbers[2] = -3;
        numbers[3] = -2;

        System.out.println("sum of numbers = " + (numbers[0] + numbers[1] + numbers[2] + numbers[3]));

    int[] number = {4,6,-3,-2};
    number[1] = 20;
        System.out.println("---------------");
        System.out.println("New Sum : " +(numbers[0] + number[1] + number[2] + number[3]));

    }
}
