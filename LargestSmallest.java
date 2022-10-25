package com.bridgelabz;

public class LargestSmallest {

	public void LS() 
	{
		int[] a= {12,47,89,34,80};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			//a[0]=12>max=12
			//a[1]=47>max=12
			//max=47
			//a[2]=89>max=47
			//max=89
		    //a[3]=34>max=89
		    //a[4]=80>max=89
		    //max=89
					
			if(a[i]>max)
			{
				max=a[i];
			}
			//a[0]=12<min=12
			//a[1]=47<min=12
			//a[2]=89<min=12
			//a[3]=34<min=12
			//a[4]=80<min=12
			//min=12
			else if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("The max value is:"+ max);
		System.out.println("The min value is:"+ min);
	}
	public static void main(String[] args) {
		LargestSmallest obj=new LargestSmallest();
		obj.LS();
	}
}
