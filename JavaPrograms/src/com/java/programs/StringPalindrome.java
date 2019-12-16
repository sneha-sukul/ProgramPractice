package com.java.programs;


public class StringPalindrome {
	public static void main(String[] args) {
		String original = "SNEHA";
		String reverse = "";
		for(int i=original.length()-1;i>=0;i--){
			reverse= reverse+original.charAt(i);
	}
		
		System.out.println(reverse);
	}
}
