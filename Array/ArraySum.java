/*
 * 
 * 
Let's perform a dry run of the program with sample input to understand its behavior.

Code:
The program calculates the sum of elements in an array entered by the user.

Input Sample:
Enter the size of the array: 3
Enter the elements of the array: 5 10 15
Dry Run Steps:
Step 1: Input the size of the array
Variable: size = 3
Step 2: Initialize an array arr of size 3.
Step 3: Input array elements.
Loop: for(int i = 0; i < size; i++)

Iteration 1 (i = 0): arr[0] = 5
Iteration 2 (i = 1): arr[1] = 10
Iteration 3 (i = 2): arr[2] = 15
Final array: arr = [5, 10, 15]

Step 4: Display elements.
Loop: for(int i = 0; i < size; i++)

Iteration 1: Print arr[0] = 5
Iteration 2: Print arr[1] = 10
Iteration 3: Print arr[2] = 15
Output: Elements are = 5 10 15

Step 5: Compute the sum of elements.
Initialize sum = 0.

Loop: for(int i = 0; i < size; i++)

Iteration 1: sum = sum + arr[0] = 0 + 5 = 5
Iteration 2: sum = sum + arr[1] = 5 + 10 = 15
Iteration 3: sum = sum + arr[2] = 15 + 15 = 30
Final sum: sum = 30

Step 6: Display the sum.
Output: The sum of the Array Elements = 30

 */





import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the size of the array = ");//2
        int size=sc.nextInt();

        int arr[]=new int[size];
         
        System.out.print("Enter the element of the array = ");//2
        //input
        for(int i=0;i<size;i++){  
            
            
            arr[i]=sc.nextInt();

        }
      
        System.out.print("Elements are = ");
        //display
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }

        //Sum Logic

        
        int sum=0;
        for(int i=0;i<size;i++){
         sum+=arr[i];

        }
        System.out.print("The sum Of the Array Element = " +sum);


    }
}