import java.util.Scanner;

public class primenum {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        
        int count=0;
        for(int i=1;i<=n;i++){
            if (n%i==0) {
                count++;
            }
        }
        if (count==2) {
            System.out.println("It is a Prime number");
        } else
        System.out.println("It is not Prime number");
  

    }
}


/*
 * 
 * Input: n = 3
Execution of the loop
Iteration	i	n % i	Condition (n % i == 0)	count
1	1	3 % 1 = 0	✅ Yes	1
2	2	3 % 2 = 1	❌ No	1
3	3	3 % 3 = 0	✅ Yes	2
After the loop, count = 2, so the condition count == 2 is true.
It prints:
"It is a Prime number"

Input: n = 4
Execution of the loop
Iteration	i	n % i	Condition (n % i == 0)	count
1	1	4 % 1 = 0	✅ Yes	1
2	2	4 % 2 = 0	✅ Yes	2
3	3	4 % 3 = 1	❌ No	2
4	4	4 % 4 = 0	✅ Yes	3
After the loop, count = 3, so the condition count == 2 fails.
It prints:
"It is not Prime number"


 */