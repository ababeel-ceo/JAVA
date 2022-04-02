package exersize;

import java.util.Scanner;

public class MatrixOperation {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Rows  and Columns Value :");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter the Matrix Value :");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				a[i][j]=sc.nextInt();
			}
			
		}
		
		System.out.println("Matrix is  : \n");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		/*   Transpose Matrix   */
		//-------------------------//
		
		// Watch deeply on the For loop//
		System.out.println("TRanspose Matrix is  : \n");
		for(int i=0; i<c; i++)
		{
			for(int j=0; j<r; j++)
			{
				System.out.print(a[j][i]+"  ");
			}
			System.out.println();
		}
		
		/* Center Element of an Array   */
		//-----------------------------//
		double cen=(r*c)/2;
		int s=(int) cen;
		s=--s/2;
		System.out.println();
		System.out.println("Center Element of an Array :"+a[s][s]);
		
		// Samllest value in an Array //
		//----------------------------//
		int sml=Integer.MAX_VALUE;
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				if(sml > a[i][j])
				{
					sml=a[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("Smallest element in an Array  :"+sml);
		//Sum of the all element in an Array//
		//-----------------------------------//
		int sum=0;
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				
					sum+=a[i][j];
				
			}
			System.out.println();
		}
		System.out.println("Smallest element in an Array  :"+sum);
	}

}
