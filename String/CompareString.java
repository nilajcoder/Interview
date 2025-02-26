/*
 * Compare 2 strings

import java.util.*;
public class Hi{
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	 System.out.println("Enter your First name");
       String fname=sc.nextLine();
	   
	   System.out.println("Enter your Last name");
	   String lname=sc.nextLine();
	   
	  if(fname.compareTo(lname)==0){//if(fname.equals(lname))
		  System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }
  

   }
	  
}



E:\>javac Hi.java

E:\>java Hi
Enter your First name
Nilaj
Enter your Last name
Nilaj
They are the same string

E:\>java Hi
Enter your First name
Nilaj
Enter your Last name
Avishek
They are different strings
 * 
 */

import java.util.Scanner;

public class CompareString {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your First String ");
        String fstr=sc.nextLine();
        System.out.println("Enter Your Second String ");
        String secstr=sc.nextLine();

        if (fstr.equals(secstr)) {
            System.out.println("Strings are Same ");
            
        }else{
            System.out.println("Strings are Different");
        }

    }
 }