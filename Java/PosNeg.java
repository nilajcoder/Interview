/*
 * Take a number from user and check weather it is positive or negative or zero
 */

import java.util.Scanner;

public class PosNeg {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        if(n>0){
            System.out.println("The number is Positve");
        } else if (n<0) {
            System.out.println("The Number is Negative");
            
        } else{
            System.out.println("The Number Zero");
        }
    }
 }