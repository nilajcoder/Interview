import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the Size of the array = ");
        int size=sc.nextInt();

        int arr[]=new int[size];
      

        System.out.print("Enter the element of the array = ");
        //input
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        System.out.print("Array Elements are = ");
        //display
        for(int i=0;i<size;i++){
            System.out.print(arr[i] +" ");
        }

        //Reverse Logic
         System.out.print("Reverse Array is = ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+ " ");


        }

    }
}