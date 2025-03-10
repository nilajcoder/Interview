
/*

 What is Funtional Interface?
 * 
 * Ans -Functiol Interface having exactly single abstract method but 
 * can have any number of static methods. 
 * 
We can invoke lambda epression by using functional Interface

What is Predicate ?

Ans: Predicate is a Functional Interface which contains one abstruct method 
      it represents  a boolean valued function
    1.  boolean test(T,t);

     2.  default Predicate<T> and(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) && other.test(t);


       3.  default Predicate<T> negate() {
        return (t) -> !test(t);
    }

    4. default Predicate<T> or(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) || other.test(t);
    }

    5. static <T> Predicate<T> isEqual(Object targetRef) {
        return (null == targetRef)
                ? Objects::isNull
                : object -> targetRef.equals(object);
    }


    6.   static <T> Predicate<T> not(Predicate<? super T> target) {
        Objects.requireNonNull(target);
        return (Predicate<T>)target.negate();


      Predicate holds the condition that condition is true or false

*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicateexample {
    
    public static void main(String[] args) {
        Predicate<Integer> isEven = x->x%2==0; //it is test implementation functional Programming

        Predicate<String> startsWithN = x-> x.toLowerCase().charAt(0)=='n';

        Predicate<String> endsWithI = x-> x.toLowerCase().charAt(x.length()-1)=='i';
        
        List<Integer> numbers =Arrays.asList(1,2,3,4,5);

        System.out.println("Even Numbers are ");
        for(Integer i: numbers){
           if(isEven.test(i)){
            System.out.println(i);
           }
        }
       
        System.out.println("Check the String is Starting with n or not ");

        System.out.println(startsWithN.test("Nilaj"));
        System.out.println(startsWithN.test("Joy"));

       
        Predicate<String> and = startsWithN.and(endsWithI);
        System.out.println(" And ");

        /*
        dry run
        -------
        checks Aruni its starts with A it returns false
        and ends with i it returns true
        and operation false
        
        */
        System.out.println(and.test("Aruni")); //

    }

    
}