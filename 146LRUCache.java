class LRUCache {
    Node head = new Node();
    Node tail = new Node();
    Map<Integer, Node> cache;
    int capacity;
    
    public LRUCache(int capacity) {
        cache = new HashMap<>(capacity);
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        Node node = cache.get(key);
        if (node != null) {
            remove(node);
            addToTop(node);
            return node.val;
        } 
        
        return -1;
    }
    
    public void put(int key, int value) {
        Node node = cache.get(key);
        
        if (node != null) {
            node.val = value;
            remove(node);
            addToTop(node);
        } else {
            if (cache.size() == capacity) {
                cache.remove(tail.prev.key);
                remove(tail.prev);
            } 
            
            node = new Node();
            node.key = key;
            node.val = value;
            addToTop(node);
            cache.put(key, node);
        }
            
        
    }
    
    public void addToTop(Node node) {
        Node head_next = head.next;
        head.next = node;
        node.prev = head;
        node.next = head_next;
        head_next.prev = node;
    }
    
    public void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    class Node {
        int key;
        int val;
        Node prev;
        Node next;
    }
}