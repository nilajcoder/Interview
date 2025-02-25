/*
 * Write a JAVA Program to find area of a rectangle ( Hint : A = l*b)
import java.util.*;
class Test{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Length");
			double l=sc.nextDouble();
			System.out.println("Enter Breadth");
			double b=sc.nextDouble();
			double area=l*b;
			System.out.println("Area of Rectangle:"+area);
		}
}

E:\>java Test
Enter Length
5
Enter Breadth
2
Area of Rectangle:10.0
 

 */

import java.util.Scanner;

public class AreaOfRec {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Length ");
        int l=sc.nextInt();
        System.out.println("Enter a Breadth ");
        int b=sc.nextInt();
        int area=l*b;
        System.out.println("Area Of a Rectangle = "+ area);
        
    
    }
 }