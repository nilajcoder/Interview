
/*
 * 
 * WAP Length Of a String
 */

import java.util.Scanner;

public class LengthOfaString {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str ="Ram";
        //using built in function
        System.out.println("Length of a First string = "+ str.length() );

            /*
             * User Input
             */
        System.out.println("Enter a Second String ");
        String abc=sc.nextLine();
        System.out.println("Your Entered Second String is = "+ abc);
       
        /*
         * Without built in function
         * Logic
         */
        int c=0;
        for(char i : abc.toCharArray()){
            c++;
        }
        System.out.println("Length of a Second String = " +c);
    }
}