package reversestring;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence you want reversed");

        String entered = input.nextLine();
        StringBuilder str = new StringBuilder(entered);

        str.reverse();

        System.out.println(str);

        System.out.println("Please enter another sentence");
        String entered2 = input.nextLine();

        String reversedString = "";
        for(int i = entered2.length() -1; i >=0; i--) {
            reversedString+= entered2.charAt(i);
        }
        System.out.println(reversedString);
        input.close();
    }
}
