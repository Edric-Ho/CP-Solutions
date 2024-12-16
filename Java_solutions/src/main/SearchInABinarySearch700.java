import ADT.BST.TreeNode;

public class SearchInABinarySearch700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if ( root == null || root.val == val) {
            return root;
        }
        if ( root.val == val) {
            return root;
        }

        else if (val > root.val){
            return this.searchBST(root.right, val);
        }
        else {
            return this.searchBST(root.left, val);
        }
    }
}
