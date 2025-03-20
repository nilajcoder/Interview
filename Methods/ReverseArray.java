


/*
 * Reverse a Array using method 
 * dry run
 * ---------
 *  * arr[]={20,30,40,50}
             * i=arr.length=4-1=3  ;3>=0;i--  
             * 50
             * i=2 ;2>=0;i--
             * 50 40
             * i=1 ;1>=0;i--
             * 50 40 30
             * i=0;0>=0;i--
             * 50 40 30 20
 */
package javainterviewquestiones.array;

public class ReverseArray {

	public static void arrayrev(int arr[]) {

		System.out.print("Reverse Array is = ");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 30, 40 };
		arrayrev(a);

	}

}
