package com.java.programs;


public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,8,6,1,3};
		int temp =0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[i]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;					
				}
			}
	    }
		System.out.println("Array After Bubble Sort");  
        for(int i1=0; i1 < arr.length; i1++){  
                System.out.print(arr[i1] + " ");
        }
	}

}
