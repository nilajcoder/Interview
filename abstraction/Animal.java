


/*
 * 
 * 
 * 
 * Abstract Modifier
Abstract modifier: 'abstract' is a non-access modifier applicable for classes and methods but not for variables.

Abstract methods:
Even though we don’t have an implementation, we can still declare a method with the 'abstract' modifier.

Abstract methods have only declarations but not implementations.
Hence, abstract method declarations must end with a semicolon.


public abstract void m1();
Note: The child class is responsible for providing an implementation for the parent class's abstract methods.

Advantage:
The main advantage of abstract methods is that by declaring an abstract method in the parent class, we can provide guidelines to the child class regarding which methods they must compulsorily implement.

Note: A method with an empty body is not an abstract method.


 * Q. What is the difference between abstract class and abstract method?

If a class contains at least one abstract method, then it is compulsory for the corresponding class 
to be declared with the abstract modifier. Because the implementation is not complete, we can't create an object of that class.

Even though a class doesn't contain any abstract methods,
 we can still declare the class as abstract. That is, an abstract class can contain zero abstract methods as well.

Example 1: HttpServlet class is abstract, but it doesn't contain any abstract method.
Example 2: Every adapter class is abstract, but it doesn't contain any abstract method.
 */


package abstraction.com;

public abstract class Animal {
	
	/*
	 * Data members
	 */
	private int age;
	private int name;
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	
	/*
	 * Abstruct method
	 * If you create abstract method You must abstruct the class
	 * In Non abstruct class abstruct method not possiable
	 * In abstrct class You can create abstruct method  and concreate method
	 * 
	 *  
	 */
	public abstract void sayhello(); 
	
	public void sleep() {
		System.out.println("ZZZZZ");
	}
		
	

}
