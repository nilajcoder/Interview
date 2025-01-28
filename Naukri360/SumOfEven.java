/*
 * Problem statement
You have been given a number 'N'. Your task is to find the sum of all even numbers from 1 to 'N' (both inclusive).

Example :

Given 'N' : 6
Sum of all even numbers till 'N' will be : 2 + 4 + 6 = 12
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
2
6
2
Sample Output 1 :
12
2
Explanation For Sample Input 1 :
For test case 1 :
Sum of all even numbers till 6 will be : 2 + 4 + 6 = 12

For test case 2 :
Sum of all even numbers till 2 will be : 2
Sample Input 2 :
2
4
5
Sample Output 2 :
6
6
Explanation For Sample Input 2 :
For test case 1 :
Sum of all even numbers till 4 will be : 2 + 4 = 6

For test case 2 :
Sum of all even numbers till 5 will be : 2 + 4 = 6

 */

import java.util.Scanner;

public class SumOfEven {

    public static int SumEvenTiilN(int n){
        int sum=0;
        for(int i=2;i<=n; i+=2){
            sum+=i;
        }
        return sum;
    }
 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int result=SumEvenTiilN(n);
        System.out.println("Sum of all even numbers till "+n + ": "+result);

    }
 }