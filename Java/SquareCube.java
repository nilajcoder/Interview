/*
 * 
 *  Write a JAVA Program to display square and cube of a number
 * 
 * import java.util.*;
class Test{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number");
			int a=sc.nextInt();
			System.out.println("squre of  number:"+a*a);
			System.out.println("Cube of  number:"+a*a*a);
		}
}
E:\>javac hi.java

E:\>java Test
Enter number
5
squre of  number:25
Cube of  number:125

 */

import java.util.Scanner;

public class SquareCube {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter a Number");
        int n=sc.nextInt();
        int sq=n*n;
        int cube=n*n*n;

        System.out.println("Square of a number = "+ sq);
        System.out.println("Cube of a number = "+cube);

    }
 }