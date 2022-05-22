import java.util.Arrays;

public class Selectionsort {

	static void selectionSort()
	{
		int arr[]= new int[] {9,8,7,6,5,4,3,2,1};
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			
		}
		System.out.println(Arrays.toString(arr));
			
		
		
		
	}
	
	public static void main(String[] args) {
		
			selectionSort();
	}

}
