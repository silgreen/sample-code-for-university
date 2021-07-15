import java.util.Iterator;
import java.util.LinkedList;

public class BinaryTreeIterator implements Iterator<BinaryTreeNode> {

    BinaryTreeNode r;
    LinkedList<BinaryTreeNode> stack = new LinkedList<>();

    public BinaryTreeIterator(BinaryTreeNode root) {
        r = root;
    }

    @Override
    public BinaryTreeNode next() {
        BinaryTreeNode val = r;
        if (r.right != null)
            stack.addFirst(r.right);
        if (r.left != null) {
            r = r.left;
        } else if (!stack.isEmpty()) {
            r = stack.remove();
        } else
            r = null;
        return val;
    }

    @Override
    public boolean hasNext() {
        return r != null;
    }
}
