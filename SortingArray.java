package exersize;												//---by Abd---//

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		Integer arr[]=new Integer[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element in an Array : ");
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
//---------------------------SORTING ASCENDING ORDER ---------------------------------//
		
	System.out.println("Sorting Ascending Order :");
	for(int i=0; i<arr.length; i++)
	{
		for(int j=0;j<arr.length; j++)
		{
		if(arr[i]<arr[j])
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		}
	}
	
	for(int i=0; i<arr.length; i++)
	{
		System.out.print(arr[i]+"  ");
	}
//------------------------------------------------------------------------------------//
	
	
//----------------------------SORTING DESCENDING ORDER--------------------------------//
	System.out.println("\nSorting Descending order :");
	for(int i=0; i<arr.length; i++)
	{
		for(int j=0;j<arr.length; j++)
		{
		if(arr[i]>arr[j])
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		}
	}
	for(int i=0; i<arr.length; i++)
	{
		System.out.print(arr[i]+"  ");
	}
//-----------------------------------------------------------------------------------//
	
//----------------------------SORTING ASCENDING ORDER USING INBUILD FUNCTION-------------//
	
	System.out.println("\nSorting Ascending Order Using Inbuild Function :");
	Arrays.sort(arr);
	for(int i=0; i<arr.length; i++)
	{
		System.out.print(arr[i]+"  ");
	}
	//----------------------------SORTING DESCENDING ORDER USING INBUILD FUNCTION------------//
	System.out.println("\nSorting Ascending Order Using Inbuild Function :");
	Arrays.sort(arr,Collections.reverseOrder());
	for(int i=0; i<arr.length; i++)
	{
		System.out.print(arr[i]+"  ");
	}
}
}
