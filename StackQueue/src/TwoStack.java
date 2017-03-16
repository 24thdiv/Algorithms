
public class TwoStack {

	int size;
	int top1,top2;
	int arr[];
		
	public TwoStack(int n){
		
		arr = new int[n];
		size = n;
		top1 = -1;
		top2 = n;
	}
	
	public void push1(int n){
		
		if(top1<top2-1){
			top1++;
			arr[top1] = n;
		}
		else{
			System.out.println("Stack 1 is full");
		}
		
	}
	
	public void push2(int n){
		
		if(top1<top2-1){
			top2--;
			arr[top2] = n;
		}
		else{
			System.out.println("Stack 2 is full");
		}
		
	}
	
	int pop1(){
		
		if(top1>=0){
			int x = arr[top1];
			top1--;
			return x;
		}
		else{
			return 0;
		}
	}
	
	
	int pop2(){
		
		if(top2 < size){
			int x = arr[top2];
			top2--;
			return x;
		}
		else{
			return 0;
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoStack ts = new TwoStack(10);
		ts.push1(1);
		ts.push1(2);
		ts.push2(9);
		ts.push2(8);
		ts.push2(7);
		
		System.out.println("pop 1 "+ts.pop1());
		System.out.println("pop 2 "+ts.pop2());
		
	}

}
