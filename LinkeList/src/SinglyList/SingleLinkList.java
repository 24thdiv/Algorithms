package SinglyList;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;


class Node{
	
	public int val;
	Node next;
	
	public Node(int val){
		
		this.val=val;
		next = null;
	}
	
	public Node(){
		next=null;
	}

}


public class SingleLinkList {

	Node head;
	int length;
	
	public SingleLinkList(int val){
		
		head = new Node(val);
		length = 1;
	}

	public SingleLinkList(){
		head = null;
		length = 0;
	}
	
	public boolean isEmpty(){
		return head==null;
	}
	
	public int size(){
		return length;
	}
	
	public void insertAtEnd(Node newNode){
		
		if(head==null){
			head = newNode;
			length++;
		}
		else{
			Node tempNode = head;
			while(tempNode.next!=null){
			
				tempNode = tempNode.next;
		
			}
		
			tempNode.next = newNode;
			length++;
	
		}
	}
	
	public void insertAtFirst(Node newNode){
		
		if(head==null){
			head = newNode;
			length++;
		}
		else{
			newNode.next = head;
			head = newNode;
			length++;
		
		}
	}
	
	public void insertAtPosition(Node newNode, int position){
		
		if(position<=0)System.out.println("Position must be Positive Integer");
		else if(position>length) insertAtEnd(newNode);
		else if(position == 1) insertAtFirst(newNode);
		else{
			
			// counter from 1 
			// if counter from 0 then i=0;
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
			
		if(head == null)System.out.println("List is already Empty");
		else if(head.next==null){
			head = null;
			length--;
		}
		else{
			Node temp = head;
			head = temp.next;
			temp.next = null;
			length--;
		}
		
	}
	
	public void removeFromEnd(){
		
		if(head!=null){
			if(head.next==null) head = null;
			else{
				Node last = head.next;
				Node temp = head;
			
				while(last.next!=null){
					last = last.next;
					temp = temp.next;
				}
			
				temp.next=null;
				last=null;
			}
		length--;
		}else System.out.println("List is already Empty");
		
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
        while (tmpNode != null) {
            System.out.print(tmpNode.val + " -> ");
            tmpNode = tmpNode.next;
        }
        System.out.println("null :"+"Length : "+length);
    }

	public void print(Node headNode) {
        Node tmpNode = headNode;
        while (tmpNode != null) {
            System.out.print(tmpNode.val + " -> ");
            tmpNode = tmpNode.next;
        }
        //System.out.println("null :"+"Length : "+length);
    }
	
	
	//nth node from the last  //count start with 1
	
	public void nthFromLast(Node head, int k){
	
		
		if(k>length) System.out.println("Number should be less than lenght");
		else if(head == null) System.out.println("List is empty");
		else{
			
			Node p1 = head;
			Node p2 = head;
			
			//i=0 if count start with 0
			for(int i=1; i<k; i++)
				p1 = p1.next;
			
			while(p1.next!=null){
				p1=p1.next;
				p2=p2.next;
			}
			
			System.out.println(k+"th from last is :"+p2.val);
			
		}
		
		
	
	}
	
	
	//remove duplicates in list
	void removedupli(Node head){
		
		HashSet<Integer> set = new HashSet<>();
		Node prev = null;
		Node tmp =head;
		while(tmp!=null){
			
			if(set.contains(tmp.val)){
				
				prev.next = tmp.next;
				
			}
			else{
				
				set.add(tmp.val);
				prev = tmp;
			}
			tmp=tmp.next;
			
		}
	}
	
	
	
	
	
	// remove duplicat in sorted list
	Node RemoveDuplicates(Node head) {
		 
		  /*Another reference to head*/
        Node current = head;
 
        /* Pointer to store the next pointer of a node to be deleted*/
        Node next_next;
 
        /* do nothing if the list is empty */
        if (head == null)    
            return null;
 
        /* Traverse list till the last node */
        while (current.next != null) {
 
            /*Compare current node with the next node */
            if (current.val == current.next.val) {
                next_next = current.next.next;
                current.next = null;
                current.next = next_next;
            }
            else // advance if no deletion
               current = current.next;
        	}
        return head;
	}

	//delete given node
	// you are not given access to the head of the linked list. You only have access to that node.
	//The solution is simply to copy the data from the next node over to the current node, and then to delete the
	//next node.
	boolean deleteNode(Node n){
		
		if(n==null || n.next==null) return false;
		
		Node next = n.next;
		n.val = next.val;
		n.next = next.next;
		return true;
		
	}
	
	
	
	// check list is palindrom or not
	public boolean checkpalindrom(Node headNode){
		
		if(headNode==null) return true;
		else if(head.next==null) return true;
		
		Node slow = headNode;
		Node fast = headNode;
		Stack<Integer> stk = new Stack<>();
		
		while(fast!=null && fast.next!=null){
			
				stk.push(slow.val);
				slow = slow.next;
				fast = fast.next.next;
		}
		
		//for odd need to move one pointer ahed
		if(fast!=null)
			slow = slow.next;
		
		while(slow!=null){
			
			int data = stk.pop().intValue();
			if(data!=slow.val)
				return false;
			slow = slow.next;
		}
		
		return true;
	}
	
	
	
	// Revers list and return head
	// extra place
	public Node Reverse(Node head) {

	    Node RHead = null;
	    
	    if(head==null) return null;
	    while(head!=null){
	        
	        Node newNode = new Node();
	        newNode.val = head.val;
	        newNode.next = RHead;
	        RHead = newNode;
	        head = head.next;
	    }
	    
	    return RHead;
	}
	
	
	//inplace reverse
	 Node reverseInPlace(Node head) {
	        Node prev = null;
	        Node current = head;
	        Node next = null;
	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        head = prev;
	        return head;
	    }
	
	
	//comapare two list  //0=not equal  1=equal
	public int CompareLists(Node headA, Node headB) {
	    // This is a "method-only" submission. 
	    // You only need to complete this method 
	  
	    if(headA == null && headB == null) return 1;
	    else if((headA ==null && headB !=null) || (headA !=null && headB==null)) return 0;
	    else{
	        
	            while(headA!=null && headB!=null){
	                
	                if(headA.val != headB.val) return 0;
	                else{
	                    headA = headA.next;
	                    headB = headB.next;       
	                }
	            }
	
	            
	          if(headA==null && headB==null)
	            return 1;
	          else
	        	  return 0;
	    }
	}
	
	
	
	
	
	//print reverse link list
	void ReversePrint(Node head) {
		  // This is a "method-only" submission. 
		  // You only need to complete this method. 

		    if(head == null) return;
		 
		        ReversePrint(head.next);
		        System.out.println(head.val);
		    
		    
		    
		    
		}

	
	// stack using list
	public void push(int data) {
	    insertAtFirst(new Node(data));
	}

	public void pop() {
	    if(!isEmpty()){
	    removeFromBegine();
	    }
	}
	
	
	
	
	
	//merge two sorted linklist adn result is sorted merged list's head
	public Node MergeLists(Node headA, Node headB) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method 

	    Node head = null;
	    Node tmp = null;
	    
	    
	    if(headA==null) return headB;
	    if(headB == null) return headA;
	    
	    if(headA.val<headB.val){
	        
	        head = headA;
	        headA = headA.next;
	        
	    }
	    else{
	        
	        head = headB;
	        headB = headB.next;
	        
	    }
	    
	    tmp = head;
	    
	    while(headA!=null && headB !=null){
	        
	        if(headA.val<headB.val){
	            
	            head.next = headA;
	            headA = headA.next; 
	            head = head.next;
	           
	        }
	        else{
	            
	           head.next = headB;
	           headB = headB.next;
	            head = head.next;
	            
	        }
	        
	        
	    }
	    
	    if(headA!=null){
	        head.next = headA;
	    }
	    if(headB!=null){
	        head.next=headB;
	    }

	    return tmp;

	}

	
	
//Detect cycle or not in list
	boolean hasCycle(Node head) {

    
		if(head == null) return false;
		Node slow = head;
		Node fast = head;
		boolean check = false;
  
		while(fast!=null && fast.next!=null){
      
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				check = true;
				break;
			} 
		}
		
