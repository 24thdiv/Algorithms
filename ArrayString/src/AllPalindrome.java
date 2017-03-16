import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AllPalindrome {

	

	//find the all possible palindrom of string 
	// if non repetative then use set
	// else (repatative)use Arraylist to store
	public static Set<String> palindromes(final String input) {

	     final Set<String> result = new HashSet<>();

	     for (int i = 0; i < input.length(); i++) {
	         // expanding even length palindromes:
	         expandPalindromes(result,input,i,i+1);
	         // expanding odd length palindromes:
	         expandPalindromes(result,input,i,i);
	     } 
	     return result;
	  }

	  public static void expandPalindromes(final Set<String> result, final String s, int i, int j) {
	      while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
	            result.add(s.substring(i,j+1));
	            i--; j++;
	      }
	  }
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "ababcc";
		Set<String> s  = palindromes(s1);
		System.out.println(s);
		System.out.println(s.size());
		
	}
	
	
}
