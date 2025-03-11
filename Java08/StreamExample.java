import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        List<String> list =Arrays.asList("apple","banana","cherry");
        /*
      1.  How to create List and convert them into stream
        */
        Stream <String> mystream =list.stream();

        String [] array ={"apple","banana","cherry"};
        /*
       2. How to create a array of string and convert them into stream
        */
        Stream <String> stream= Arrays.stream(array);
        /*

        3. Another way of creating stream of integer
        */
    
        Stream <Integer> myinteger =Stream.of(44,1,3,4,4,2,50,12,45,100);

        /*
        Use of Filter method 
        */
        List<Integer> filterlist =myinteger
                                  .filter(x ->x%2==0)
                                  .collect(Collectors.toList());
        System.out.println("Even Numbers are ="+filterlist);


        /*
        Use of map method 
        distinct use for not repetation
        sorted use for sort the value 
        */
        List<Integer> evendivisiontwo= filterlist.stream()
                                         .map(x->x/2)
                                         .distinct()
                                         .sorted()
                                         . collect(Collectors.toList());
        List<Integer> decendingorder = filterlist.stream().sorted((a,b)-> (b-a))
                                        .distinct()
                                        .collect(Collectors.toList());

        System.out.println("Even numbers dividebytwo = "+ evendivisiontwo);
        System.out.println("Decending order of my integers = " + decendingorder);


    }
}