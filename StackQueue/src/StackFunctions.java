import java.util.Stack;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class StackFunctions {
	
	
	
	// chekck balancing brackets like {{[]}}
	public static boolean balancingBrackets(String s){
		//String[] values = new String[3];
		Stack<Character> stack = new Stack<>();
		//String[] answer = new String[values.length];
		
		for(int i=0;i<s.length();i++){
			
			switch(s.charAt(i)){
			
			case '(':
				
				stack.push(s.charAt(i));
				break;
			
			case '{':
			
				stack.push(s.charAt(i));
				break;
				
			case '[':
			
				stack.push(s.charAt(i));
				break;
			
			case ')':
				
				if(!stack.isEmpty()){
					
					char c = stack.pop();
					if(!(c=='(')) return false;
				}
				else return false;
				
				break;
			
			case ']':
				
				if(!stack.isEmpty()){
					
					char c = stack.pop();
					if(!(c=='[')) return false;
				}
				else return false;
				break;
				
			case '}':
	
				if(!stack.isEmpty()){
		
					char c = stack.pop();
					if(!(c=='{')) return false;
				}
				else return false;
				break;
			
			default:
				
				return false;
				
			}
			
		}
		
		
		if(stack.isEmpty())
			return true;
		else
			return false;
	}
	
	
	// evaluation of postfix string
	public static void PostfixEval(String s){
		
		Stack<Integer> stack = new Stack<>();
		
		try{
		
		for(int i=0;i<s.length();i++){
			
			if(s.charAt(i)=='+'){
			
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b+a);
				
			}
			else if(s.charAt(i)=='-'){
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b-a);
				
				
			}
			else if(s.charAt(i)=='*'){
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b*a);
				
				
			}
			else if(s.charAt(i)=='/'){
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b/a);
				
				
			}
			else{
				
				
				stack.push(Character.getNumericValue(s.charAt(i)));
			}
			
		}
		
		System.out.println(stack.pop());
		}
		catch(Exception e){
			System.out.println("Please enter valid String");
		}
		
		
		
	}
	
	
	//Sort the given Stack
	
	public static Stack<Integer> sortStack(Stack<Integer> stack){
		
		Stack<Integer> newstack = new Stack<>();
		
		while(!stack.isEmpty()){
			int temp =  stack.pop();
			while(!newstack.isEmpty() && newstack.peek() > temp){
				
				int a = newstack.pop();
				stack.push(a);
			}
			newstack.push(temp);
		}
		
		
		return newstack;
	}
	
	
	// infix to suffix converion
	public static String infixTosuffix(String input){
		
		Stack<Character> stack = new Stack<>();
		StringBuffer postfix = new StringBuffer();
		char c;
		
		for(int i=0;i<input.length();i++){
			
			c=input.charAt(i);
			
			if(isOperand(c)){
				postfix.append(c);
			}
			else if(c=='('){
				stack.push(c);
			}
			else if(c==')'){
				
				while(!stack.isEmpty() && stack.peek()!='('){
				
					postfix.append(stack.pop());
				}
				if(!stack.isEmpty() && stack.peek()!='('){
					return null;
				}
				else if(!stack.isEmpty()){
					stack.pop(); // remove '(' also
				}
			}
			else if(isOperator(c)){
				
				if(!stack.isEmpty() && getPrecedence(c)<=getPrecedence(stack.peek())){
					postfix.append(stack.pop());
				}
				stack.push(c);
			}
		}
		
		while(!stack.isEmpty()){
			postfix.append(stack.pop());
		}
		
		return postfix.toString();
	}
	
	
	
	private static boolean isOperator(char c){
		
		return c=='+' || c=='-' || c=='/' || c=='*' || c=='^' || c=='(' || c==')';
	}
	
	
	private static int getPrecedence(char a){
		
		switch(a){
		
		case '+':
		case '-':
				return 1;
		case '*':
		case '/':
				return 2;
		case '^':
				return 3;
		default:
				return -1;
		
		}
		
	}
	
	private static boolean isOperand(char c){
		
		return (c>='a' && c<='z') || (c>='A' && c<='Z');
	}
	
	
	// reverse stack
	public static void reverseStack(Stack<Integer> stack){
		
		if(stack.isEmpty()) return;
		int temp = stack.pop();
		reverseStack(stack);
		insertAtBottom(stack, temp);
		
	}
	
	private static void insertAtBottom(Stack<Integer> stack, int temp){
		
		if(stack.isEmpty()){
			stack.push(temp);
		}
		
		int t= stack.pop();
		insertAtBottom(stack, temp);
		stack.push(t);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(balancingBrackets("{[}]}"));
		//PostfixEval("123*+5-");
		System.out.println(infixTosuffix("A*B-(C+D)+E"));
		
		
	}

}
