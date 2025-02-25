import java.util.Scanner;

public class StringRevRec {

    public static String revString(String str){
        if(str.isEmpty()){
            return str;
        } else{

            return revString(str.substring(1))+str.charAt(0);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String = ");
        String str=sc.nextLine();
        System.out.println("Reverse String is = "+revString(str));
        
    }

    
}