import java.util.Scanner;

public class LengthOfaString {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str ="Ram";
        System.out.println("Length of a First string = "+ str.length() );

        System.out.println("Enter a Second String ");
        String abc=sc.nextLine();
        System.out.println("Your Entered Second String is = "+ abc);

        int c=0;
        for(char i : abc.toCharArray()){
            c++;
        }
        System.out.println("Length of a Second String = " +c);
    }
}