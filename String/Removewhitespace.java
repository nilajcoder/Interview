/*
 * 
 * Java Program To Remove White Spaces From Given String
 */

import java.util.Scanner;

public class Removewhitespace {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string with white spaces ");
        String str=sc.nextLine();
        System.out.println("String with white spaces = "+str);
        String result=str.replaceAll("\\s", "");
        System.out.println("String without spaces = "+result);


        

    }
 }