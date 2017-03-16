import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class BinaryTreeNode {

	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	public BinaryTreeNode(){
		left=right=null;
	}
	
	public BinaryTreeNode(int val)
	{
		left=right=null;
		data=val;
	}
}



public class BinaryTree{
	
	// preorder recursive time and space complexity O(n)
	// Depth first traversal
	
	BinaryTreeNode root;
	
	public BinaryTree() {
		// TODO Auto-generated constructor stub
	
		root = null;
	}
	
	BinaryTree(int val){
		root = new BinaryTreeNode(val);
	}
	
	
	public void PreOrder(BinaryTreeNode root){
		
		if(root!=null){
			System.out.println(root.data);
			PreOrder(root.left);
			PreOrder(root.right);
		}
	}
	
	//inorser recursive time and space complexity O(n)
	// Depth first traversal
	public void InOrder(BinaryTreeNode root){
		
		if(root!=null){
			InOrder(root.left);
			System.out.println(root.data);
			InOrder(root.right);
		}
	}

	//postorder recursive time and space complexity O(n)
	// Depth first traversal
	public void PostOrder(BinaryTreeNode root){
	
		if(root!=null){
			PostOrder(root.left);
			PostOrder(root.right);
			System.out.println(root.data);
		}
	}
	
	
	// preorder non-recursive time and space complexity O(n)
	// Depth first traversal
	public ArrayList<Integer> preOrderNR(BinaryTreeNode root){
		
		if(root==null){
			return null;
		}
		ArrayList<Integer> res = new ArrayList<>();
		Stack<BinaryTreeNode> stack = new Stack<>();
		
		stack.push(root);
		while(!stack.isEmpty()){
			
			BinaryTreeNode tmp = stack.pop();
			res.add(tmp.data);
			
			if(tmp.right!=null)
				stack.push(tmp.right);
			if(tmp.left!=null)
				stack.push(tmp.left);
		}
		
		
		
	return res;
	}
	
	// inorser traversal non-recursion time and space complexity O(n)
	// Depth first traversal
	public ArrayList<Integer> inOrderNR(BinaryTreeNode root){
		
		if(root==null){
			return null;
		}
		ArrayList<Integer> res = new ArrayList<>();
		Stack<BinaryTreeNode> stack = new Stack<>();
		boolean done = false;
		BinaryTreeNode curr = root;
		
		while(!done){
		
			if(curr!=null){
				stack.push(curr);
				curr=curr.left;
			}
			else{
				
				if(stack.isEmpty()){
					done=true;
				}
				else{
					
					curr = stack.pop();
					res.add(curr.data);
					curr = curr.right;
				}
			}		
		}	
	return res;
	}
	
	
	// depth first traversal
	public void DepthFirstTraversal(BinaryTreeNode root) {
		
		if(root==null)
			return;
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		s.add(root);
		while (s.isEmpty() == false) {
			BinaryTreeNode x = s.pop();
			if(x.right!=null) s.add(x.right);
			if(x.left!=null) s.add(x.left);			
			System.out.print(" " + x.data);
		}
	}
	
	
	// Depth First serach recursive
	public boolean DFS(BinaryTreeNode root, int val){
		
		if(root==null)
			return false;
		else if(root.data==val)
			return true;
		else
			return DFS(root.left,val) || DFS(root.right, val);
	
	}
	
	//DepthFirstSearch non-recursive
	public boolean DFSNR(BinaryTreeNode root,int val){
		
		if(root==null)
			return false;
		
		Stack<BinaryTreeNode> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()){
			
			BinaryTreeNode tmp = stack.pop();
			if(tmp.data==val){
				return true;
			}
			if(tmp.right!=null){
				stack.push(tmp.right);
			}
			if(tmp.left!=null){
				stack.push(tmp.left);
			}
			
		}
		
