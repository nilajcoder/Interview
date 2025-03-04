/*
 * 
 * Write a JAVA Program to input two numbers from keyboard
 *  and check whether the first number is divisible by
         second number.
 */

import java.util.Scanner;

public class Divisibility {
 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter divident ");
        int a=sc.nextInt();
        System.out.println("Enter divisor ");
        int n=sc.nextInt();
        System.out.println("Divident = "+a);
        System.out.println("Divisor = "+n);
        if (n!=0) {
            System.out.println("Division is possiable");
            
        } else{
            System.out.println("Division is not possiable ");
        }
    }
 }