
/*
 /*
 * Problem statement
You are given two numbers 'a' and 'b' as input.



You must swap the values of 'a' and 'b'.



For Example:
Input: 
'a' = 8, 'b' = 5

Output:
5 8

Explanation:
Initially, the value of 'a' and 'b' is 8 and 5, respectively.

After swapping, the value of 'a' is 5, and the value of 'b' is 8.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
1 2 
Sample Output 1:
2 1
Explanation For Sample Input 1:
The output of the above test case is 2 1.
Sample Input 2:
5 6
Sample Output 2:
6 5
Explanation For Sample Input 2:
The output of the above test case is  6 5.
Constraints:
-10^5 <= 'a', 'b' <= 10 ^ 5

Time Limit: 1 sec
 */

import java.util.Scanner;

public class SwapFun {
     
    public static void swap(int a,int b){

        a=a+b;
        b=a-b;
        a =a-b;
        System.out.println(a +" "+ b);
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap(a, b);

        
    }
}