package com.java.programs;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int a =5;
		int firstNumber = 0;
		int secondNumber = 1;
		System.out.println(firstNumber );
		System.out.println(secondNumber );
		for (int i=1;i<=a;i++){
		int result = firstNumber + secondNumber;
		System.out.println(result );
		firstNumber=secondNumber;
		secondNumber=result;
		}
				
	       	
	}

}
