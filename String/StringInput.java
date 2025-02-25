import java.util.Scanner;

public class StringInput {

    public static void main(String[] args) {
        /*
         * User Input
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First String");
         String str=sc.nextLine();
         System.out.println("Enter Second String ");
         String st=sc.nextLine();

         /*
          * Declaration Type 1

          In String Constant  Pool(SCP)abc and bcc is created there are no duplicate object these are same object
		 thats why when we use compare == and use equals method returns   true.
		 == true
		 equals true
          */
         String abc="java";
         String bcc="java";


         /*
          * Declaration Type 2
          */
         String str3= new String("java");
		String str4=new String("java");
        
         System.out.println("User Input String Output ");
         System.out.println("======================");
         System.out.println(str.equals(st));
         System.out.println(str==st);

         System.out.println(" Input String Type 1 Output ");
         System.out.println("===============================");
         System .out.println(bcc.equals(abc)); //true
         System.out.println(bcc==abc);//true


         System.out.println(" Input String Type 2 Output same Output as User Input ");
         System.out.println("===========================================================");
         System.out.println(str3.equals(str4)); //true because content is compared
         System.out.println(str3==str4);  //false  because content is not compared there are two different object





         
        
    }


}