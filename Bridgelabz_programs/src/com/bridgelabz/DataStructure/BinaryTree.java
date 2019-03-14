package com.bridgelabz.DataStructure;
/**
 * BInary Tree  
 * @author Rohan Kadam
 *
 */
public class BinaryTree {
	static long facto = 1;
	static long facto2 = 1;
	static long facto1 = 1;
/**
 * Factorial of N
 * @param n=long 
 * @return
 */
	public static long fact(long n) {

		for (int i = 1; i <= n; i++) {
			facto = i * facto;
		}
	System.out.println(facto);
		return facto;
	}
/**
 * Factorial of 2N
 * @param n:-long input
 * @return:-long Factorial value
 */
	public static long factorial2(long n) {
		long n2 = 2 * n;
		for (int i = 1; i <= n2; i++) {
			facto2 = i * facto2;
		}
//		System.out.println(facto2);
		return facto2;
	}
/**
 * Factorial of N+1
 * @param n:-Long input
 * @return:-Long Factorial Value
 */
	public static long factoria13(long n) {
		long n1 = n + 1;
		for (int i = 1; i <= n1; i++) {
			facto1 = i * facto1;
		}
//		System.out.println(facto1);
		return facto1;
	}

	public static void main(String[] args) {
//		System.out.println("__");
		int n = DSUtility.inputInt();
		long tree = ((factorial2(n)) / (factoria13(n) * fact(n)));
		System.out.println(tree);

	}

}
