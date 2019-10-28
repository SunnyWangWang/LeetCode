/* Description: Given a linked list, determine if it has a cycle in it.
 * 
 */

/* IDEA: use "HashSet" to check whether the next element is already in the set.
 * - time: O(n) to traverse the linked list.
 * - space: O(n), at most to put n elements into the hashset.
 */


package LinkedList;

import java.util.HashSet;

public class LinkedListCycle {
	
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> myHash = new HashSet<ListNode> ();
        
        while (head != null) {
            if (myHash.contains(head)) {
                // it is a cycled linked list
                return true;  
            }
            myHash.add(head);
            head = head.next;    
        }
        
        return false;
    }

}
