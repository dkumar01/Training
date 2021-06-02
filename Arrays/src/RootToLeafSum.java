public class RootToLeafSum {

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

    public static void main(String[] args) {

        RootToLeafSum obj = new RootToLeafSum();
    }

    public int sumNumbers(TreeNode A) {

        return recursiveSum(A, 0) % 1003;
    }

    public int recursiveSum(TreeNode A, int val) {

        if(A == null) {

            return 0;
        }

        val = (val * 10) + A.val;

        if(A.left == null && A.right == null) {

            return val;
        }

        return recursiveSum(A.left, val) + recursiveSum(A.right, val);
    }

}
