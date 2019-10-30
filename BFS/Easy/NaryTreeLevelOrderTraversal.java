package BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* Description: Given an n-ary tree, return the level order traversal of its nodes' values. 
 * (ie, from left to right, level by level).
 * eg.         1
 *        3    2    4
 *     5  6                   => [[1], [3, 2, 4], [5, 6]]
 * 
 */

/* IDEA: use BFS - a queue to record all the nodes encountered so far, a list to get all the nodes
 * in a level.
 * - time: O(N)
 * - space: O(N)
 * 
 */

/* Definition for a node.
 * 
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class NaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(Node root) {
		// init a queue to provide bfs traversal
		Queue<Node> q = new LinkedList<>();
		List<List<Integer>> res = new ArrayList<> ();
		
		 if(root != null) {
	            q.add(root);
	     }
		 
		 while(!q.isEmpty()) {
			 
			 // for each level
	         List<Integer> LevelData = new ArrayList<> ();
	         int size = q.size();
	         
	         for (int i = 0; i < size; i++) {
	        	 Node cur = q.poll();
	        	 
	        	 // append the cur node to the res list
	        	 LevelData.add(cur.val);
	        	 
	        	// use "q.addAll()" to add the children
	            // and only add when the node has children
	        	 if(cur.children.size() > 0) {
	        		 q.addAll(cur.children);	 
	        	 }
	        
	        	 
	         }
	         
	         if(LevelData.size() > 0) {
	        	 res.add(LevelData); 
	         }
			 
		 }
		 
		 return res;
	}

}
