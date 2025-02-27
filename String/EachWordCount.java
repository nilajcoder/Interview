

/*
 * In a String How many words are there 
 * and print the length of each word
 */

 import java.util.Scanner;

 public class EachWordCount {
  
     public static void main(String[] args) {
 
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a String:");
         String str = sc.nextLine();
         
         
         System.out.println("Your String: " + str);
         
         str = str.trim(); // Remove leading and trailing spaces
         String[] words = str.split("\\s+"); // Correct way to split by spaces
 
         /*
          * Total Number Of Words
          */
         System.out.println("Total Number of Words: " + words.length);
 
         /*
          * Print the length of each word
          */
         System.out.println("Word Lengths:");
         for (String word : words) {
             System.out.println(word + " -> " + word.length());
         }
     }
 }
 