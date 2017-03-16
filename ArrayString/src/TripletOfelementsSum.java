
public class TripletOfelementsSum {

	
	public static void tripletofSum(int[] arr,int sum){
		
		if(arr.length<3) return;
		
		for(int k=0;k<arr.length-2;k++){
			
			int i=k+1;
			int j=arr.length-1;
			while(i<j){
				
				if(arr[k]+arr[i]+arr[j]==sum){
					System.out.println(arr[k]+" "+arr[i]+" "+arr[j]);
					i++;
					j--;
				}
				else if(arr[k]+arr[i]+arr[j]>sum){
					j--;
				}
				else if(arr[k]+arr[i]+arr[j]<sum){
					i++;
				}	
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {9,3,2,4,5,6,8,1};
		tripletofSum(arr, 6);
		
	}

}
