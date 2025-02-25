
/*
 * 
 * Print Hello World in new Line like
 * Hello
 * World
 * User input will be Hello World.
 */

import java.util.Scanner;

public class Replace {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your String");
        String str=sc.nextLine();
        System.out.println("Your Enter Text is = "+str);
        String newstr=str.replace(" ", "\n ");
        System.out.print(newstr);

    }

    
}