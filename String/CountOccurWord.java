
/*
 * Program - count the number of occurrences of a word in a given string

Input:
String: welcome to cloudtech and cloudtech is a good channel to learn programming.
Word to count the occurrences: cloudtech

Output:
Number of occurrences: 2

 */


public class CountOccurWord {
      
    public static void main(String[] args) {
        
        String str="welcome to cloudtech and cloudtech is a good channel to learn programming.";
        String word="cloudtech";

        int count=0;

        /*
temp[0] = "welcome"
temp[1] = "to"
temp[2] = "cloudtech"
temp[3] = "and"
temp[4] = "cloudtech"
temp[5] = "is"
temp[6] = "a"
temp[7] = "good"
temp[8] = "channel"
         */
        String temp[]=str.split(" ");
        for(int i=0;i<temp.length;i++){
          if(word.equals(temp[i])){
            count++;
          }
        }
        System.out.println(count);

        /*
         * Total number of Word
         */

          // Split the string by spaces
        String words[] = str.split("\\s+");

        // Print the total number of words
        System.out.println("Total number of words: " + words.length);
    }
         
}