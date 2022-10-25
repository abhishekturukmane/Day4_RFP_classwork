package com.bridgelabz;

public class ForEachArray {

	public static void main(String[] args) {
		//int
		int[] a={1, 5, 3, 2};
		for(int element:a)
		{
			System.out.println(element+ " ");//only elements u need to print not like a[element]
		}
		
		//double
		double[] ab=new double[3];
		ab[0]=2.589f;
		ab[1]=3.399f;
		ab[2]=4.988f;
		
		
		for(double i:ab)
		{
			System.out.println(i+ " ");
		}
		
		
	}
}
