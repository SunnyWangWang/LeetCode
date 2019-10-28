package LinkedList;

/* Description: Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 */

/* IDEA: Use "Iteration" - keep a "prevhead" to track the whole merged list; a "prev" to track
 * the current "previous" node
 *  - time complexity: O(m + n) as we need to iterate through 2 whole linked list.
 *  - Space complexity: O(1) as it only allocates a few pointers. 
 */


/* Definition for singly-linked list */
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {val = x;}
}


public class MergeTwoSortedLists {
	
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode prevhead = new ListNode(-1);
        ListNode prev = prevhead;
        
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
           
            }else {
                prev.next = l2;
                l2 = l2.next;
            }
            
        // use "prev" to keep updating the current prev node
         prev = prev.next;     
        }
        
        // after exit the while loop, we have at most one node list that is non-empty
        // just insert it into the back of the other one
        prev.next = (l1 == null? l2 : l1) ;
        
        return prevhead.next;
    }
}

