
public class Prime {

	
	public static boolean isPrime(int n){
		
		if(n<2) return false;
		int root = (int)Math.sqrt(n);
		for(int i=2;i<=root;i++){
			if(n%i==0)
				return false;
		}
		
		
		return true;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(isPrime(5));
		
	}

}
