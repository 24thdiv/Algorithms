import java.util.ArrayList;

public class AllCombinationofString {


	
	// O(2^n)
	static ArrayList<String> combine(String instr, StringBuffer outstr, int index,ArrayList<String> ans)
	{
		
	    for (int i = index; i < instr.length(); i++)
	    {
	        outstr.append(instr.charAt(i));
	       //System.out.println(outstr);
	        ans.add(outstr.toString());
	        combine(instr, outstr, i + 1,ans);
	        outstr.deleteCharAt(outstr.length() - 1);
	    }
	    return ans;
	} 

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ans = new ArrayList<>();
		combine("abc", new StringBuffer(), 0,ans);
		System.out.println(ans);
		
		
	}

}
