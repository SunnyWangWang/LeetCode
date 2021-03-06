package BFS;

import java.util.LinkedList;
import java.util.Queue;
// java 8
import javafx.util.Pair;

/* Description: Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from 
 * the root node down to the nearest leaf node.
 */

/* IDEA: use BFS, the first time you see a leaf node, the depth at that
 * node is mininum.
 * - time: O(N) in worst case, but the best case is better than O(N). 
 * Where, it is still better than just DFS, as in DFS we must visit every tree node
 * to get the minium depth.
 * - space: O(N)
 */
public class MinDepthOfBinaryTree {
	
	public int minDepth(TreeNode root) {
		
		Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();
        
        if (root != null) {
            q.add(new Pair(root, 1));
            
        }else {
            // the depth is 0 if there is no tree
            return 0;
        }
		
        while(!q.isEmpty()) {
            Pair<TreeNode, Integer> cur = q.poll();
            TreeNode curNode = cur.getKey();
            int curDepth = cur.getValue();
            if (isLeafNode(curNode)) return curDepth;
            if (curNode.left != null) q.add(new Pair(curNode.left, curDepth+1));     
            if (curNode.right != null) q.add(new Pair(curNode.right, curDepth+1));
        }
        
        return -1;	
	}
}
