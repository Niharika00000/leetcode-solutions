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
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
       //create a queue and insert the node
       // count the number of node(size=queue.size)
       //traverse all nodes of that level abd add the left and right to the quesue
       //store the last node of each level in the result becaus it is the rightmost node
       //repeatn until the queue is empty
       //return the result

       List<Integer> result = new ArrayList<>();
       if(root==null){
        return result;

       }

       Queue<TreeNode> queue = new LinkedList<>();
       queue.offer(root);
       while(!queue.isEmpty()){
        int size = queue.size();
        for(int i=0;i<size;i++){
            TreeNode current = queue.poll();
            if(i==size-1){
                result.add(current.val);
            }

            if(current.left!=null){
                queue.offer(current.left);
            }
            if(current.right!=null){
                queue.offer(current.right);

            }
        }
       }
return result;
    }
}