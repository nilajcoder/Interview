import java.util.Scanner;

public class Factorial{

    public static int facto(int n){

        if (n==0||n==1) {
            return 1;
            
        } else{
            return n*facto(n-1);// 
        }
    }

    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println("Factorial Of a Number is = "+facto(a));

    }
}