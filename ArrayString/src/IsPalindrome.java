

class CheckPalindrom{
	
	public boolean ispalindrom(String s){
		
		for(int i=0;i<s.length()/2;i++){
			
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
				return false;
			
		}
		
		
		return true;
	}
	
	
}



public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	CheckPalindrom ck = new CheckPalindrom();
	System.out.println(ck.ispalindrom("hello"));
	
	
	}

}
