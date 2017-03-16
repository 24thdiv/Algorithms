import java.util.Stack;

public class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int x) {
        // only push the old minimum value when the current 
        // minimum value changes after pushing the new value x
        if(x <= min){          
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }

    public void pop() {
        // if pop operation could result in the changing of the current minimum value, 
        // pop twice and change the current minimum value to the last minimum value.
        
    	int t= stack.pop();
    	if(t == min)
        	min=stack.pop();
    	if(stack.isEmpty())
    		min=Integer.MAX_VALUE;
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }

    public static void main(String ar[]){
    	
    	
    	MinStack ms = new MinStack();
    	System.out.println("Hi");
    	ms.push(4);
    	ms.push(5);
    	System.out.println(ms.getMin());
    	ms.push(3);
    	ms.push(2);
    	System.out.println(ms.getMin());
    	ms.pop();
    	ms.pop();
    	System.out.println(ms.getMin());
    	
    }
    

}