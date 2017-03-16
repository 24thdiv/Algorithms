

/*
 *Suppose a sorted array is rotated at some pivot unknown
 to you beforehand. (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, 
otherwise return -1. You may assume no duplicate exists in the array.
 */
public class SearchSortedRotatedArray {


	public static int search(int nums[], int target){
		
		int left=0;
		int right=nums.length-1;
		int mid;
		
		  while(left<=right){
		        mid = left + (right-left)/2;
		        if(target==nums[mid])
		            return mid;
		 
		        if(nums[left]<=nums[mid]){
		            if(nums[left]<=target&& target<nums[mid]){
		                right=mid-1;
		            }else{
		                left=mid+1;
		            }
		        }else{
		            if(nums[mid]<target&& target<=nums[right]){
		                left=mid+1;
		            }else{
		                right=mid-1;
		            }
		        }    
		    }
		return -1;		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {4,5,6,7,0,1,2,3};
		System.out.println(SearchSortedRotatedArray.search(arr, 0));
		
	}

}
