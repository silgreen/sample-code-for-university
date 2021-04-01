public class BinaryTreeNode {
	private Object value;
	private BinaryTreeNode left,right;
	
	public BinaryTreeNode getLeft() {return left;}
	public BinaryTreeNode getRight() {return right;}
	
	public BinaryTreeNode(Object el, BinaryTreeNode r, BinaryTreeNode l){
		value = el;
		right = r;
		left = l;	
	}

	@Override 
	public String toString() {
	return value.toString();
	} 
       
	public static void main(String[] args){
	BinaryTreeNode root = new BinaryTreeNode("ciao",null,null);
	visitPreOrder(root);
	}
}

