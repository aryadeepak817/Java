package com.search.algo;

public class BinarySearchExample 
{
	public static void main(String[] args) {
		int arr[] = {10,22,34,41,55,61,68,74,88};
		int leng= arr.length; 
		int element=41;
		int index= findElementIndexMethod(arr, leng, element);
		System.out.println("find the index of searched element 41: "+index);
		
	}
	
	public static int findElementIndexMethod(int arr[], int len,int element)
	{
		int low=0, high= len-1; 
		
		while(low<=high)
		{
			int middle= low+(high-low)/2; // 8-0/2= result is 4
			
			if(arr[middle] == element)
				return middle; 
		
			if(arr[middle] > element) // 55 > 41  take left hand elements
				high= middle-1; // this will take left elements and make high set to middle-1, before mid=4 now mid =3 
			else
				low= middle+1; 
		}
		return -1;
		
	}

}
