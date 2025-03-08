

/*
 * 
 * Abstraction is a process of hiding the implementation details and showing only
functionality to the user.

We use abstract keyword to Abstract the class.
It is a Non access Modifier.



Abstract class : For any java class if we are not allowed to create an object such type of class
                  we have to declare with abstract modifier.

Note: An abstract class may or may not define an Abstract method .
       but in the class has abstract method you should compulsory class abstact. 
 * 
 * In Java, an interface is a reference type 
 * that is similar to a class but only contains method signatures and constants. 
 * It is used to achieve abstraction
 * INTERFACE: 100% pure abstract class is called INTERFACE.

An Interface contains behaviours that a class Implementation.
 * 
 * 
 * Note: Every method present inside interface is always PUBLIC and ABSTRACT whether declaring or not .
 * 
 * What is a Functional Interface in Java?
A functional interface in Java is an interface that has only one abstract method.
 It is mainly used for lambda expressions and method references in Java 8 and later.


 What is Funtional Interface?
 * 
 * Ans -Functiol Interface having exactly single abstract method but can have any number of static methods. 
We can invoke lambda epression by using functional Interface


1.public interface FunctionalInterface {

    
}

is it functional Interface?
Ans- No

2. @FunctionalInterface
 public interface FunctionalInterface {

    
 }
 is it FI?

 Ans-No


 3.  public interface FunctionalInterface {
    public void sayhello();
    
 }

 is it FI?

 ans-Yes


 4. public interface FunctionalInterface {
     void sayhello();
    
    
 }

 is it FI?
 Ans- YES

 5.  @FunctionalInterface
 public interface FunctionalInterface {
    public void sayhello();
    
 }
    is it FI?

ans- YES



6.  @FunctionalInterface
 public interface FunctionalInterface {
    public void sayhello();
    public void SayHii();
    
 }

 is it FI?

 Ans- NO


 7.  public interface FunctionalInterface {
    public void sayhello();
    public void SayHii();
    
 }
    is it FI?

ans- NO



8. @FunctionalInterface
 public interface FunctionalInterface {
     void sayhello();
     void SayhelloLambda();
    
    
 }

 Ans- NO

9. @FunctionalInterface
 public interface FunctionalInterface {
     void sayhello();
     default void bye(){

     };
    
    
 }

 Is it FI?

 Ans-Yes

 10. 
 public interface FunctionalInterface {
     void sayhello();
     default void bye(){

     };
    
    
 }
     is it FI?

ans- Yes


11. @FunctionalInterface
 public interface FunctionalInterface {
     void sayhello();
     default void bye(){

     };

     public static void say(){

     };
    
    
 }

 is it FI?
 Ans- Yes

 12.  
 public interface FunctionalInterface {
     void sayhello();
     default void bye(){

     };

     public static void say(){

     };
    
    
 }

is it FI?

Ans-YES


13.     
    @FunctionalInterface
    public interface MyFunctionalInterface {
	void doWork();  
        String toString(); 
    }
   Is the above interface is a functional interface? 
      Yes.
   Note: If any Object class method is added as an abstract method to the 
         functional interface, then still it is functional interface only.
 */



package java8.practice;


@FunctionalInterface

public interface Myinter {
	public abstract void sayhello();

}
