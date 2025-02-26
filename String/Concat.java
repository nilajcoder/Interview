

/* 
.Concatenation (Joining 2 strings)

import java.util.*;
public class Hi{
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	 System.out.println("Enter your First name");
       String fname=sc.nextLine();
	   
	   System.out.println("Enter your Last name");
	   String lname=sc.nextLine();
	   
	   String Fullname= fname+" "+lname;
	   
	   System.out.println(Fullname);   
   }
}

E:\>javac Hi.java

E:\>java Hi
Enter your First name
Nilaj
Enter your Last name
Chakraborty
Nilaj Chakraborty
//concat


import java.util.*;
  class Hi {
   public static void main(String args[]) {
           Scanner sc=new Scanner(System.in);
		   System.out.println("Enter your First name");
       String fname=sc.nextLine();
	   
	   System.out.println("Enter your Last name");
	   String lname=sc.nextLine();
	  	String co=fname.concat(" ");
		 String con=co.concat(lname);
		System.out.println("Full name is"+" "+con);
					
 }
  }

E:\>java Hi
Enter your First name
Nilaj
Enter your Last name
Chakraborty
Full name is Nilaj Chakraborty

*/

import java.util.Scanner;

public class Concat {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First String ");
        String str=sc.nextLine();
        System.out.println("Enter Second String ");
        String st=sc.nextLine();
        String result=str.concat(st);
        String res=str + " " +st;
        System.out.println("Concat String is "+result);
        System.out.println("String is "+ res);

    }
}