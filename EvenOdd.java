package com.bridgelabz;

public class EvenOdd {

	public void EO()
	{
		int[] arr= {1 , 2 , 5 ,9 ,0};
		//printing elements
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+" is a even no");
			}
			else
			{
				System.out.println(arr[i]+" is a odd no");
			}
		}
		
	   //check for even odd
		
		
	}
	public static void main(String[] args) {
		EvenOdd obj=new EvenOdd();
		obj.EO();
	}
}
