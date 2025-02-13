import java.util.Scanner;

public class GreatestNegetive {

    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a Number");
       int a=sc.nextInt();
       if(a==-1){
        System.out.println("It is a greatest Negative Number");
       }else{
        System.out.println("It is not greatest Negative number");
       }


    }
}