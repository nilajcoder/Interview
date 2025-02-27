/*
 * WAP Print Even Numbers Till  n
 * and Print Odd Numbers
 * and Print the sum of Odd numbers and Even Numbers 
 * 
 */

import java.util.Scanner;

public class PrintEvenNumber {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Element");
        int n=sc.nextInt();
        int evensum=0;
        int oddsum=0;
        System.out.println("Even Numbers Are ");
        for(int i=1;i<=n;i++){
            if (i%2==0) {
                System.out.println(i);
                evensum+=i;
                
            } 
        }
        System.out.println("Sum of Even Numbers ="+evensum);


        System.out.println("Odd Numbers Are ");
        for(int i=1;i<=n;i++){
            if (i%2!=0) {
                System.out.println(i);
                oddsum+=i;
                
            }
        }
        System.out.println("Sum of Odd Numbers = "+oddsum);

    }
 }