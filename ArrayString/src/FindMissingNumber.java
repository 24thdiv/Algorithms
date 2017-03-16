

//You are given a list of n-1 integers and these
//integers are in the range of 1 to n. There are no duplicates in list. 
//One of the integers is missing in the list. Write an efficient code to find the missing integer.

class MisingNumber{

	int missingNumber(int arr[]){
		
		int n = arr.length;
		int total = (n+1)*(n+2)/2;  //total n+1 number and one number is missing 
		for(int i=0;i<n;i++){
			total -= arr[i];
		}
		return total;
	}	
	
	
	int missingNumberXOR(int arr[]){
		
		int X=arr[0],Y=1;
		int n=arr.length;
		
		for(int i=1;i<n;i++) // xor of all the elements of arr
			X^=arr[i];
		
		for(int i=2;i<=n+1;i++)  // xor of 1 to n elelemts
			Y^=i;
		
		return X^Y;
	}	
}

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,4,5,6};
		MisingNumber m = new MisingNumber();
		System.out.println(m.missingNumberXOR(a));
	}

}
