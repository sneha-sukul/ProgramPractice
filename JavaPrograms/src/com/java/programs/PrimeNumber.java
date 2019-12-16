package com.java.programs;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=10;i++){
			int counter=0;
			for (int j=1;j<=i;j++){
				if(i%j==0){
				counter++;
				}
			}
			if(counter==2){
				System.out.println(i);				
			}
		}
	}

}
