import java.util.LinkedList;
import java.util.List;

public class InvertBinaryTree {

    public static void main(String[] args) {

        InvertBinaryTree obj = new InvertBinaryTree();
    }


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }

    public TreeNode invertTree(TreeNode A) {

        LinkedList<TreeNode> queue = new LinkedList<>();

        if(A != null) {

            queue.add(A);
        }

        while(!queue.isEmpty()) {

            TreeNode node = queue.poll();

            if(node.left != null) {

                queue.add(node.left);
            }
            if(node.right != null) {

                queue.add(node.right);
            }

            TreeNode temp = node.right;
            node.right = node.left;
            node.left = temp;
        }

        return A;
    }
}
