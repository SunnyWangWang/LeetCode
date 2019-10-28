package LinkedList;


/* Description: Reverse a linked list
 * 
 */

/* IDEA: make 3 pointes, one keep track of the cur node, one track the prev node, the other
 *  track the next val
 *  - time complexity: O(n) the length of the linked list
 *  - space complexity: O(1) as it only allocates a few pointers
 */


/**
 * Definition for singly-linked list.
 *  class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
        // 2 pointers needed
        ListNode cur = head;
        ListNode prev = null;
        
        while (cur != null) {
            // track the origin next val so we don't lose it
            ListNode after = cur.next;
            // reverse the ->
            cur.next = prev;
            // update the prev
            prev = cur;
            // update the cur
            cur = after;
        }
        
        return prev;
		
	}

}
