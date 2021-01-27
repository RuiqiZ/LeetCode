class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        
        int back = list.size();
        
        for (int i = 0; i < list.size()/2; i++) {
            if (list.get(i) - list.get(back-1) == 0) {
                back --;
            } else {
                return false;
            }
        }
        
        return true;
    }
}