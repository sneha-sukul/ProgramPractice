package com.java.programs;


public class HDFC extends Bank {
	@Override
	public void loan(){
		System.out.println("HDFC loan interest");
	}
	public static void main(String args[]){
		Bank b = new HDFC();
		b.loan();
		Bank.salary();
		HDFC h = new HDFC();
		h.loan();
		
	}
}
