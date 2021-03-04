/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
       
        ListNode curr = head;
        ListNode leftNode = head;
        ListNode prevNode = head;
        
        boolean foundLeft = false;
        boolean fromHead = false;
        int i = 1;
        
        while (i <= right) {
            
            if (foundLeft) {
                if (!fromHead) {
                    ListNode curr_next = curr.next;
                    ListNode newNode = new ListNode(curr.val, prevNode.next);
                    prevNode.next = newNode; 
                } else {
                    ListNode newNode = new ListNode(curr.val, head);
                    head = newNode;
                } 
                
                curr = curr.next;
                leftNode.next = curr;
            } else {
                if (i == left) {
                    leftNode = curr;
                    foundLeft = true;
                    if (curr == head) {
                        fromHead = true;
                    }
                } else {
                    prevNode = curr; 
                }
                curr = curr.next;
            }
            
            i++;
            
        }
        
        return head;
        
    }
}