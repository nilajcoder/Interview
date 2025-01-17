import java.util.Scanner;

public class ArrayMul {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of the array = ");
        int size=sc.nextInt();

        int arr[]=new int[size];

        System.out.print("Enter the element of the array = ");
        //input
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Elements Are = ");
        //display
        for(int i=0;i<size;i++){
            System.out.print(arr[i] +" ");
        }

        //Product Logic
        int product=1;
        for(int i=0;i<size;i++){
         product*=arr[i];
        }
        System.out.println("Product of the Array = "+product);


    }
}