		return false;
		
	}
	

		
	// breath first traversal, level order traversal
	public void BreathFirstTraversal(BinaryTreeNode root){
		
		if(root==null)
			return;
		
		Queue<BinaryTreeNode> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()){
			
			BinaryTreeNode tmp = queue.poll();
			System.out.println(tmp.data);
			if(tmp.left!=null){
				queue.add(tmp.left);
			}
			if(tmp.right!=null){
				queue.add(tmp.right);
			}	
		}
	}
	
	
	// BFS breath first search
	public void BFS(BinaryTreeNode root){
		
		if(root==null)
			return;
		Queue<BinaryTreeNode> queue = new LinkedList<>();
		queue.add(root);
		
		
		while(!queue.isEmpty()){
			
			BinaryTreeNode tmp = queue.poll();
			System.out.println(tmp.data);
			if(tmp.left!=null){
				queue.add(tmp.left);
			}
			if(tmp.right!=null){
				queue.add(tmp.right);
			}	
		}
	}
	
	//find the maximum elememt from tree
	public int findMaximumElement(BinaryTreeNode root){
		
		int max= Integer.MIN_VALUE;
		if(root==null)
			return max;
		
		Queue<BinaryTreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			
			BinaryTreeNode tmp = queue.poll();
			if(tmp.data>max){
				max=tmp.data;
			}
			if(tmp.left!=null){
				queue.add(tmp.left);
			}
			if(tmp.right!=null){
				queue.add(tmp.right);
			}
		}
		return max;
	}
	
	// insert node 
	public BinaryTreeNode insertNode(BinaryTreeNode root,int val){
		
		
		if(root==null)
		{
			root = new BinaryTreeNode(val);
			return root;
		}
		
		Queue<BinaryTreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			
			BinaryTreeNode tmp = queue.poll();
			
			if(tmp.left!=null){
				queue.add(tmp.left);
			}
			else{
				tmp.left = new BinaryTreeNode(val);
				return root;
			}
			if(tmp.right!=null){
				queue.add(tmp.right);
			}
			else{
				tmp.left = new BinaryTreeNode(val);
				return root;
			}
		}
		return root;
	}
	
	
	
	//find size of tree
	public int size(BinaryTreeNode root){
		
		int count=0;
		if(root==null)
			return 0;
		Queue<BinaryTreeNode> qu =new LinkedList<>();
		qu.add(root);
		while(!qu.isEmpty()){
		
			BinaryTreeNode tmp = qu.poll();
			count++;
			if(tmp.left!=null){
				qu.add(tmp.left);
			}
			if(tmp.right!=null){
				qu.add(tmp.right);
			}
			
		}
		
	return count;
	}
	
	// height of binary tree counting nodes
	public int maxHeightOfTree(BinaryTreeNode root){
		
		if(root==null)
			return 0;
		
		int leftdepth = maxHeightOfTree(root.left);
		int rightdepth = maxHeightOfTree(root.right);
		
		if(leftdepth>rightdepth)
			return leftdepth+1;
		else
			return rightdepth+1;
		
		
	}
	
	//height of binary tree with counting edges
	static int h=-1;
	public int height(BinaryTreeNode root){
		
		if(root==null)
			return 0;
		else{
			
			if(root.left!=null || root.right!=null){
				h++;
				height(root.left);
				height(root.right);
			}
		}
		return h;
	}
	
	
	//deepest node of the tree
	public BinaryTreeNode deepestNode(BinaryTree tree){
		
		if(root==null)
			return null;
		Queue<BinaryTreeNode> qu = new LinkedList<>();
		BinaryTreeNode tmp =  null;
		qu.add(root);
		while(!qu.isEmpty()){
			
			 tmp = qu.poll();
			if(tmp.left!=null)
				qu.add(tmp.left);
			if(tmp.right!=null)
				qu.add(tmp.right);
			
		}
		return tmp;
	}
	
	
	//number of leaf nodes
	public int leafNodesCounts(BinaryTreeNode root){
		
		int count=0;

		if(root==null)
			return 0;
		
		Queue<BinaryTreeNode> qu = new LinkedList<>();
		qu.add(root);
		while(!qu.isEmpty()){
			
			BinaryTreeNode tmp = qu.poll();
			if(tmp.left==null && tmp.right==null)
				count++;
			if(tmp.left!=null)
				qu.add(tmp.left);
			if(tmp.right!=null)
				qu.add(tmp.right);
			
		}
		return count;
	}
	

	//number of Internal nodes, non-leaf nodes without counting root
	public int internalNodesCounts(BinaryTreeNode root){
		
		int count=0;

		if(root==null)
			return 0;
		
		Queue<BinaryTreeNode> qu = new LinkedList<>();
		qu.add(root);
		while(!qu.isEmpty()){
			
			BinaryTreeNode tmp = qu.poll();
			if(tmp.left!=null && tmp.right!=null)
				count++;
			if(tmp.left!=null)
				qu.add(tmp.left);
			if(tmp.right!=null)
				qu.add(tmp.right);
			
		}
		return count;
	}
	
	
	
	//find the maximun width of tree
	public int findMaxWidthofTree(BinaryTreeNode root){
		
		int max=0;
		if(root==null) return 0;
		Queue<BinaryTreeNode> qu = new LinkedList<>();
		
		qu.add(root);
		int levelNodes=0;
		
		while(!qu.isEmpty()){
			
			levelNodes= qu.size();
			if(levelNodes>max){
				max=levelNodes;
			}
			while(levelNodes>0){
				
				BinaryTreeNode tmp =qu.poll();
				if(tmp.left!=null)
					qu.add(tmp.left);
				if(tmp.right!=null)
					qu.add(tmp.right);
				levelNodes--;
				
			}
			
			
		}
		
		
		return max;
	}
	
	
	//make mirror tree of given binary tree
	public BinaryTreeNode mirrorConstruct(BinaryTreeNode root){
		BinaryTreeNode tmp=null;
		
		if(root!=null){
			
			mirrorConstruct(root.left);
			mirrorConstruct(root.right);
			//swap pointer
			tmp = root.left;
			root.left=root.right;
			root.right=tmp;
			
		}
		
		return root;
	}
	
	
	//check mirror or not
	public boolean isMirrorTree(BinaryTreeNode root1, BinaryTreeNode root2){
		
		if(root1==null && root2==null)
			return true;
		if(root1==null || root2==null )
			return false;
		if(root1.data!=root2.data)
			return false;
		
		return isMirrorTree(root1.left, root2.right) && isMirrorTree(root1.right, root2.left);
		
	}
	
	
	//Given a root of a tree, and an integer k. Print all the nodes which are at k distance from root. 
	public void printAtKdistanceNodes(BinaryTreeNode root, int k){
		
		if(root==null) return;
		if(k==0){
			System.out.println(root.data+" ");
		}
		else{
			printAtKdistanceNodes(root.left, k-1);
			printAtKdistanceNodes(root.right, k-1);
		}
		
	}
	
	
	
	//Given two binary trees, check if the first tree is subtree of the second one.
	//This function returns true if S is a subtree of T, otherwise false 
	public boolean isSubtree(BinaryTreeNode T, BinaryTreeNode S){
		
		if(S==null)return true;
		if(T==null) return false;
		
		if(areSame(T,S)){
			return true;
		}
		
		return isSubtree(T.left, S)||isSubtree(T.right, S);
		
	}
	
	
	// two tree are same or not
	private boolean areSame(BinaryTreeNode t, BinaryTreeNode s) {
	
		if(t==null && s==null) return true;
		if(t==null || s==null) return false;
		
		return (t.data==s.data && areSame(t.left, s.left) && areSame(t.right, s.right));
		
		
		
	}

	
	
	
	public static void main(String args[]){
		
		BinaryTree tree  = new BinaryTree(1);
		tree.root.left= new BinaryTreeNode(2);
		tree.root.right=new BinaryTreeNode(3);
		tree.root.left.left= new BinaryTreeNode(4);
		tree.root.left.right=new BinaryTreeNode(5);
		tree.root.right.left= new BinaryTreeNode(6);
		tree.root.right.right=new BinaryTreeNode(7);
		
		BinaryTree b = new BinaryTree();
		
		//System.out.println(tree.findMaximumElement(tree.root));
		tree.insertNode(tree.root, 8);
		//tree.DepthFirstTraversal(tree.root);
		//System.out.println("\n");
		tree.printAtKdistanceNodes(tree.root,2);
		
		
		
	}
}