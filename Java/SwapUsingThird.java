import java.util.Scanner;

class SwapThird{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a First Number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b=sc.nextInt();
        int t;
        
        System.out.println("Before Swapping a=  "+a +" b="+b);
        t=a;//5
        a=b;//6
        b=t;//5

        System.out.println("After Swapinng a="+a+" b="+b);
    }
}