		if(fast==null || fast.next==null) return false;
		
		slow=head;
		while(slow!=fast){
			slow=slow.next;
			fast=fast.next;
		}
    
		// return fast or slow that is start of the loop
		
    return check;
    
	}
	
	// check two list intersect ot not
	public boolean checkintersection(Node headA, Node headB){
		
		if(headA==null && headB==null ) return false;
		
		HashSet<Node> nodes = new HashSet<>();
		
		while(headA!=null){
			nodes.add(headA);
			headA = headA.next;
		}
		
		while(headB!=null){
			
			if(nodes.contains(headB)){
				System.out.println(headB.val);
				return true;
			}
			headB=headB.next;
		}
		
		return false;
	}
	
	
	
	
	// assume two list are intersecting and find ther merged node value
	public int findmergedNode(Node headA, Node headB){
		
		Set<Integer> nodes = new HashSet<Integer>();
		
		while(headA!=null){
			nodes.add(headA.val);
			headA=headA.next;
		}
		while(nodes.add(headB.val)!=false){
			headB=headB.next;
		}
		return headB.val;
	}
	
	
	public Node UnionOfList(Node head1, Node head2){
		
		Node result=null;
		HashSet<Integer> hash = new HashSet<>();
		
		while(head1 != null){
			
			if(!hash.contains(head1.val)){
				hash.add(head1.val);		
				// insert at first
				Node newNode = new Node(head1.val);
				newNode.next = result;
				result = newNode;
			}
			
			head1 = head1.next;	
		}
		
		while(head2 !=null){
		
			if(!hash.contains(head2.val)){
				hash.add(head2.val);
				
				// insert at first
				Node newNode = new Node(head2.val);
				newNode.next = result;
				result = newNode;
			}
			
			head2 = head2.next;
		}
		
		return result;
	}
	
	

	public Node IntersectionOfList(Node head1, Node head2){
		
		Node result=null;
		
		while(head1 != null){
			
			if(isPresent(head2,head1.val)){
				
				// insert at first
				Node newNode = new Node(head1.val);
				newNode.next = result;
				result = newNode;				
			}
			
			head1 = head1.next;
		}
	
		return result;
	}
	
	boolean isPresent(Node head, int val){
		
		while(head!=null){
			
			if(head.val == val){
				
				return true;
			}
			
			head = head.next;
		}
		
		return false;
		
	}
	
	
	public Node sumOfTwoList(Node head1, Node head2){
		
		Node tmp = null;
		Node result = null;
		Node prev = null;
		int carry=0;
		int sum;	
		
		while(head1!=null || head2!=null){
			
			sum = carry + (head1 != null ? head1.val : 0)+ (head2 != null ? head2.val : 0);
			
			carry = sum/10;
			sum =  sum % 10;
			tmp = new Node(sum);
			
			if(result==null){
			
				result = tmp;
				prev = tmp;
			}
			else{
				
				prev.next = tmp;
				prev = tmp;
			}
			
			if(head1!=null){
				head1 = head1.next;
			}
			if(head2!=null){
				head2 = head2.next;
			}
			
		}
		
		
		if(carry>0){
		
			prev.next = new Node(carry);
		}
		
		return result;
	}
	
	
	
	public static void main(String args[])
	{
		
/*		Scanner scan = new Scanner(System.in);
        
        SingleLinkList list = new SingleLinkList(); 
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
              Display List   
            list.print();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);    
 
        } while (ch == 'Y'|| ch == 'y');
	*/	
		
		
		SingleLinkList list = new SingleLinkList();
		list.insertAtEnd(new Node(7));
		list.insertAtEnd(new Node(5));
		list.insertAtEnd(new Node(9));
		list.insertAtEnd(new Node(4));
		list.insertAtEnd(new Node(6));
	//	list.insertAtEnd(new Node(6));
	//	list.insertAtEnd(new Node(7));
	
		
		SingleLinkList list1 = new SingleLinkList();
		list1.insertAtEnd(new Node(8));
		list1.insertAtEnd(new Node(4));
	//	list1.insertAtEnd(new Node(2));
	//	list1.insertAtEnd(new Node(7));
	
		
		Node result = list1.sumOfTwoList(list.head, list1.head);
		list.print(result);
		
//		Node head = list1.head;
	//	Node head1 = list.head;
//		while(head.next!=null){
			
			//head=head.next;
		//	head1 = head1.next;
	//	}
		
		//head.next = head1;
		
		//System.out.println(list.checkintersection(list.head, list1.head));

		
		
		
		
		//System.out.println(list.checkpalindrom(list.head));
		
		
		//SingleLinkList list2 = new SingleLinkList();
		//System.out.println(list.checkpalindrom(list2.head));
		
		
		//Node headnode = list.RemoveDuplicates(list.head);
		//list.print(headnode);
		
		
		
		
		/*SingleLinkList list2 = new SingleLinkList();
		list2.insertAtEnd(new Node(2));
		list2.insertAtEnd(new Node(4));
		list2.insertAtEnd(new Node(6));
		list2.insertAtEnd(new Node(8));
		list2.insertAtEnd(new Node(10));
		list2.print();
		
		
		Node headNode = list.MergeLists(list.head, list2.head);
		list.print(headNode);
		*/
		//SingleLinkList l = new SingleLinkList();
		
		//int com = list.CompareLists(list.head, list2.head);
		
		//System.out.println(com);
		
		//list.nthFromLast(list.head, 2);
		
	}
	
	
}
