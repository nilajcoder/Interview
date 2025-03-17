

/*
 * Sum Of the digit until the digit is One
 * Input - 153
 * Output -1+5+3=9
 * 
 *  public : In java JVM has to access main method to start the application execution.
          To access main method by JVM from any location scope of main method must be 
          available to JVM . Thats why main method public
 
 
 static: In java JVM has to access main method to start the application execution.
         To call method JVM does not require any object reference that is why main 
         method have to make static.
         
         
 void main :  JVM calls the main method to start the execution but at the end of the main method when 
          application going to terminate JVM does not except from main method that is why return of 
          main method  void
          
 
 String: In java only String data type is having capability to represent any type of data.
 
 args[]/[]args: It is to represent more than one value we will use an array.
 
 
 System : It is predefined class present in java.lang package
 
 out :   Static variable of type PrintStream present in System class.
 
 println : It is a method Present in PrintStream class

 
 * 
 * Scanner:Scanner is a class in the java.util package that is used to take input from the user.
It can read input of different types such as integers, strings, and floating-point numbers.
sc:sc is just a variable (or reference) of type Scanner. It is the name we give to our Scanner object.
You can use any valid variable name instead of sc.
new Scanner(System.in):The new keyword is used to create a new object of the Scanner class.
System.in is an input stream that reads from the keyboard (standard input).
         
 * 
 */

import java.util.Scanner;

public class SumOfTwo {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in); 
        System.out.println("Enter a number ");
        int s=0;
        int n=sc.nextInt();
        while (n>0) {
            int r=n%10;
             s= s+r;
            n=n/10;
        }


        System.out.println("Sum of the digit is ="+s);
    }
      

    
}