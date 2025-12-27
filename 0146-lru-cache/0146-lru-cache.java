class LRUCache {

    class Node{
        int val, key;
        Node next;
        Node prev;

        Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }

    Map<Integer, Node> cache;
    int capacity;
    Node head, tail;

    public LRUCache(int capacity) {
        cache = new HashMap<>();
        this.capacity = capacity;

        head = new Node(-1,-1);
        tail = new Node(-1,-1);

        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!cache.containsKey(key))
            return -1;

        Node node = cache.get(key);
        removeNode(node);
        addToHead(node);

        return node.val;
        
    }
    
    public void put(int key, int value) {
        
        if(!cache.containsKey(key)){
            
            if(cache.size() == capacity){
                cache.remove(tail.prev.key);
                removeNode(tail.prev);
            }
            Node newNode = new Node(key, value);
            addToHead(newNode);
            cache.put(key, newNode);

        }else{
            Node node = cache.get(key);
            node.val = value;

            removeNode(node);
            addToHead(node);
        }
    }

    public void addToHead(Node node){
        
        node.next = head.next;
        head.next.prev = node;
        node.prev = head;
        head.next = node;
    }

    public void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */