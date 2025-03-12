

/*
1 . How to create a List  and convert them into stream
2. How to create a array of string convert them into stream
3. How to create a stream
4.Create a Stream of integers and return the even numbers as a list

5. Divide the even numbers by 2 and return the list make sure list
   has not duplicate value and list must be sorted.(ascending order)

6. After division of even numbers return the list as a descending order


** what is stream?
    Introduced in Java 8 
    Process Collections of Data in a functional and declarative manner 
    A sequence of element supporting functional and declarative programmimg
    It is a Interface 
    * Simplify data processing
    *Embrace functiional Programming 
    *Improve Readability and maintainability


*/


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