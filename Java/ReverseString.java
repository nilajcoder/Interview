import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your String = ");
        String str=sc.nextLine();
        System.out.println("Your Entered String is  = "+str);
         System.out.print("Reverse String is  =");
        for(int i=str.length()-1;i>=0; i--){
            
            System.out.print( str.charAt(i));
        }
    }
}