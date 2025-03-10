package abstraction.com;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * You can Create object class of child class
		 */
		Dog dog=new Dog();
		dog.sayhello();
		
		Cat cat=new Cat();
		cat.sayhello();
		
		/*
		 * You can use ref of abstruct class
		 */
		Animal d=new Dog();
		d.sayhello();
		
		Animal c=new Cat();
		c.sayhello();
		
		/*
		 * Can not Create object of abstract class
		Animal a=new Animal();
		
		*/
		
		

	}

}
