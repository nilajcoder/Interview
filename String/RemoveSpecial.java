

/*
 * Java Program To Remove Special Characters From Given String 
 */

import java.util.Scanner;

public class RemoveSpecial {
 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String with Special Charecter");
        String str=sc.nextLine();

        String result=str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("After Removing Special Charecter ="+result);
    }
 }