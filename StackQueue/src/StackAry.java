

// stck implementation
import java.util.ArrayList;

public class StackAry {

	public ArrayList<Integer> stack;
	public int stacksize;
	
	public StackAry(int size){
		
		stack = new ArrayList<>(size);
		stacksize = size;
	}
	
	public boolean isEmpty(){
		return stack.isEmpty();
	}
	
	public boolean isFull(){
		return stack.size()==stacksize;
	}

	public void push(int val){
		
		if(!isFull()){
			stack.add(val);
		}
		else{
			System.out.println("Stack is Full");
		}
	}

	public void pop(){
		
		if(!isEmpty()){
			
			stack.remove(stack.size()-1);
		}
		else{
			
			System.out.println("Stack is Empty");
		}
	}
	
	
	public void print(){
		
		for(int i=stack.size()-1;i>=0;i--){
			System.out.print(stack.get(i)+" -- ");
		}
	
		System.out.println("Null");
	}
}


