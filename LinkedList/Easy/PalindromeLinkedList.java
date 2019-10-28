/* Description: To tell whether a linkedlist is palindrome.
 * 
 */

/* IDEA: Use a stack, push first half of the linked list element into the stack
 * and compare the second half of the rest linked list to the stack pop
 * - time complexity: O(n)
 * - space complexity: O(1)
 * 
 */



package LinkedList;

import java.util.Stack;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> myStack = new Stack<Integer> ();
        ListNode cur = head;
        
        // compute the length of the linked list
        int length = 0;
        while (cur != null) {
            length ++;
            cur = cur.next;        
        }
        
        // compute the first half of the linkedlist into stack
        for(int i = 0; i < length /2; i++ ) {
            myStack.push(head.val);
            head = head.next;
        }
        
        int start;
        // compare the second half of the rest list
        if (length % 2 == 0) {
            start = length/2;
        } else {
              // odd list, skip the middle element
             start = (length/2) + 1;
             head = head.next;
        }
        
        for (int j = start; j < length; j++) {
            if (head.val != myStack.pop()) {
                return false;
            }
            head = head.next;
        }
        
        return true;
       
    }
	
}
