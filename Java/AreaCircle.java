/*
 *  Write a JAVA Program to find area of circle.
 * 
 * import java.util.*;
class Test{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Radius");
			double r=sc.nextDouble();
			double area=3.14*r*r;
			System.out.println("Area of Circle:"+area);
		}
}


E:\>javac hi.java

E:\>java Test
Enter Radius
5
Area of Circle:78.5
 */

import java.util.Scanner;

public class AreaCircle {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius of Circle ");
        int r=sc.nextInt();
        double area=3.14*r*r;
        System.out.println("Area Of Circle is "+ area);
    }
 }