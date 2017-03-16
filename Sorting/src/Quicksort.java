
public class Quicksort {

	// complexity 
	//best and average case  O(nlog(n))  
	//worst case O(n^2)- pivot is smallest or largest
	// space complexity O(log n)
	public static void quickSort(int arr[], int low, int high){
		
		if(arr==null || arr.length==0)
			return;
		if(low>=high)
			return;
		
		int middle = low + (high-low)/2;
		int pivot = arr[middle];
		int i = low;
		int j = high;
		
		while(i<=j){
			
			while(arr[i]<pivot)
				i++;
			while(arr[j]>pivot)
				j--;
			
			if(i<=j){
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		if(low<j)
			quickSort(arr, low, j);
		if(high>i)
			quickSort(arr,i, high);
	}
	
	
	public static void print(int arr[])
	{
		for(int i=0; i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,5,4,6,8,3};
		int arr1[] = null;
		int arr2[] = { };
		int arr3[] = {5,5,4,6,8,3};
		
		//int low = 0;
		//int high = arr.length-1;
		
		quickSort(arr3, 0, arr3.length-1);
		print(arr3);
	}

}
