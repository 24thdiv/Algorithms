import java.util.Arrays;

public class MergeSort {

	
	// all case complexity O(n log(n))
	// space complexity O(n)
	public static int[] mergeSort(int[] result){
		
		if(result==null || result.length==0   )
			return null;
		if(result.length == 1)
			return result;
		
		int mid = result.length/2;
		int[] left = new int[mid];
		int right[] = new int[result.length-mid];
		
		System.arraycopy(result, 0, left, 0, left.length);
        System.arraycopy(result, left.length, right, 0, right.length);

		left = mergeSort(left);
		right = mergeSort(right);
		result = merge(left,right);
		return result;
		
	}
	
	
	public static int[] merge(int[] left, int[] right) {
		
		int totlalength = left.length+right.length;
		int[] result = new int[totlalength];
		int indexL = 0;
		int indexR = 0;
		int indexRes = 0;
		
		
		while(indexL < left.length && indexR < right.length){
			
			if(left[indexL] < right[indexR]){
				result[indexRes] = left[indexL];
				indexL++;
				indexRes++;
			}
			else{
				result[indexRes] = right[indexR];
				indexR++;
				indexRes++;
			}
			
		}
		
		System.arraycopy(left, indexL, result, indexRes, left.length - indexL);
        System.arraycopy(right, indexR, result, indexRes, right.length - indexR);
		
		return result;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {1,3,4,5,3};
		int arr1[] = null;
		int arr2[] = { };
		int arr3[] = {5,5,4,6,8,3};
		int arr4[] = {5};
		int ans[] = mergeSort(arr4);
		System.out.println(Arrays.toString(ans));
	}

}
