/*
 * 
 * wap  Find First Non Repeated Character and print the index of it
 * 
 * 
 * 
 * import java.util.Scanner;

public class Firstnonrepeating {
 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string ");
        String str=sc.nextLine();

        for(int i=0;i<str.length();i++){
            boolean unique=true; 

          for(int j=0;j<str.length();j++){
              if (i!=j && str.charAt(i)==str.charAt(j)) {
                  unique=false;
              }

          }
            if(unique){
              System.out.println("First Non Repeating char = "+str.charAt(i));
              break;
            }

       }

  }
}





 */

   public class Firstnonrepeating {
    public static int firstNonRepeatingCharIndex(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character appears only once in the string
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeating character: " + ch);
                return i; // Return the index
            }
        }
        return -1; // Return -1 if no non-repeating character is found
    }

    public static void main(String[] args) {
        String str = "swiss";
        int index = firstNonRepeatingCharIndex(str);

        if (index != -1) {
            System.out.println("Index: " + index);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
    
   /*We loop through each character in the string.
str.charAt(i) gets the character at index i.




    * 1. str.indexOf(ch) - First Occurrence
str.indexOf(ch) returns the first position of character ch in the string.
Example:

java
Copy
Edit
String str = "swiss";
System.out.println(str.indexOf('s')); // Output: 0
System.out.println(str.indexOf('w')); // Output: 1
System.out.println(str.indexOf('i')); // Output: 2
's' first appears at index 0
'w' first appears at index 1
'i' first appears at index 2
2. str.lastIndexOf(ch) - Last Occurrence
str.lastIndexOf(ch) returns the last position of character ch in the string.
Example:

java
Copy
Edit
System.out.println(str.lastIndexOf('s')); // Output: 4
System.out.println(str.lastIndexOf('w')); // Output: 1
System.out.println(str.lastIndexOf('i')); // Output: 3
's' last appears at index 4
'w' last appears at index 1
'i' last appears at index 3
    */