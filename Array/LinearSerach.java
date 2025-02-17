import java.util.Scanner;

public class LinearSerach {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the array");
        int n=sc.nextInt();//input
        int arr[]=new int[n]; //array declaration
        System.out.println("Enter the element of array");

        //array input
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        System.out.println("Array Elements are = ");

        //display
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }


        //Searching element
        System.out.println("Enter the element to serach = ");
        int x=sc.nextInt();

        //logic 
        for(int i=0;i<n;i++){
            if (arr[i]==x) {
                System.out.println(x +"  " + "is found at " +i);
                
            }

        }
        

    
    }
}