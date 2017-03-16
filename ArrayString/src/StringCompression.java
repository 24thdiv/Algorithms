

class Compress{
	
	/*String Compression: Implement a method to perform basic string compression using the counts
	of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
	"compressed" string would not become smaller than the original string, your method 
	should return the original string.You can assume the string has only
	uppercase and lowercase letters (a - z)
	*/
	
	String compressString(String s){
		
		StringBuilder ans = new StringBuilder();
		int cons=0;
		
		for(int i=0;i<s.length();i++){
			
			cons++;
			if((i+1>=s.length())||(s.charAt(i)!=s.charAt(i+1))){
				ans.append(s.charAt(i));
				ans.append(cons);
				cons=0;
			}
		}
		
		if(ans.length()<s.length()){
			return ans.toString();
		}
		else{
			return s;
		}
		
	}
	
	
	
}





public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compress com = new Compress();
		System.out.println(com.compressString("abbc"));
		
	}

}
