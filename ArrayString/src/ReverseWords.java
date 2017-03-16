
public class ReverseWords {

	
	public static String reverseword(String s){
	
		String input[] = s.trim().split(" ");
		int n= input.length;
		StringBuilder sb = new StringBuilder();
		
		for(int i=n-1; i>=0;i--){
			sb.append(input[i]).append(" ");
			
		}
		
		return sb.toString().trim();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String in = "hello how are you?";
		System.out.println(ReverseWords.reverseword(in));

	}

}

