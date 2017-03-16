import java.util.Arrays;

public class SelectionSort {

	
	// find smallest element and put front
	//best avg worst O(n^2) 
	public static int[] selectionSort(int arr[]){
		
		if(arr==null || arr.length==0)
			return null;
		if(arr.length==1)
			return arr;
		
		
		for(int i=0;i<arr.length-1;i++){
			
			int min=i;
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		
		}
		
		return arr;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,3,4,5,3};
		int arr1[] = null;
		int arr2[] = { };
		int arr3[] = {5,5,4,6,8,3};
		int arr4[] = {5};
		int ans[] = selectionSort(arr4);
		System.out.println(Arrays.toString(ans));
	}

}
