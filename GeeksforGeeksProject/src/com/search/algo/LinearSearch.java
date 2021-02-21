package com.search.algo;

public class LinearSearch 
{
	static int temp=0;
	public static void main(String[] args) 
	{
		
		int arry[] = {10,20,6,25,71,44,30,41,45,56};
		int length= arry.length;
		int element= 34; 
		
		int index= findElementLinearly(arry, length, element);
		System.out.println("element 44 is found at index:  "+index);
		if(temp==0)
		{
			System.out.println("Element is not present in this array. ");
		}
	}
	
	public static int findElementLinearly(int [] arry, int length, int element)
	{
		
		for(int i=0; i<length; i++)
		{
			if(arry[i]==element)
			{
				temp= temp+1;
				return i;
			}
				
		}
		return -1; 
	}

}
