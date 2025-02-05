
/*
 * Take a number from user and check given number is even or odd
 */
import java.util.Scanner;

public class EvenOdd {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
        

    }
}