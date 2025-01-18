import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int a=sc.nextInt();
        int s=0;
        while (a>0) {
            int r=a%10;
             s=s*10+r;
            a=a/10;
            
        }

        System.out.println("Reverse Number is =   "+s);

    }
}