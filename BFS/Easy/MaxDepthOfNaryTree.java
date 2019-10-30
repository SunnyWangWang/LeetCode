package BFS;

import java.util.LinkedList;
import java.util.Queue;
// java 8
import javafx.util.Pair;

/* Description: return the max depth of the tree.
 * The root is considered at depth 1.
 */

/* IDEA: use iteration approach - use BFS to record every node we have visited.
 * Make a global variable resDepth to keep updating the max depth so far by comparing
 * to the depth of each children node that we have encountered.
 * - time: O(n)
 * - space: O(N)
 * 
 */


public class MaxDepthOfNaryTree {
	public int maxDepth(Node root) {
		Queue<Pair<Node, Integer>> q = new LinkedList<>(); 
		
		if(root != null) {
			q.add(new Pair(root, 1));
		}else {
			return 0;
		}
		
		int resDepth = 0;
		while(!q.isEmpty()) {
			Pair<Node, Integer> cur = q.poll();
			int cur_depth = cur.getValue();
			Node cur_key = cur.getKey();
			
			if(cur_key != null) {
				resDepth = Math.max(resDepth, cur_depth);
				
				for(Node child: cur_key.children) {
					
					// can't use cur_depth++ in this case, as we are 
                    // changing the reference of cur_depth vaule! cur_depth
                    // would be a lot more bigger than we expect!
					q.add(new Pair(child, cur_depth +1));
				}

			}
			
		}
		return resDepth;
	}
}
