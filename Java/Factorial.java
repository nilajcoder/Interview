

/*
 * WAP FIND a Factorial Of a  number
 * Input =5
 * Output =120
 */
/* 
public class Factorial{

    public static int facto(int n){

        if (n==0||n==1) {
            return 1;
            
        } else{
            return n*facto(n-1);// 
        }
    }
 */

 import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int fact=1;
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            fact=fact*i;
           

        }

        System.out.println("Factorial of a number = "+fact);

    }
}

    

    