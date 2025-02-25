
public class palindromearray {

    public static boolean isPalindrome(int[] arr) {
        int n = arr.length; // Get the array size
        for (int i = 0; i < n / 2; i++) { // Loop only till the middle
            if (arr[i] != arr[n - 1 - i]) { // Compare the first and last elements
                return false; // If mismatch, it's NOT a palindrome
            }
        }
        return true; // If all match, it's a palindrome
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        if (isPalindrome(arr)) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is NOT a palindrome.");
        }
    }
      
    
    }
