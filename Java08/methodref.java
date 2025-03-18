/*
 * What is Method Reference?
 * 
 * Method reference allow us to refer to a method
 * without invoking it
 * it is more readable
 * It is used in  place of Lambda expression
 * :: syntax
 */

import java.util.Arrays;
import java.util.List;

public class methodref {

    public static void print(String s){
        System.out.println(s);
    }

     public static void main(String[] args) {
        List<String> students=Arrays.asList("Alice","Bob","Rob");

        students.forEach(methodref::print);
        
     }
}