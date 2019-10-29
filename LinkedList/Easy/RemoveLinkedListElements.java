/* Description: Remove all elements from a linked list of integers that have value val
 * eg. 1->2->3->2, val = 2,  =>   1->3
 */

/* IDEA: the key point is to make a sentinel node to added as the new head of the linked list,
 * and to init 2 pointers prev and cur to keep track of the current node and its previous node.
 * So we can just make the prev.next = cur.next to delete the current node, and just return
 * sentinel.next as the whole result.
 *  - time: O(n)
 *  - space: O(1)
 * 
 */

package LinkedList;

public class RemoveLinkedListElements {
	
	public ListNode removeElements(ListNode head, int val) {
		
		// init the sentinel node and set it to the new head
        ListNode sentinel = new ListNode(-1) ;
        sentinel.next = head;
        
        // init two pointers to track the cur node and its prev
        ListNode cur = head;
        ListNode prev = sentinel;
        
        while(cur != null){
            if (cur.val == val) {
                prev.next = cur.next;
                // can't set cur.next here otherwise the first time we
                // found where the node, the loop exit
                //cur.next = null;
            }else{
                prev = cur;
            }
            // move to the next node
            cur = cur.next;
        }
        
        return sentinel.next;
        }
	}
