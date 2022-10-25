package com.bridgelabz;

public class SumOfArray {

	public static void main(String[] args) {
		int[] arr= {5, 4 , 3, 9 ,0 };
		System.out.println("The values of array are:");
		for(int i=0;i<=4;i++)
		{
			System.out.println(arr[i]);
			
		}
		
		//sum
		int sum=0;
		for(int i=0;i<=4;i++)
		{
			sum+=arr[i];
		}
		System.out.println("The sum of array elements is:"+ sum);
	}
}
