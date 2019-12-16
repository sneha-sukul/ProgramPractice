package com.java.programs;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 371;
        int cube =0;
        int originalNumber=number;
        while(originalNumber!=0){
        	int remainder = originalNumber%10;
        	cube = cube+(remainder*remainder*remainder);
        	originalNumber=originalNumber/10;
        }
        System.out.println(cube);
        if(number==cube){
        	System.out.println("Given number is an armstrong number");
        }
        else{
        	System.out.println("Given number is not an armstrong number");
        }
    }
}