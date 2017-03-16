import java.util.ArrayList;

public class AllPossiblePermutation {

	
	
	public static void permutation(String str,ArrayList<String> ans) { 
	    
		permutation("", str,ans); 
	}

	private static void permutation(String prefix, String str, ArrayList<String> ans) {
	    int n = str.length();
	    if (n == 0) ans.add(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n),ans);
	    }
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ans = new ArrayList<>();
		permutation("123",ans);
		System.out.println(ans);
		
	}
}

