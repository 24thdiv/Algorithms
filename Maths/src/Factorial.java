
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println(factorial(6));
	
	}

	

    public static int factorial(int n){


        if(n==1 || n==0) return 1;

        int ans = n*factorial(n-1);

        return ans;
    }

	
}
