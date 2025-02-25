import java.util.Scanner;

public class PallindromeString {

    public static void main(String[] args){
         
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a String = ");
        String str=sc.nextLine();

          // Reverse the string
          String reverseStr = "";
          for (int i = str.length() - 1; i >= 0; i--) {
              reverseStr += str.charAt(i);
          }
          System.out.println("Reversed String is = " + reverseStr);
  
          // Check if the string is a palindrome
          if (str.equals(reverseStr)) {
              System.out.println("The string is a palindrome.");
          } else {
              System.out.println("The string is not a palindrome.");
          }
        

    }
}