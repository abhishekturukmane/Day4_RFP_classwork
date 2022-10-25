package com.bridgelabz;

public class MaxOfArray {

	public static void main(String[] args) {
		
		int[] arr= new int[5];
		//int[] arr={1,2,8,3,0};
		arr[0]=20;
		arr[1]=30;
		arr[2]=50;
		arr[3]=90;
		arr[4]=10;
		
		System.out.println("The values are:");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		
		//max
		int max=arr[0]; //max variable is initialized with 0th element in array
		for(int i=0;i<5;i++)
		{
			//arr[0]=20 > max=20
			//arr[1]=30 > max=20
			//arr[2]=50 > max=30
			//arr[3]=90 > max=50
			//arr[4]=10 > max=90
			
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("The max value is :"+ max);
	}
	
	
}
