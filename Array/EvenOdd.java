
/*
 * 
 * Count Even and Odd Numbers
Write a program to count the number of even and odd numbers in an array of integers.
 */
public class EvenOdd {


    public static void main(String[] args) {
        int arr []={1,2,3,4,5,6,7,8,9,10};
        int evencount=0,oddcount=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2==0) {
                evencount++;
                System.out.println("Even numbers are "+arr[i]+ " ");
            } else{
                oddcount++;
                System.out.println(arr[i]+" ");
            }

        }

        System.out.println("Even numbers are = "+evencount);
        System.out.println("Odd numbers are = "+oddcount);
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