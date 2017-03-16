import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

class StringOpration{
	
	// reverse string
	public String reverse(String in){
		
		int len = in.length();
		char[] ans = new char[len];
		int l=0;
		for(int i=len-1; i>=0; i--){
			ans[i] = in.charAt(l);
			l++;
		}
		return new String(ans);
	}
	
	public static String reverseUsingStack(String in){
		
		char[] st = in.toCharArray();
		
		Stack<Character> stack = new Stack<>();
		
		for(char c: st){
			stack.push(c);
		}
		
		for(int i=0;i<in.length();i++){
			st[i]=stack.pop();
			System.out.println(st[i]);
		}
		
		return new String(st);
	}
	
	public static String reverseInPlace(String input){
	    char[] in = input.toCharArray();
	    int begin=0;
	    int end=in.length-1;
	    char temp;
	    while(end>begin){
	        temp = in[begin];
	        in[begin]=in[end];
	        in[end] = temp;
	        end--;
	        begin++;
	    }
	    return new String(in);
	}

}




public class ReverseString {

	public static void main(String args[]){
			
		StringOpration sop = new StringOpration();
		
	
		System.out.println("Reversed String : "+sop.reverseUsingStack("World"));
		
	}
	
}
