import java.util.Arrays;
import java.util.List;

public class SayHiiLambda {

    public static void SayHii(String message){
        System.out.println(message);
    }

    public static void main(String[] args) {
        List<String> names=Arrays.asList("Tom","Latham","Miller","Cook");
        names.forEach(name->SayHii(name));// use of lambda exp
        names.forEach(SayHiiLambda::SayHii);// use Of method reference uses only single statement
        
    }
}