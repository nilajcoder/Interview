
public class CheckOutput {

    public static void main(String[] args) {
             /*
         * Floating-Point Precision Error:
         * If we convert 0.1 base 10 to binary (base 2 )
         * 0.1 in decimal is 0.0001100110011001100110011001100110011... (repeating infinitely in binary).
            Since computers truncate or round this value, the stored number is slightly different from the
            actual value.
         */
        System.out.println( 0.1 + 0.2 );// 0.30000000000000004
        System.out.println(0.3+0.5);//0.8
        System.out.println(0.2+0.3);//0.5
        System.out.println(0.2 + 0.4);  // Output: 0.6000000000000001
        System.out.println(0.3 + 0.6);  // Output: 0.8999999999999999
        System.out.println(0.1 + 0.7);  // Output: 0.7999999999999999
        System.out.println(0.15 + 0.25);// Output: 0.4

        /*
        
         * To avoid  binary approximations   
         * We use Bigdecimal 
         */    

       
    }
}