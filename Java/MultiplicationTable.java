
/*
 * WAP In Java Of Multiplication of Table
 */

import java.util.Scanner;

public class MultiplicationTable {
 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");//For printing purpose
        int n=sc.nextInt();//for input purpose

        //Logic 
        /*
         * If I input 5
         * i=1 1<=10 ;i++
         * i=2 2<=10; i++
         * i=10;10<=10;i++
         * i=11 11<=10 false 
         * 
         * 5*1=5
         * 5*2=10
         * .....
         * 5*10=50
         */
        for(int i=1;i<=10;i++){  
            System.out.println(n +"*"+i + "="+  n*i);
        }
    }
 }