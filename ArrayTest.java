package com.bridgelabz;

public class ArrayTest {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};//initialization and declaration
		
		
		for(int i=0;i<3;i++)//to traverse row
		{
			for(int j=0;j<3;j++)// to traverse column
			{
				System.out.println(a[i][j]);
				
			}
			//System.out.println();
		}
		
	}
}
