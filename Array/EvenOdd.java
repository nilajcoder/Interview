
/*
 * 
 * Count Even and Odd Numbers
Write a program to count the number of even and odd numbers in an array of integers.
and print the sum of even numbers and odd numbers 
and print the even numbers and odd numbers 
 */
public class EvenOdd {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evencount = 0, oddcount = 0, evensum = 0, oddsum = 0;

        System.out.print("Even numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evencount++;
                evensum += arr[i];
                System.out.print(arr[i] + " ");  // Print even numbers
            }
        }

        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddcount++;
                oddsum += arr[i];
                System.out.print(arr[i] + " ");  // Print odd numbers
            }
        }

        System.out.println("\nEven numbers count = " + evencount);
        System.out.println("Odd numbers count = " + oddcount);
        System.out.println("Sum of Even numbers = " + evensum);
        System.out.println("Sum of Odd numbers = " + oddsum);
    }
}




/*
 * public class EvenOdd {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Even Numbers in the Array: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println(); // New line

        System.out.print("Odd Numbers in the Array: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

 */