package com.java.programs;


public class StringSentenceReverse {
	public static void main(String[] args) {
		String original = "......My.....name.........is.Divya.....";
		
		String[] array = original.split("\\.");
		String rev = "";
		String word = "";
		char[] arr = original.toCharArray();
		for(int i = arr.length-1;i>=0; i--)
		{
			if(arr[i] == '.')
			{
				if(!word.isEmpty())
				{
				char[] arr2 = word.toCharArray();
				word = "";
				for(int j = arr2.length-1;j>=0;j--)
				{
					word = word+arr2[j];
				}
				rev = rev+word;
				word = "";
			}
				rev = rev+".";
			}
			else
			{
				word = word+arr[i];
				
			}
			
		}
		System.out.println(rev);
	}

}
