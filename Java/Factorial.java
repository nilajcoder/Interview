

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

    

    /*
     * 
     * dry run
     * -------
     * System.out.println("Enter a number"); 5
        int fact=1;
        int a=sc.nextInt(); 5
        for(int i=1;i<=a;i++){   1<=5   i++ 2<=5 i++  3<=5 i++ 4<=5 i++  5<=5  6<=5 false so terminate the loop
            fact=fact*i;        fact=1*1=1
                                fact=1*2=2
                                fact=2*3=6
                                fact=6*4=24
                                fact=24*5=  120


           

        }

        System.out.println("Factorial of a number = "+fact); 120
     */