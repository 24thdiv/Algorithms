import java.util.*;

class Node{

    int val;
    List<Node> children;

    public Node(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public void addChild(Node child){
        if(this.children == null){
            this.children = new ArrayList<>();
        }
        this.children.add(child);
    }

    public Set<Node> getAllLeafNodes(){
        Set<Node> leafNodes = new HashSet<>();
        if(this.children.isEmpty()){
            leafNodes.add(this);
        }
        else {
            for(Node child: this.getChildren()){
                leafNodes.addAll(child.getAllLeafNodes());
            }
        }
        return leafNodes;
    }
}

public class NArrayTree {


   Node root;

   NArrayTree(int val){
       root = new Node(val);
   }

   public String serialize(Node root){
       //store string as value and size of the children with comma separated
       StringBuilder sb = new StringBuilder();
       serializeHelper(root,sb);
       return sb.toString();
   }

    private void serializeHelper(Node root, StringBuilder sb) {
       if(root == null){
           sb.append("null").append(",");
       }
       else{
           sb.append(root.getVal()).append(",");
           sb.append(root.getChildren().size()).append(",");
           for(int i=0; i<root.getChildren().size(); i++){
               serializeHelper(root.getChildren().get(i),sb);
           }
       }

   }

   public Node deserialize(String data){
       Queue<String> q = new LinkedList<>();
       q.addAll(Arrays.asList(data.split(",")));
       return deserializeHelper(q);
   }

    private Node deserializeHelper(Queue<String> q) {
        String value = q.poll();
        if(value.equals("null")){
            return null;
        }
        else {
            int size = Integer.parseInt(q.poll());
            Node root = new Node(Integer.parseInt(value));
            List<Node> children = new ArrayList<>(size);
            root.setChildren(children);
            for(int i=0; i<size; i++){
               root.getChildren().add(deserializeHelper(q));
            }
            return root;
        }
   }

   public Node addChildNodeOf(Node root, int parentNodeVal, Node newNode){
       if(root == null || parentNodeVal == 0 || newNode == null){
           return null;
       }
       Queue<Node> q = new LinkedList<>();
       q.add(root);
       while (!q.isEmpty()){
           int size = q.size();
           for(int i=0; i<size; i++){
               Node node = q.poll();
               if(node.getVal() == parentNodeVal){
                  node.addChild(newNode);
                   return root;
               }
               for(Node n: node.getChildren()){
                   q.add(n);
               }
           }
       }
       return null;
   }

    public Set<Node> getAllLeafNodes(Node node){
        Set<Node> leafNode = new HashSet<>();
        getLeafNodeHelper(node,leafNode);
        return leafNode;
    }

    private void getLeafNodeHelper(Node node, Set<Node> leafNodes){
       if(node.getChildren().isEmpty()){
           leafNodes.add(node);
       }
       else {
           for(Node child : node.getChildren()){
               getLeafNodeHelper(child,leafNodes);
           }
       }
    }

    public static void main(String[] args){
       Node b = new Node(2);
       Node c = new Node(3);
       Node d = new Node(4);
       Node e = new Node(5);
       Node f = new Node(6);
       Node g = new Node(9);
       Node h = new Node(10);

       NArrayTree nArrayTree = new NArrayTree(1);
       nArrayTree.root.addChild(c);
       nArrayTree.root.addChild(b);
       nArrayTree.root.addChild(d);
       c.addChild(e);
       c.addChild(f);
       e.addChild(g);
       f.addChild(h);

       nArrayTree.addChildNodeOf(nArrayTree.root,2,new Node(7));
       nArrayTree.addChildNodeOf(nArrayTree.root,3,new Node(8));

       String data = nArrayTree.serialize(nArrayTree.root);
       Set<Node> leafs = nArrayTree.getAllLeafNodes(nArrayTree.root);
       System.out.println(nArrayTree.root.getAllLeafNodes());
       Node root = nArrayTree.deserialize(data);
       System.out.println("Done");

    }

}
