
import java.util.Stack;

public class QueueFunctions {

	public void printQueue(Queue qu)
	{	
		int noOfItems = qu.noOfItems;
		int front = qu.front;
		int size = qu.size;
		int[] queue = qu.queue;
		for(int i=0;i<noOfItems;i++){
		
		if((i+front)<size){
		
			System.out.print(queue[i+front]+" <--");
		}
		else{
			int num = queue[size - (i+front)];
			System.out.print(num+" <--");
		}
		}
		System.out.println("Null");
	
	}
	
	public void ReverseQueue(Queue qu){
		
		Stack<Integer> st = new Stack<>();
		while(!qu.isEmpty()){
			st.push(qu.remove());
		}
		while(!st.isEmpty()){
			int item = st.pop();
			qu.insert(item);
		}
		
		printQueue(qu);
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueFunctions qf = new QueueFunctions();
		Queue q = new Queue(10);
		q.insert(1);
		q.insert(2);
		q.insert(3);
		q.insert(4);
		q.insert(5);
		qf.ReverseQueue(q);
		
	}

}
