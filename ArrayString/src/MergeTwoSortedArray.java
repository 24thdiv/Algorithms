import java.lang.reflect.Array;
import java.util.Arrays;

class ArraySort{

	
	// merge two sorted array 
	public int[] merge(int[] a, int[] b) {
	    int[] result = new int[a.length + b.length];
	    int aIndex = 0, bIndex = 0;

	    for (int i = 0; i < result.length; i++) {
	        if (aIndex < a.length && bIndex < b.length) {
	            if (a[aIndex] < b[bIndex]) {
	                result[i] = a[aIndex];
	                aIndex++;
	            } else {
	                result[i] = b[bIndex];
	                bIndex++;
	            }
	        } else if (aIndex < a.length) {
	            result[i] = a[aIndex];
	            aIndex++;
	        } else {
	            result[i] = b[bIndex];
	            bIndex++;
	        }
	    }

	    return result;
	}	

	
	public int[] mergernew(int a[],int b[]){
		
		int ans[]=new int[a.length+b.length];
		
		 System.arraycopy(a,0, ans, 0, a.length); 
		 System.arraycopy(b,0,ans,a.length, b.length);
		 Arrays.sort(ans);
		
		
		return ans;
	}
	
}



public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArraySort aop = new ArraySort();
		int a1[] = {1,4,6,9};
		int a2[] = { 2,4,7,10,12};
		int ans[] = aop.merge(a1, a2);
		for(int i:ans){
			System.out.println(i);
		}
	
	}
	

}

