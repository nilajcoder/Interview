

/*
 * WAP Find a factors of an integer
 * and print the sum of factors 
 * 
 * Check the the number Perfect number or not?
 * If input is 6 =1+2+3=6 perfect
 * 28= 1 +2+4+7+14=28 perfect
 */

import java.util.Scanner;

public class Factors {

   public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number ");
    int s=0;
    int n =sc.nextInt();
    System.out.println("Factors of  "+n+" are =");
     

    /*
    Print the factors of numbers including number
    Logic
    */
    for(int i=1;i<=n;i++){
        if (n%i==0) {
            System.out.println(i);
            
        }
    }
   

    /*

    sum of factors exculding the number
    Logic of Perfect number
    */
    for(int i=1;i<n;i++){
        if (n%i==0) {
            s=s+i;
            
        }
    }
    if(s==n){
        System.out.println("The numbers "+n +" is Perfect number");
    }else{
        System.out.println("The number "+n+" is not Perfect number ");
    }
       System.out.println("Sum Of the factors excluding the number is "+n +" = "+s);
   }          
}



/*
 * dry run
 * --------
 * 
 * int s=0;
    int n =sc.nextInt();5
    System.out.println("Factors of  "+n+" are =");

    for(int i=1;i<=n;i++){     1<=5
        if (n%i==0) {    5%1==0     5%5==0
            System.out.println(i); 1 5
            s=s+i;0+1=1  1+5=6
            
        }
    }
       System.out.println("Sum Of the factors = "+s);
   }  
       
   

Iteration (i)	Condition (5 % i == 0)	Factor?	s (Sum of factors)	Output
i = 1	              5 % 1 == 0 (✅)	Yes	     s = 0 + 1 = 1	    1
i = 2	              5 % 2 != 0 (❌)	No	s = 1	-
i = 3	              5 % 3 != 0 (❌)	No	s = 1	-
i = 4	               5 % 4 != 0 (❌)	No	s = 1	-
i = 5	               5 % 5 == 0 (✅)	Yes         s = 1 + 5 = 6	 5





Enter a number 
6
Factors of  6 are =
1
2
3
6
The numbers 6 is Perfect number
Sum Of the factors excluding the number is 6 = 6
 * 
 */