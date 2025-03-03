

/*
 * WAP Find a factors of an integer
 * and print the sum of factors 
 */

import java.util.Scanner;

public class Factors {

   public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number ");
    int s=0;
    int n =sc.nextInt();
    System.out.println("Factors of  "+n+" are =");

    for(int i=1;i<=n;i++){
        if (n%i==0) {
            System.out.println(i);
            s=s+i;
            
        }
    }
       System.out.println("Sum Of the factors = "+s);
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

 * 
 */