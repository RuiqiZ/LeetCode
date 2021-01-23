class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node curr1 = head;
        Node curr2 = head;
        
        while (curr1 != null) {
            map.put(curr1, new Node(curr1.val));
            curr1 = curr1.next;
        }
        
        while (curr2 != null) {
            Node copyNode = map.get(curr2);
            if (curr2.next != null) {
                copyNode.next = map.get(curr2.next);
            } else {
                copyNode.next = null;
            }
            
            if (curr2.random != null) {
                copyNode.random = map.get(curr2.random);
            } else {
                copyNode.random = null;
            }
            
            curr2 = curr2.next;
        }
        return map.get(head);
    }
}