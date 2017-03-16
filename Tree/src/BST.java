
class BinaryNode {

	int data;
	BinaryNode left;
	BinaryNode right;
	
	public BinaryNode(){
		left=right=null;
	}
	
	public BinaryNode(int val)
	{
		left=right=null;
		data=val;
	}
}


//in-order traverssal in BST is sorted list
public class BST {

	
	//find element in BST- recursive
	public boolean findElement(int value, BinaryNode root){
		
		if(root==null) return false;
		if(value>root.data){
			findElement(value, root.right);
		}
		else if(value<root.data){
			findElement(value, root.left);
		}
		return true;
		
	}
	
	
	//find element in BST- non-recursive
	public boolean findElementNR(BinaryNode root,int val){
		
		if(root==null) return false;
		while(root!=null){
			
			if(root.data==val){
				return true;
			}
			else if(val>root.data){
				root=root.right;
			}
			else{
				root=root.left;
			}
			
		}
		return false;
		
	}
	
	
	//find minimum element
	public BinaryNode findMinimum(BinaryNode root){
		
		if(root==null) return null;
		while(root.left!=null){
			root=root.left;
		}
		return root;
		
	}

	
	//find maximum element
	public BinaryNode findMaximum(BinaryNode root){
		
		if(root==null) return null;
		while(root.right!=null){
			root=root.right;
		}
		return root;
		
	}

	
	//insert element recursive
	
	public BinaryNode insertElement(BinaryNode root,int val){
		
		if(root==null){
			root=new BinaryNode(val);
			
		}
		else{
			
			if(val<root.data){
				root.left = insertElement(root.left, val);
			}
			else if(val>root.data){
				root.right = insertElement(root.right, val);
			}
			
		}
		return root;
	}
	
	
	
	//insert element in BST non-recursive
	public void insertElementNR(BinaryNode root,int val){
		
		BinaryNode newNode =  new BinaryNode(val);
		if(root==null){
			
			root = newNode;
			return;
		}
			
		BinaryNode current = root;
		BinaryNode parent=null;
		
		while(true){
			
			parent=current;
			if(val<current.data){

				current=current.left;
				if(current==null){
					parent.left= newNode;
					return;
				}
					
				
			}
			else{
				
				current=current.right;
				if(current==null){
					parent.right=newNode;
					return;
				}
			}
		}
		
		
	}
	
	
	
	//delete node
	public BinaryNode deleteNode(BinaryNode root, int val)
	{
		BinaryNode tmp=null;
		if(root==null) return null;
		else if(val>root.data){
			root.right = deleteNode(root.right, val);
		}
		else if(val<root.data){
			root.left = deleteNode(root.left, val);
		}
		else{
			
				//found element
				if(root.left!=null && root.right!=null){
					//replace with largest in left subtree
					tmp = findMaximum(root.left);
					root.data=tmp.data;
					root.left=deleteNode(root.left, root.data);
					
				}
				else{
					
					//on child
					tmp=root;
					if(root.left==null){
						root=root.right;
					}
					if(root.right==null){
						root=root.left;
					}
					
					
				}
			
		}
		
		return root;
	}
	
	
	
    /* Returns true if the given tree is a BST and its
      values are >= min and <= max. */// Integer.MIN   Integer.MAX
    boolean isBST(BinaryNode node, int min, int max)
    {
        /* an empty tree is BST */
        if (node == null)
            return true;
 
        /* false if this node violates the min/max constraints */
        if (node.data < min || node.data > max)
            return false;
 
        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
        // Allow only distinct values
        return (isBST(node.left, min, node.data-1) &&
                isBST(node.right, node.data+1, max));
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
