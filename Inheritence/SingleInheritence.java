

class Parent{

    void m1(){
        System.out.println("Parent class method");
    }
}


class Child extends Parent{

    void m2(){
        System.out.println("Child class method");
    }
}



 public class SingleInheritence {

    public static void main(String[] args) {
        System.out.println("Case 1 ");
        Parent p1=new Parent();
        p1.m1();
        

       System.out.println("Case 2");
        Child c1=new Child();
        c1.m1();
        c1.m2();

        System.out.println("Case 3");
        Parent p2=new Child();
        p2.m1();;
        
    }

    
}