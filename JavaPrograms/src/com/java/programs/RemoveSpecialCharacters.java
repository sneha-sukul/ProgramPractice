package com.java.programs;

public class RemoveSpecialCharacters {
	public static void main(String[] args) {
		String str = "Pr@ogr#am%m*in&g Lan?^!.,/#guag(e";
		String removedcharcters = "";
		char ch[] = str.toCharArray();
		for (int i=0;i<str.length();i++){
			if((ch[i]>64)&& (ch[i]<=122) || (ch[i]== ' ')){
				removedcharcters = removedcharcters+ch[i];
			}
		}
		System.out.println("After removing the speial characters "+ removedcharcters);
	}

}
