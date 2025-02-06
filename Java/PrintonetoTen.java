import java.util.Scanner;

public class PrintonetoTen {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number of turn");
        int n=sc.nextInt();
        System.out.println("Printing Numbers Are");
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}