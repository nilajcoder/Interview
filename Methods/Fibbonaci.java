
/*
 * WAP in Java Fibbonaci series 
 * 
 * 
 * Recursion
 */

package basic;

import java.util.Scanner;

public class Fibbonaci {

	public static int fibo(int n) {

		if (n == 0 || n == 1) {
			return n;
		} else {

			return fibo(n - 1) + fibo(n - 2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n th Term ");
		int n = sc.nextInt();

		System.out.println("The " + n + "term of fibonacci number is = " + fibo(n));

		System.out.println("Fibonacci Series up to " + n + "term ");

		for (int i = 0; i <= n; i++) {
			System.out.println(fibo(i));
		}

	}

}
