/*
 * 
 * WAP Length OF an Array 
 * 
 */


import java.util.Scanner;

public class ArrayLength {

    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int arr[]={1,2,3,4};
        System.out.println("Length of a  First Array is  = " +arr.length);
        System.out.println("Enter the Second  Array Size ");
        int size=sc.nextInt();
        int array []=new int[size];
         System.out.print("Enter the element Of an Array ");
        //input
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }

        System.out.print("Array Elements are ");
        for(int i=0;i<size;i++){
            System.out.println(array[i] + " "); 
        }

        int count=0;
        for(int i : array){
            count++;
        }

        System.out.println("Second Array Size = " + count);


    }
}