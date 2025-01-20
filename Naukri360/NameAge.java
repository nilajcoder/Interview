/*
Take the person's name and age as input and print out the name and age as specified in the output format.

Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
Ali
30
Sample Output 1:
The name of the person is Ali and the age is 30.
Explanation of Sample Input 1:
The input name is Ali and the input age is 30 which is printed in the specified format.
*/

import java.util.Scanner;

public class NameAge {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        String name=sc.nextLine();
        int age=sc.nextInt();
        System.out.println("The name of the person is " + name + " and the age is " + age + ".");
    }

    
}