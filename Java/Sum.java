/*
 *  Write a JAVA program to calculate sum of two integer’s numbers and print it.
 * import java.util.*;
class Test{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Two number");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int s=a+b;
			System.out.println("Sum of two numbers:"+s);
		}
}

E:\>javac hi.java

E:\>java Test
Enter Two number
5
20
Sum of two numbers:25
 */

import java.util.Scanner;

public class Sum {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b=sc.nextInt();
        int s=a+b;
        System.out.println("Sum of Two Number "+s);
    }
 }