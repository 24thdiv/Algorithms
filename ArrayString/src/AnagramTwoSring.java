import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class StringOp{

	

	//check two stringas are permutation of others or not   divya == idayv
	public boolean checkPermutation(String a,String b){
		
		if(a.length()!=b.length()) return false;
		else{
			
			char[] achar = a.toCharArray();
			char[] bchar = b.toCharArray();
			
			Arrays.sort(achar);
			Arrays.sort(bchar);
			
			if(new String(achar).equals(new String(bchar)))
				return true;
			else
				return false;
		}
		
	}
	
	//number of deletes require to make anagrams 
	 public static int numberNeeded(String first, String second) {
	     
	        Map<Character, Integer> count = new HashMap<>();
	        for( char ch: first.toCharArray() ) {
	            int ct = count.containsKey(ch) ? count.get(ch) : 0;
	            count.put(ch, (ct + 1));
	        }
	        
	        for( char ch: second.toCharArray() ) {
	            int ct = count.containsKey(ch) ? count.get(ch) : 0;
	            count.put(ch, (ct - 1));
	        }
	        
	        ArrayList<Integer> values = new ArrayList<>( count.values() );
	        int total = 0;
	        for( Integer v: values ) {
	            total += Math.abs(v);
	        }
	        return total;
	        
	    }
	  
	
	
}




public class AnagramTwoSring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringOp sop = new StringOp();
		System.out.println("Check Permutations : "+sop.checkPermutation("divya", "iaayd"));
		System.out.println("Number of deleter require is "+sop.numberNeeded("abc", "cde"));
	
	}

}
