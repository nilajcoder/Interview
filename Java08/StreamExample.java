

/*
1 . How to create a List  and convert them into stream
2. How to create a array of string convert them into stream
3. How to create a stream
4.Create a Stream of integers and return the even numbers as a list

5. Divide the even numbers by 2 and return the list make sure list
   has not duplicate value and list must be sorted.(ascending order)

6. After division of even numbers return the list as a descending order

7. Create list of integers  squre of each value in sorted order.

8. Create list of integer . Calculate sum of all integers. 

9. Counting Occarence of a charecter 
  Input: Hello
   Output - 2 (l occurs 2 times)

10. Find the length Of a String


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

        /*
         * Decending Order
         */
        List<Integer> decendingorder = filterlist.stream().sorted((a,b)-> (b-a))
                                        .distinct()
                                        .collect(Collectors.toList());

        System.out.println("Even numbers dividebytwo = "+ evendivisiontwo);
        System.out.println("Decending order of my integers = " + decendingorder);

       /*
        * Create list of integers  squre of each value in sorted order.
        */
        List<Integer> num= Arrays.asList(2,10,100,15,1);
        System.out.println("List is "+ num);
        System.out.println("Squre of Each number sorted order = "+ num.stream().map(x->x*x).sorted().toList());


       /*
        * Create list of integer . Calculate sum of all integers. 
        Use Of reduce 

        */
        List<Integer> suminteger=Arrays.asList(1,2,3,4,5);
        System.out.println("List is = "+suminteger);
        System.out.println("Sum Of values = "+ suminteger.stream().reduce(Integer::sum).get());



        /*
         * Counting Occarence of a charecter 
  Input: Hello
   Output - 2 (l occurs 2 times)

   Find the length Of a String
         */
        String str="HeLlo";
        System.out.println("String is = "+str);
        System.out.println("How many Occerence charecter l ="+str.toLowerCase().chars().filter(x->x=='l').count());
        System.out.println("Length of a String "+str.chars().count());

    }
}