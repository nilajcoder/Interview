
/*

 WAP :Reverse only the big words in a sentence 
 (e.g., "reverse the big word only" → "esrever the big word only")
*/

import java.util.Scanner;
public class LongestWordRev {

    public static String LongestWord(String st){
    
        String longest = "";
            for (String word : st.split(" ")) {
                if (word.length() > longest.length()) {
                    longest = word;
                }
            }
            return longest;
      }

      public static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }

      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String ");
        String str=sc.nextLine();
        System.out.println("Your Entered String is =" +str);
        String longest= LongestWord(str);
        String longestwordrev=reverseWord(longest);
        System.out.println("Longest Word in the String is =" + longest);
        System.out.println("Longest Word Reverse = "+ longestwordrev);

      }
}