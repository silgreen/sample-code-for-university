import java.util.Iterator;

public class BinaryTreeNode {
    // ************* */
    private Object value;
    public BinaryTreeNode left, right;

    public BinaryTreeNode(Object val, BinaryTreeNode r, BinaryTreeNode l) {
        value = val;
        left = l;
        right = r;
    }

    public Object getValue() {
        return value;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void preOrder(BinaryTreeNode root) {
        if (root != null) {
            System.out.println(root.value);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode("ciao", new BinaryTreeNode("lallo", null, null),
                new BinaryTreeNode("ciccio", null, null));
        BinaryTreeIterator i = new BinaryTreeIterator(root);
        while (i.hasNext()) {
            BinaryTreeNode temp = i.next();
            System.out.println(temp.value);
        }

        root.preOrder(root);

    }
}
