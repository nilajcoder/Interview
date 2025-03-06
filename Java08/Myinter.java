

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
 */



package java8.practice;


@FunctionalInterface

public interface Myinter {
	public abstract void sayhello();

}
