import java.util.Arrays;

public class PairoffElementsSum {


	// find the pair of array whoes sum is given
	public static void findelelements(int sum, int arr[]){
		
		Arrays.sort(arr);
		int i = 0;
		int j= arr.length-1;
		while( i<j){
			
			if(arr[i]+arr[j]>sum){
				
				j--;
			}
			else if(arr[i]+arr[j]<sum){
				
				i++;
			}
			else if(arr[i]+arr[j]==sum){
				System.out.println("Pair is "+ arr[i]+" "+arr[j]);
				i++;
				j--;
			}
			
			
		}
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]={1,4,2,3,5,6};
		findelelements(6, arr);
		
	}

}
