
/*
 * WAP Input String and return Longest word in a String and find the Length of it
 */

import java.util.Scanner;

public class ReturnLongWord {

  public static String LongestWord(String st){
    
    String longest = "";
        for (String word : st.split(" ")) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
  }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String ");
        String str=sc.nextLine();
        System.out.println("Your Entered String is =" +str);
        System.out.println("Longest Word in the String is =" + LongestWord(str));
        System.out.println("Length of the Longest String is ="+ LongestWord(str).length());
    }
}