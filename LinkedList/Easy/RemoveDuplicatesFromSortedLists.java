package LinkedList;

/* Description: Given a SORTED linked list, delete all duplicates such that each element 
 * appear only once.
 * 
 */

/* IDEA: use native linked list pointer structure to just compare the cur node val 
 * with its cur.next node val as the list is sorted.
 * - time: O(N)
 * - space: O(1)
 * 
 */



public class RemoveDuplicatesFromSortedLists {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode cur = head;
		
		while(cur != null && cur.next != null) {
			// just skip the node if duplictes
			if(cur.val == cur.next.val) {
				cur.next = cur.next.next;
				
			// be caredul with the "else" and have noting!
			}else {
				cur = cur.next;	
			}
		}
		return head;
		
	}

}
