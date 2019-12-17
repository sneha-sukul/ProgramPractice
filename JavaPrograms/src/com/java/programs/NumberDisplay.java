package com.java.programs;

public class NumberDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		for(int i=0;i<4;i++){
		  for(int j=0;j<=i;j++){
			 int contents[][] = new int[4][4];
			 temp=temp+1;
			 contents[i][j]= temp;
			 System.out.print(contents[i][j]+ " ");
		  }
		   System.out.println();
	    }
	}

}
