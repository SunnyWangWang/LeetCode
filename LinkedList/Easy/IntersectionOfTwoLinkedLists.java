package LinkedList;

import java.util.HashSet;

/* Definition for singly-linked list */
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {val = x;}
}

/* Description: Write a program to find the node at which the intersection of two singly 
 * linked lists begins. eg. 1->2->3->4 and 3->2->3->4 => intersect at node 2.  
 * Minor case: [1] and [1], intersect at 1.  Returen null if no such intersection node found.
 */

/* IDEA: use a HashSet to first store all the node in LinkedList A, and then use that 
 * to traverse all the elements in LinkedList B. 
 * - time: O(M+N)
 * - space: O(M) or O(N), as only store one linked list is enough.
 */



public class IntersectionOfTwoLinkedLists {
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	
		HashSet<ListNode> mySet = new HashSet<ListNode> ();
	
		while (headA != null) {
			mySet.add(headA);
			headA = headA.next;
		}
    
		// minor case: [1], [1] => intersect at 1, so I check the cur.val instead of 
		// cur.next.val in HashSet.contains
		while (headB != null) {
			if(mySet.contains(headB)) {
				return headB;
			}
			headB = headB.next;
		}
		return null;

	}
}
