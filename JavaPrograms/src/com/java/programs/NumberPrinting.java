package com.java.programs;

public class NumberPrinting {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++){
			int temp=0;
			for(int j=0;j<=i;j++){
				int contents[][] = new int[5][5];
				contents[i][j]= temp+1;
				temp++;
			    System.out.print(contents[i][j]+ " ");
			}
			System.out.println();
	   }
	}

}
