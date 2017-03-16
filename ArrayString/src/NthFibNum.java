
public class NthFibNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(nthfib(5));
		
		
	}

	
	public static int nthfib(int n)
	{
		if(n==0) return 0;
		if(n==1) return 1;
		
		int ans = nthfib(n-1) + nthfib(n-2);
		
		
		return ans;
		
	}

	 public static int nthfibv1(int n)
	    {
	        int a=0;
	        int b=1;

	        if(n==0) return 0;


	        for(int i = 2; i<n; i++)
	        {
	            int c = a+b;
	            a=b;
	            b=c;
	        }

	        return a+b;
	    }
	
	
}
