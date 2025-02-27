/*
 * WAP Print Even Numbers Till  n
 * and Print Odd Numbers
 */

import java.util.Scanner;

public class PrintEvenNumber {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Element");
        int n=sc.nextInt();
        System.out.println("Even Numbers Are ");
        for(int i=1;i<=n;i++){
            if (i%2==0) {
                System.out.println(i);
                
            } 
        }

        System.out.println("Odd Numbers Are ");
        for(int i=1;i<=n;i++){
            if (i%2!=0) {
                System.out.println(i);
                
            }
        }

    }
 }