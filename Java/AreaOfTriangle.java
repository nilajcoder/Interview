/*
 * Write a JAVA Program to find area of a triangle (Hint : A = ½ *h*b)
 */

import java.util.Scanner;

public class AreaOfTriangle {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Height of Triangle");
        double h=sc.nextDouble();
        System.out.println("Enter Breadth of Triangle");
        double b=sc.nextDouble();
        double area=0.5*h*b;


        System.out.println("Area Of a Triangle ="+area );
    }
 }