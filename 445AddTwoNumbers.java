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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        ListNode l3 = null;
        int carry = 0;
        int remainder = 0;
        
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                s1.push(l1.val);
                l1 = l1.next;
            }
            
            if (l2 != null) {
                s2.push(l2.val);
                l2 = l2.next;
            }
        }
        
        while (!s1.isEmpty() || !s2.isEmpty()) {
            int sum = (s1.isEmpty()? 0: s1.pop()) + (s2.isEmpty()? 0: s2.pop()) + carry;
            remainder = sum%10;
            carry = sum/10;
            
            if (l3 == null) {
                l3 = new ListNode(remainder, null);
            } else {
                l3 = new ListNode(remainder, l3);
            }
        }
        
        if (carry != 0) {
            l3 = new ListNode(carry, l3);
        }
        return l3;
    }
}