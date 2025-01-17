import java.util.Scanner;

class ArrayUserInput {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int size=sc.nextInt();
        int arr[]=new int[size];//array declaration


        System.out.print("Enter the Element of the array = ");

        //input
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Array Elements Are =");

        //display
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
}