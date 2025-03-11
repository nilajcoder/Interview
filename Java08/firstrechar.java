
/*
 * wap  Find First  Repeated Character and print the index of it in java 8
 */

import java.util.Scanner;
import java.util.stream.Stream;

public class firstrechar {
 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String ");
        String str=sc.nextLine();
        System.out.println("Your entered String is = "+str);

        String firstnon= Stream.of(str.split(""))
                          .filter(c->str.indexOf(c)!=str.lastIndexOf(c))
                          .findFirst()
                          .get();
       System.out.println("First Non repeted Charecter in a String = "+ firstnon); 
       int index = str.indexOf(firstnon);
       System.out.println("Index of First Non repeted charecter index number = "+index);     
        
    }
 }