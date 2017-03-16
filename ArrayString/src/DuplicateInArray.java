import java.util.Arrays;

public class DuplicateInArray {


	public static int duplicateinArray(int[] a){
		
		Arrays.sort(a);
		
		for(int i=0;i< a.length-1;i++){
			
			if(a[i]==a[i+1]){
				return a[i];
			}
			
		}
		return -1;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,4,3,2,3};
		System.out.println(DuplicateInArray.duplicateinArray(a));
		
	}

}
