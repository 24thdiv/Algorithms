import java.util.Arrays;

public class BubbleSort {

	// average worst complexity O(n^2)
	// best O(n)
	//space O(1)
	// compare two elements and put largest lelement in last
	public static int[] bubbleSort(int arr[]){
		
		
		if(arr==null || arr.length==0)
			return null;
		
		int n = arr.length;
		int temp;
		for(int i=0;i<n;i++){
			for(int j=1; j<n-i;j++){
				
				if(arr[j-1]>arr[j]){
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
		//print(arr);
		
	}
	
	
	public static void print(int arr[])
	{
		for(int i=0; i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,4,4,6,8,3};
		int arr1[] = null;
		int arr2[] = { };
		int[] ans = bubbleSort(arr);
		System.out.println(Arrays.toString(ans));
		
		
	}

}
