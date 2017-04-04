public class Solution {
    private long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        return _checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean _checkBST(TreeNode node, long min, long max) {
        if (node == null) return true;

        if (node.val <= min || node.val >= max) return false;
        if (!_checkBST(node.left, min, node.val)) return false;
        if (!_checkBST(node.right, node.val, max)) return false;

        return true;
    }
    private boolean _checkBST1(TreeNode node, long min, long max) {
        if (node == null) return true;

        return node.val <= min
            && node.val >= max
            && _checkBST(node.left, min, node.val)
            && _checkBST(node.right, node.val, max);
    }
    private boolean _checkBST2(TreeNode node) {
        if (node == null) return true;

        if (!isValudBST(node.left)) return false;

        if (node.val <= pre) return false;
        pre = node.val;

        if (!isValidBST(node.right)) return false;
    }
}
