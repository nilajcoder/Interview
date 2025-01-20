/* 
Problem statement
Take the length(L) and breadth(B) of the rectangle as input and find its area.

Note:
Length and breadth must be an integer value and the area will always be in the range of integers.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= L, B <= 10ˆ2
Sample Input 1:
4 20
Sample Output 1:
80
Explanation of Sample Input 1:
Length of the rectangle is 4 and breadth is 20. 
Hence the area of the rectangle is (length*breadth). 
So the answer is 4*20=80.

*/

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

             int l=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(l*b); 
            
        
    }


}
