import java.util.HashMap;
import java.util.Scanner;

// stack using two queue
public class StackImpl {

Queue q = new Queue(10);
	
	HashMap<Integer, Integer> hash = new HashMap<Integer,Integer>();
	

	void push(int data){
		
		int siz = q.noOfItems;
		
		q.insert(data);
		
		for(int i=0;i<siz;i++){
			q.insert(q.first());
			q.remove();
		}
		
		
	}
	
	int pop(){
		
		if(!q.isEmpty()){
			return q.remove();
		}
		else 
			return -1;
	}
	
	
	public static void main(String r[]){
		
		StackImpl st = new StackImpl();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println(st.pop());
		System.out.println(st.pop());
		st.push(5);
		st.push(9);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		
		
	}
	
}
