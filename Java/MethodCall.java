

public class MethodCall {

    public static void SayHello(){
        System.out.println("Hii Hello ");
    }


    /*
     * If Method is not static then we need to create object of the class
     * and call the method using Object ref of the class 
     * 
     * public  void SayHello(){
        System.out.println("Hii Hello ");
    }

     MethodCall s=new MethodCall();
        s.SayHello();


        Conclusion:  If Method is not static then we need to create object of the class
                     and call the method using Object ref of the class.


                     If Method is static then we call the method using
                     1.ClassName.methodname
                     2. Directlycall the method (SayHello)
                     3.Creating Object Of class calling the method using ref to an object 
                     
     
     */
    public static void main(String[] args) {
        MethodCall.SayHello(); // method calling using Classname 
        SayHello(); //method calling
        MethodCall s=new MethodCall();
        s.SayHello();//calling the method using object ref

    }
}