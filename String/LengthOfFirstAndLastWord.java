
/*
 * Find the Length Of Last Word in a String
 * Find the Length Of First Word in a String
 */

public class LengthOfFirstAndLastWord {

    public static void main(String[] args) {
        String str="Hii I Learning Java ";
        int len=0;
         str=str.trim();
        for(int i=str.length()-1;i>=0;i--){
            if (str.charAt(i)==' ') {
                break;
                
            } else{
                len++;
            }

        }

        // Finding the length of the first word
        int firstWordLength = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                break;
            } else {
                firstWordLength++;
            }
        }
        System.out.println("Length Of a First Word "+firstWordLength);
        System.out.println("Length Of a Last Word = "+len);
        
    }
}