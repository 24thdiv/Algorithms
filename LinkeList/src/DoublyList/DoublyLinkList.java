package DoublyList;

import java.util.Scanner;

class Node{
	
	public int val;
	public Node next;
	public Node prev;
	
	public Node(int val){
		this.val = val;
		next = null;
		prev = null;
		
	}
	
}


public class DoublyLinkList {

	public Node head;
	public Node tail;
	public int length;
	
	public DoublyLinkList(){
		
		head = null;
		tail = null;
		length = 0;
	}
	
	public DoublyLinkList(int val){
		
		head = new Node(val);
		tail = head;
		length = 1;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public int size(){
		return length;
	}
	
	public void insertAtFirst(Node newNode){
		
		if(head == null){
			head = newNode;
			tail = head;
			length++;
		}
		else{
			
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			length++;
		}
		
	}
	
	public void insertAtLast(Node newNode){
		
		if(head == null){
			head = newNode;
			tail = head;
			length++;
		}
		else{
			
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			length++;
			
		}
	}
	
	public void insertAtPosition(Node newNode, int position){
		
		if(position<=0)System.out.println("Enter positive number");
		else if(position>length) insertAtLast(newNode);
		else if(position==1) insertAtFirst(newNode);
		else{
			
			Node temp = head;
			for(int i=1;i<position-1;i++){
				
				temp = temp.next;
			}
			
			temp.next.prev = newNode;
			newNode.next = temp.next;
			temp.next = newNode;
			newNode.prev = temp;
			
			length++;
		}
		
	}
	
	
	public void removeFromBegine(){
		
		if(head==null) System.out.println("List is already empty");
		else if(head.next==null){
			head = null;
			tail = null;
			length--;
		}
		else{
			
			Node temp =head;
			temp.next.prev = null;
			head = temp.next;
			temp.next = null;
			length--;
			
		}
		
	}
	
	
	public void removeFromEnd(){
		
		if(head==null)System.out.println("List is already Empty");
		else if(head.next==null){
			
			head = null;
			tail = null;
			length--;
		}
		else{
			
			tail.prev.next = null;
			tail.prev = null;
			length--;
			
		}
		
	}
	
	public void removeAtPosition(int position)
	{
		if(position<=0)System.out.println("Position must be positive");
		else if(position==1) removeFromBegine();
		else if(position==length) removeFromEnd();
		else if(position>length)System.out.println("No Node at this posiotn");
		else{
			
			Node temp =head;
			for(int i=1;i<position-1;i++){
				
				temp = temp.next;
			}
			
			temp.next.next.prev = temp;
			temp.next = temp.next.next;
			length--;
		}
		
		
	}
	
	public void print() {
        Node tmpNode = head;
        while (tmpNode != null) {
            System.out.print(tmpNode.val + " <-> ");
            tmpNode = tmpNode.next;
        }
        System.out.println("null :"+"Length : "+length);
    }

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
        
        DoublyLinkList list = new DoublyLinkList(); 
        System.out.println("Doubly Linked List Test\n");          
        
        char ch;
		
		do
        {
            System.out.println("\nDoubly Linked List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. insert at position");
            System.out.println("4. delete at position");
            System.out.println("5. check empty");
            System.out.println("6. get size");
            System.out.println("7. delete at First");
            System.out.println("8. delete at Last");
            
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                list.insertAtFirst(( new Node(scan.nextInt())));                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to insert");
                list.insertAtLast(( new Node(scan.nextInt())));                     
                break;                         
            case 3 : 
                System.out.println("Enter integer element to insert");
                int num = scan.nextInt() ;
                System.out.println("Enter position");
                int pos = scan.nextInt() ;
                list.insertAtPosition(new Node(num), pos);
                break;                                          
            case 4 : 
                System.out.println("Enter position");
                int p = scan.nextInt() ;
                list.removeAtPosition(p);
                break;     
            case 5 : 
                System.out.println("Empty status = "+ list.isEmpty());
                break;            
            case 6 : 
                System.out.println("Size = "+ list.size() +" \n");
                break;
            case 7 :
            	list.removeFromBegine();
            	break;
            case 8:
            	list.removeFromEnd();
            	break;
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }    
            /*  Display List  */ 
            list.print();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);    
 
        } while (ch == 'Y'|| ch == 'y');
		
		
		/*DoublyLinkList list = new DoublyLinkList();
		list.insertAtFirst(new Node(1));
		list.insertAtFirst(new Node(0));
		list.inserAtLast(new Node(2));
		list.insertAtPosition(new Node(11), 2);
		list.insertAtPosition(new Node(12), 4);
		list.print();
		list.removeAtPosition(3);
		list.removeAtPosition(1);
		list.print();*/
	
	}

}
