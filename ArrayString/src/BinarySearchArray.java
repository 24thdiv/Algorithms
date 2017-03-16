
public class BinarySearchArray {


	
	// suppose array is sorted then use binaty search to find the elemnt index
	// or return -1
	public static int binarySearch(int arr[],int x){
		
		int low=0;
		int high=arr.length;
		int mid;
		
		while(low<=high){
			
			mid=(low+high)/2;
			if(arr[mid]<x){
				low=mid+1;
			}
			else if(arr[mid]>x){
				high=mid-1;
			}
			else{
				return mid;
			}
			
		}
		
		return -1;
	}
	

	//recursive 
	public static int binarySearchRec(int arr[],int x,int low,int high)
	{
		if(low>high) return -1;
		int mid = (low+high)/2;
		
		if(arr[mid]>x){
			return binarySearchRec(arr, x, low, mid-1);
		}
		else if(arr[mid]<x){
			return binarySearchRec(arr, x, mid+1, high);
		}
		else{
			return mid;
		}
			
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]={1,2,4,6,8,9};
		System.out.println(binarySearchRec(arr, 8,0,arr.length));
	}
	
}
