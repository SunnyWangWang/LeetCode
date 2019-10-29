package LinkedList;

/* Description: Write a function to delete a node (except the tail) in a singly linked list, 
 * given only access to that node.
 * 
 * Note: The linked list will have at least two elements.
 * All of the nodes' values will be unique.
 * The given node will not be the tail and it will always be a valid node of the linked list.
 * Do not return anything from your function.
 */

/* IDEA: Actually, this is not a very good question. But since we are not going to delete the tail node,
 * we can make the node to be deleted equal to the next node value, and to break the link of the next node.
 * Therefore, overall, it looks like that we have deleted the node that we want.
 * - time: O(1)
 * - space: O(1)
 * 
 */

public class DeleteNodeInALinkedList {
	public void deleteNode(ListNode node) {
		 // make the current node val equal to the 
        // next node value, and make it points to the next next node
        // eg. 2-> 3-> 4  => 2 -> 4 -> 4 = > 2 -> 4 
        node.val = node.next.val;
        node.next = node.next.next;
		
	}
	

}
