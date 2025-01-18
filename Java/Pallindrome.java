import java.util.Scanner;

public class Pallindrome {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Number = ");//54
        int a=sc.nextInt();
        int n;
        int s=0;
         n=a;//54
        while (a>0) { //54>0  5>0
        int r=a%10; //54%10=4  5%10=5
        s=s*10+r;//0*10+4=4    0*10+5=5   45
        a=a/10;  //54/10=5   5/10=0
        }
        System.out.println("Reverse Number is = "+s); //45
       if (s==n) { //45==54
        System.out.println("It is a Pallindromde");
       }
         else{
            System.out.println(" Not Pallindrome "); //not pallin
        
        
       }

    }
}