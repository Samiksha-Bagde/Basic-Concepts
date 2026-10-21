package com.basic_concepts;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		int fac=1;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1;i<=num; i++) {
			fac = fac*i;
		}
		System.out.println("Factorial of "+num+" :"+fac);
		}
}
