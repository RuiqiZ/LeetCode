class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode start = new ListNode();
        ListNode node = start;
        int div = 10;
        int carryover = 0;
        int remainder = 0;
        
        node.val = (l1.val + l2.val)%div;
        carryover = (l1.val + l2.val)/div;
        l1 = l1.next;
        l2 = l2.next;
       
        while (l1 != null || l2 != null) {
            ListNode newNode = new ListNode();
            if (l1 != null && l2 != null) {
                newNode.val = (l1.val + l2.val + carryover)%div;
                carryover = (l1.val + l2.val + carryover)/div;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                newNode.val = (l1.val + carryover)%div;
                carryover = (l1.val + carryover)/div;
                l1 = l1.next;
            } else if (l2 != null) {
                newNode.val = (l2.val + carryover)%div;
                carryover = (l2.val + carryover)/div;
                l2 = l2.next;
            }

            node.next = newNode;
            node = node.next;
        }
        
        if (carryover != 0) {
            node.next = new ListNode(carryover);
            node = node.next;
        }
        return start;
    }
}
