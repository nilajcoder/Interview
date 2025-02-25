
/*
 * 
 * 7. Second Largest Element
Write a program to find the second largest element in an array.
 */
import java.util.Arrays;

public class Secondlargest {

    public static void main(String[] args) {
        
        int arr[]={1,10,5,2,33,3,6,11};

       int size=arr.length;
     Arrays.sort(arr);
    System.out.println("Sorted Array "+Arrays.toString(arr));
     int seclargest= arr[size-2];
     int firstlargest=arr[size -1];
        System.out.println("Second Largest Element is = " + seclargest);
        System.out.println("First Largest Element is = "+firstlargest);
    }
}