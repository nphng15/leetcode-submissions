class Node{
    int key, val;
    Node prev;
    Node next;

    Node(){}
    Node(int key, int val){
        this.key = key;
        this.val = val;
    }
}

class LRUCache {
    int cap;
    Node head= null;
    Node tail = null;
    HashMap<Integer, Node> mp;

    public LRUCache(int capacity) {
        cap = capacity;
        mp = new HashMap<>();
    }
    
    public int get(int key) {
        Node node = mp.get(key);
        if (node !=null){
            if (node != head) moveToHead(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (mp.containsKey(key)){
            Node node = mp.get(key);
            node.val = value;
            mp.put(key, node);
            
            if (node != head) moveToHead(node);
        }
        else {
            Node tmp = new Node(key, value);
            tmp.next = head;
            if (head!=null) head.prev = tmp;
            head=tmp;
            
            if (mp.size() == cap){
                System.out.println(key);
                tail = tail.prev;
                mp.remove(tail.next.key);
            }
            mp.put(key, tmp);
        }
        
        if (mp.size() == 1){
            tail = mp.get(key);
        }

    }

    public void moveToHead(Node node){
        Node before_node = node.prev;
        Node after_node = node.next;

        if (node == tail && mp.size() > 1){
            tail = before_node;
        }

        if (before_node == null && after_node == null) return;
        if (before_node != null){
            before_node.next = after_node;
        }
        if (after_node != null){
            after_node.prev = before_node;
        }
        node.next = head;
        node.prev = head.prev;
        head.prev = node;
        head = node;

    }
}
