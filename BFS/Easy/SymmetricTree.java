package BFS;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 */

class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
 


public class SymmetricTree {
	
	/* Recursion Approach: Just check if the root is the mirrow of its self
	 * with a helper function.
	 * - time: O(n) as we traverse the entire tree
	 * - space: O(n) as the recursive calls are bounded by the height of the tree, where
	 * in worst case, is O(n) as a linear tree.
	*/
	public boolean isSymmetricRecursive(TreeNode root) {
        return isMirror(root, root);
    }
    
    public boolean isMirror(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) return true;
    if (t1 == null || t2 == null) return false;
    return (t1.val == t2.val)
        && isMirror(t1.right, t2.left)
        && isMirror(t1.left, t2.right);
    }
    
    
    /****************************************************************************************/
    /* Iterative Approach: use Queue to perform bfs check on every node of the tree.
     * - time: O(n)
     * - space: O(n)
     */
    public boolean isSymmetricIterative(TreeNode root) {
    	
    	Queue<TreeNode> q = new LinkedList<>();
    	
    	q.add(root);
    	q.add(root);
    	
    	while(!q.isEmpty()) {
    		
    		TreeNode t1 = q.poll();
    		TreeNode t2 = q.poll();
    		
    		if(t1 == null && t2 == null) continue;
    		if(t1 == null || t2 == null) return false;
    		if(t1.val != t2.val) return false;
    		
    		q.add(t1.left);
    		q.add(t2.right);
    		q.add(t1.right);
    		q.add(t2.left);
    		
    	}
    	
    	return true;
    }
}
