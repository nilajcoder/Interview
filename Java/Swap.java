import java.util.Scanner;

public class Swap{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("Enter a number");//5
        int a=sc.nextInt();
        System.out.println("Enter Second number");//4
        int b=sc.nextInt();

        System.out.println("Before Swapping a= " +a +" b= "+b); //a=5 b=4

        a=a+b;//5+4=9
        b=a-b;//9-4=5   b=5
        a=a-b;//9-5=4   a=4
        System.out.println("After Swapping a= "+a +" b= " +b );// a=4 b=5

        
    }
    
}