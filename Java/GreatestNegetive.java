import java.util.Scanner;

public class GreatestNegetive {

    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);
       int [] arr={1,2,3,4,-2,-3,-5};
       int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
        if(arr[i]<0){
            if (arr[i]>max) {
                max=arr[i];
                
            }
        }
       }
       System.out.println("Greatest Negative value "+max);


    }
}


/*
 * 
 * Given Input:
java
Copy
Edit
int[] arr = {1, 2, 3, 4, -2, -3, -5};
int max = Integer.MIN_VALUE;
Integer.MIN_VALUE is -2147483648 (very small negative number).

Step-by-Step Execution (Dry Run)
Iteration	i (Index)	arr[i] (Current Element)	Condition (arr[i] < 0)	Condition (arr[i] > max)	max (Updated or Not)
1st	0	1	❌ No	-	No change (-2147483648)
2nd	1	2	❌ No	-	No change (-2147483648)
3rd	2	3	❌ No	-	No change (-2147483648)
4th	3	4	❌ No	-	No change (-2147483648)
5th	4	-2	✅ Yes	✅ Yes (-2 > -2147483648)	Updated to -2
6th	5	-3	✅ Yes	❌ No (-3 > -2 is false)	No change (-2)
7th	6	-5	✅ Yes	❌ No (-5 > -2 is false)	No change (-2)
Final Output:
java
Copy
Edit
System.out.println("Greatest negative number: " + max);
Output:

yaml
Copy
Edit
Greatest negative number: -2
Explanation:
The program scans the array and only checks negative numbers.
The variable max is updated to the highest negative number found.
In this case, -2 is the greatest negative number.
 */