/*
 * Problem statement
Take the principal amount, rate of interest, and the time period as input and calculate the Simple Interest.

Note: Return answer as Floor integer value.

Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
2000
2.2
4
Sample Output 1:
176
Explanation of Sample Input 1:
The input is principal=2000, rate=2.2 and time=4.
So Simple interest=Principal*rate*time/100 hence 
answer is 2000*2.2*4/100=176
 */

import java.util.Scanner;

public class SimpleIn {
 
    public static void main(String[] args) {
        
      Scanner sc=new Scanner(System.in);
      int p=sc.nextInt();
      double r=sc.nextDouble();
      int t=sc.nextInt();

      double si=(p*r*t)/100;

      System.out.println((int)(si));



    }
 }