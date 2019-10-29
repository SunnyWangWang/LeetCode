package LinkedList;

/* Description: Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 * If there are two middle nodes, return the second middle node.
 * You may assume that the length of the list is between 1 and 100.
 * 
 */

/* IDEA: compute the nodes in the linked list into an array. 
 * So that the middle index is where we want to return.
 * - time: O(N)
 * - space: O(N), the space used by the array.
 * 
 */

public class MiddleOfTheLinkedList {
	
	public ListNode middleNode(ListNode head) {
        
        ListNode[] temp = new ListNode[100];
        int t = 0;
        
        while(head != null) {
            temp[t++] = head;
            head = head.next;
        }
        
        return temp[t/2];
    }

}
