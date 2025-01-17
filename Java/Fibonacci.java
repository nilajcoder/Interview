import java.util.Scanner;

public class Fibonacci {
      
      public static int fibo(int n){
        if (n==0||n==1) {
            return n;
        } else{

            return fibo(n-1)+fibo(n-2);  // 0 1 1 2 3 5 8
        }
      }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter nth Term ");
        int a=sc.nextInt();//6
        System.out.println("Fibonacci nth term is " + fibo(a));
        System.out.println("Fibbonacci series is ");
        for(int i=0;i<=a;i++){
            System.out.println(fibo(i));
        }
    }
}