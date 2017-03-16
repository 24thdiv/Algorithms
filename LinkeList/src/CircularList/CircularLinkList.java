package CircularList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Node{
	
	public Node next;
	int val;
	
	
	
	public Node(int val){
		
		this.val = val;
		next = null;
	
	}
	
}



public class CircularLinkList {

	public Node head;
	public int length;
	
	public CircularLinkList(){
		
		head = null;
		length = 0;
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
			newNode.next = newNode;
			length++;
		}
		else{
			
			Node temp = head;
			while(temp.next!=head){
				
				temp = temp.next;
			}
			
			newNode.next = head;
			temp.next = newNode;
			head = newNode;
			length++;
		}
		
	}
	
	public void insertAtEnd(Node newNode){
		
		if(head == null){
			newNode.next = newNode;
			head = newNode;
			length++;
		}else{
			
			Node temp = head;
			while(temp.next!=head){
				temp = temp.next;
				
			}
			
			temp.next = newNode;
			newNode.next = head;
			length++;
		}
		
	}
	
	
	
	
	public void insertAtPosition(Node newNode,int position){
	
		if(position<=0)System.out.println("Position must be Positive Integer");
		else if(position>length) insertAtEnd(newNode);
		else if(position == 1) insertAtFirst(newNode);
		else{
			
				Node temp = head;
				for(int i=1;i<position-1;i++){
					
					temp = temp.next;
					
				}
				
				newNode.next = temp.next;
				temp.next = newNode;
				
				length++;
				
			}
			
	}	

	
	public void removeFromBegine(){
		
		if(head == null)System.out.println("List is Empty");
		else if(head.next==head){
			head=null;
			length--;
		}
		else{
			
			Node temp = head;
			while(temp.next!=head){
				temp = temp.next;
			}
			
			temp.next = head.next;
			head = head.next;
			length--;
		}
		
	}
	
	public void removeFromEnd(){
		
		if(head == null) System.out.println("List is already Empty");
		else if(head.next==head){
			head = null;
			length--;
		}
		else{
			
			
			Node temp  = head.next;
			Node prev = head;
			while(temp.next!=head){
				
				temp = temp.next;
				prev = prev.next;
			}
			
			prev.next = temp.next;
			temp = null;
			length--;
		}
		
	}
	
	
	public void removeAtPosition(int position){
		
		if(position<=0) System.out.println("Enter positive number");
		else if(position>length) System.out.println("No Node at this position");
		else if(position==length) removeFromEnd();
		else if(position==1) removeFromBegine();
		else{
			
			Node temp = head;
			for(int i=1;i<position-1;i++){
				
				temp = temp.next;
			}
			
			temp.next = temp.next.next;
			
			length--;
		}
		
	}
	
	public void print() {
        Node tmpNode = head;
        if(head == null) System.out.println("Empty List");
        else if(tmpNode.next == head) System.out.print(head.val);
        else{
        	while (tmpNode.next != head) {
        	
            System.out.print(tmpNode.val + " <-> ");
            tmpNode = tmpNode.next;
        
        	}
        	System.out.println(tmpNode.val);
        }
        System.out.println("  null :"+"Length : "+length);
    }

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
        
        CircularLinkList list = new CircularLinkList(); 
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
                list.insertAtEnd(( new Node(scan.nextInt())));                     
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
		
	
	
	
	}

}
