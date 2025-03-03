
/*
 *  Write a JAVA program to add n integer numbers starting from 1 ( i/p: n =5, o/p: 1+2+3+4+5 )

 */

import java.util.Scanner;

public class SumTilln {

    public static int addtilln(int n){

        if (n==0) {

            return 0;
        }
            else{
                return n+addtilln(n-1);
            }
            
        }
    
 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number ");
         int n=sc.nextInt();
         System.out.println("Sum of "+n +" numbers = "+ addtilln(n));        
    }
 }




 /*
  * dry run
  -----------
sum(5) → 5 + sum(4) =5+10=15
sum(4) → 4 + sum(3)=4+6=10
sum(3) → 3 + sum(2)=3+3=6
sum(2) → 2 + sum(1)=2+1=3
sum(1) → 1 + sum(0)=1+0=1
sum(0) → 0  (Base case reached)

public static int addtilln(int n){5

        if (n==0) { 5==0 4==0 3==0 2==0 1==0 0==0

            return 0;
        }
            else{
                return n+addtilln(n-1); 5+add(4)= 5+10=15  
                                        4+add(3)=4+6=10
            }                           3+add(2)=3+3=6
                                     sum(2)  2+ add(1)=2+1=3
                                    sum(1) =  1+add(0)=1+0=1
        }


  Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number ");5
         int n=sc.nextInt();5
         System.out.println("Sum of "+n +" numbers = "+ addtilln(n));  //15
  */