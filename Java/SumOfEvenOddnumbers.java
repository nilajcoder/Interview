

/*WAP in JAVA
 * Enter a number suppose 5
 * 
 * so Even number till 5 is 2 4 sum is 6
 * odd numbers    till 5 is 1 3 5 sum is 9
 * 
 * 
 * 
 * import java.util.Scanner;

public class SumOfEvenOddnumbers {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int evensum=0,oddsum=0;

        System.out.println("Even numbers are ");
        for(int i=1;i<=n;i++){
            if (i%2==0) {
                System.out.println(i+ " ");
                evensum+=i;
                
            } 

        }
       
        System.out.println();

        System.out.println("Odd numbers are ");
        for(int i=1;i<=n;i++){
            if (i%2!=0) {
                System.out.println(i + " ");
                oddsum+=i;
                
            }
        }

        System.out.println();

      System.out.println("Even number sum = "+evensum);
      System.out.println("Odd numbers sum = "+oddsum);

    }
 }
 * 
 */


 import java.util.Scanner;

public class SumOfEvenOddnumbers {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int evensum=0,oddsum=0;

        System.out.println("Even numbers are ");
        for(int i=1;i<=n;i++){
            if (i%2==0) {
                System.out.print(i+ " ");
                evensum+=i;
                
            } 

        }
       
        System.out.println();

        System.out.println("Odd numbers are ");
        for(int i=1;i<=n;i++){
            if (i%2!=0) {
                System.out.print(i + " ");
                oddsum+=i;
                
            }
        }

        System.out.println();

      System.out.println("Even number sum = "+evensum);
      System.out.println("Odd numbers sum = "+oddsum);

    }
 }