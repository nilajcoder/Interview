
/*
 * WAP Power Of a Number 
 
 */

import java.util.Scanner;

public class PowerOfNum {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=1;
        System.out.print("Enter the Base (Numuber) = ");
        int b=sc.nextInt();
        System.out.print("Enter the exponent = ");
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
          p=p*b;
        }

        System.out.println(b +" to the power " + x + " is = "+p);
    }
 }


 /*
  * Assume Inputs:
Base (b) = 2
Exponent (exp) = 3
Step-by-Step Execution:
Iteration	i (Loop Variable)	p (Product)	Calculation
Initial	-	1	-
1st Loop	1	1 × 2 = 2	p = p * b → 2 = 1 * 2
2nd Loop	2	2 × 2 = 4	p = p * b → 4 = 2 * 2
3rd Loop	3	4 × 2 = 8	p = p * b → 8 = 4 * 2
  */