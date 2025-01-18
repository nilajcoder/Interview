import java.util.Scanner;

public class Pallindrome {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int a=sc.nextInt();
        int n;
        int s=0;
         n=a;
        while (a>0) {
        int r=a%10;
        s=s*10+r;
        a=a/10;   
        }
        System.out.println("Reverse Number is = "+s);
       if (s==n) {
        System.out.println("It is a Pallindromde");
       }
         else{
            System.out.println(" Not Pallindrome ");
        
        
       }

    }
}