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
class KthSmallestElementInBST {
    List<Integer> list= new ArrayList<>();
    int count;
    public int kthSmallest(TreeNode root, int k) {
     //   int[] sortedArray=
        count=k;
        inorder(root);
        return list.get(k-1);
    }
    
    public void inorder(TreeNode node){
        if(node==null) return;
        if(count>0){
        inorder(node.left);
        list.add(node.val);
        count--;
        inorder(node.right);
        }
    return;
    }
}
