import java.util.Arrays;

public class InsertionSort {


	public static int[] insertionSort(int[] arr){
		
		if(arr==null||arr.length==0) return null;
		if(arr.length==1) return arr;
		
		for(int i=1;i<arr.length;i++){
			for(int j=i;j>0;j--){
				if(arr[j]<arr[j-1]){
					int tmp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1] = tmp;
				}
				
			}
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
		int ans[] = insertionSort(a);
		System.out.println(Arrays.toString(ans));
		
		
	}

}
