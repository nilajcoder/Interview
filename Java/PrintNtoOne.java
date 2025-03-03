

/*
 * WAP in JAVA Print N to 1
 * Suppose If you input 5
 * Output will be 5 4 3 2 1
 */

import java.util.Scanner;

public class PrintNtoOne {
    
    public static void PrintingNtoOne(int n){
        if (n==0) {
            return ;
        }
            else {
                
                System.out.println(n);
                PrintingNtoOne(n-1);
            }
            
        }
    
    

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        System.out.println("Printing the numbers ");
        PrintingNtoOne(n);
    }
 }



 /*
  * dry run
  ----------


     public static void PrintingNtoOne(int n){
        if (n==0) { 5==0 4==0 3==0  2==0 1==0
            return ;
        }
            else {
                
                System.out.println(n); 5 4 3 2 1
                PrintingNtoOne(n-1);4 3 2 1 0
            }
            
        }
    
    
   Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number ");5
        int n=sc.nextInt();5
        System.out.println("Printing the numbers ");
        PrintingNtoOne(n);5



        printNto1(5) → Prints 5, calls printNto1(4)
printNto1(4) → Prints 4, calls printNto1(3)
printNto1(3) → Prints 3, calls printNto1(2)
printNto1(2) → Prints 2, calls printNto1(1)
printNto1(1) → Prints 1, calls printNto1(0)
printNto1(0) → Base case reached, function stops.

  */