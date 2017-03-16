import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hwllo {
    
    
    public static String reverse(String input){
        
         StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb = sb.reverse();
        String ans = sb.toString();
        
        ans= ans.replace('(', '@');
        ans=  ans.replace(')', '$');
        ans= ans.replace('@', ')');
        ans=ans.replace('$', '(');
        return ans;
        
        
    }
    
   public static String simplyfy(String input){
        
        
        StringBuffer ans=new StringBuffer();
        Stack<Character> st = new Stack<>();
        int num=0;
        for(int i=0;i<input.length();i++){
            
            if(input.charAt(i)!='(')
            {
                if(input.charAt(i)==')' && num==1)
                {
                    st.pop();
                    num--;
                    
                }
                else if(input.charAt(i)==')' && num>1)
                {
                   ans.append(")");
                    num--;
                    
                }
                if(input.charAt(i)!=')'){
                    System.out.println(input.charAt(i));
                	char temp = input.charAt(i);
                    ans.append(temp+"");    
                }
            }
            else{
                
                if(num==1){
                    num++;
                    ans.append("(");    
                }
                else{
                  num++;
                  st.push(input.charAt(i));
                }
            }
            
        }
		return ans.toString();
        
        
    }
    
    
    
    
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    
    
        Scanner in = new Scanner(System.in);
        
        while(in.hasNext()){
            
            String input = in.nextLine();
            input=input.replace(" ","");
            String arr[] = input.split("/");
            
            
            if(arr.length==2)
            {
                
                int temp = 0;
		        while(true)
		        {	
			
			      arr[1]=arr[1].replaceAll("([S])(\\1{1,})", "$1");
			      arr[1]=arr[1].replaceAll("([R])(\\1{1})", "");
			
			      if(arr[1].length()==temp)
				    break;
			      temp=arr[1].length();
			     }
		  
                for(int i=0;i<arr[1].length();i++){
                    
                    if(arr[1].charAt(i)=='R')
                    {
                        arr[0]=reverse(arr[0]);
                    }
                    else if(arr[1].charAt(i)=='S')
                    {
                        arr[0]=simplyfy(arr[0]);   
                    }
                    
                }
                System.out.println(arr[0]);
                
            
          }
          else
          {
                
                System.out.println(arr[0]);
          }
           
            
            
            
        }
    
    
    
    }
}