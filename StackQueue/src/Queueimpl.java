import java.util.Stack;



// queue using two stack
class QueueofStack {

	Stack<Integer> newstack = new Stack<>();
	Stack<Integer> oldstack = new Stack<>();
	
	public int size(){
		return oldstack.size()+newstack.size();
	}
	
	public void insert(int data){
		
		newstack.push(data);
	}
	
	public int remove(){
		
		shiftStack();
		return oldstack.pop();
	}

	private void shiftStack() {
		
		if(oldstack.isEmpty())
		{
			while(!newstack.isEmpty()){
				oldstack.push(newstack.pop());
			}
		}
	}
	
}



class Queueimpl{

	public static void main(String args[]){
		
		QueueofStack queue = new QueueofStack();
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		queue.insert(4);
		queue.insert(5);
		queue.remove();
		queue.remove();
	}
	
}

