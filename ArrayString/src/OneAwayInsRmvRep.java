

class Oneaway{
	
	/*here are three types of edits that can be performed on strings: insert a character,
	remove a character, or replace a character. Given two strings,
	 write a function to check if they are one edit (or zero edits) away.
	*/
	public boolean isoneaway(String s1, String s2){
		
		if(s1.length()==s2.length())
			return oneeditaway(s1, s2);
		else if(s1.length()+1 == s2.length())
			return oneinsertaway(s1,s2);
		else if(s1.length()==s2.length()+1)
			return oneinsertaway(s2, s1);
		
		return false;
	}
	
	
	 boolean oneinsertaway(String s1, String s2) {

		int index1=0;
		int index2=0;
		
		while(index1<s1.length() && index2<s2.length()){
			
			if(s1.charAt(index1)!=s2.charAt(index2)){
				if(index1!=index2)
				{
					return false;
				}
				
				index2++;
			}
			else{
				index1++;
				index2++;		
			}
		}
		
		
		return true;
	}


	boolean oneeditaway(String s1, String s2){
		
		boolean foundone=false;
		for(int i=0;i<s1.length();i++){
			
			if(s1.charAt(i)!=s2.charAt(i)){
				
				if(foundone){
					return false;
				}
				foundone=true;				
			}
		}
	
		return true;
		
	}
	
	
	
	
	
}



public class OneAwayInsRmvRep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Oneaway one =new Oneaway();
		System.out.println(one.isoneaway("pale", "pewle"));
		
		
	}

}
