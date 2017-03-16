import java.util.ArrayList;

class ArrayOp{
	
	
	// roatate array to left for given number of times k
	// rotate array to right  lenght -k times   left rotate

	public  int[] arrayLeftRotation(int[] a, int n, int k) {
        if (k >= n) {
            k = k % n;
        }
        
        if (k == 0) return a;
        
        int[] temp = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (i + k < n) {
                temp[i] = a[i + k];
            } else {
                temp[i] = a[(i + k) - n];
            }
        }
        
        return temp;
    }



}





public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayOp arrayOp = new ArrayOp();
		int[] arr = {1,2,3,4,5};
		int ans[]=arrayOp.arrayLeftRotation(arr ,arr.length,4); // left rotation 4 times // right rotation 1 time
		//int ans[]=arrayOp.arrayLeftRotation(arr ,arr.length,arr.length-2); // right rotation 2 time rotation left 3 times
		
		for(int i:ans){
			System.out.println(i);
		}
		
		
	}

}
