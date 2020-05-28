/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class ConstructBSTFromPreorder {
    public TreeNode bstFromPreorder(int[] preorder) {
        
        return createBST(preorder, new int[]{0}, Integer.MAX_VALUE);
        
    }
    
    private TreeNode createBST(int[] preorder, int[] cursor, int constraint){
        TreeNode node= new TreeNode(preorder[cursor[0]]);
        cursor[0]++;
        
        if(cursor[0]<preorder.length && preorder[cursor[0]]<node.val)
            node.left= createBST(preorder,cursor,node.val);
        if(cursor[0]<preorder.length && preorder[cursor[0]]<constraint)
            node.right= createBST(preorder,cursor,constraint);
                                    
        return node;
    }
}
