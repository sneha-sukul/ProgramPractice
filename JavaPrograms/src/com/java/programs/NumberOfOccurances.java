package com.java.programs;

public class NumberOfOccurances {
	public static void main(String[] args) {
		String s1= "Sneha SukulS";
		char ch[]= s1.toCharArray();
		for(int i=0; i<s1.length();i++){
			int counter=1;
		  for(int j=i+1;j<s1.length();j++){			  
			  if(ch[i]==ch[j]){
				  counter++;
				  System.out.println("repeating character " + ch[i] + " " + counter + " times");
			  }			 
		  }	
		  
		}
	}

}
