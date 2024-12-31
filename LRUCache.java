import java.util.*;

class LRUCache {

    private class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> map;
    private final Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        
        // Dummy head and tail nodes
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;

        Node node = map.get(key);
        moveToHead(node); // Mark as recently used
        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            moveToHead(node); // Update and mark as recently used
        } else {
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addNode(newNode);

            if (map.size() > capacity) {
                Node tail = popTail();
                map.remove(tail.key);
            }
        }
    }

    // Add node to the head of the list
    private void addNode(Node node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    // Remove a node from the list
    private void removeNode(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    // Move a node to the head of the list
    private void moveToHead(Node node) {
        removeNode(node);
        addNode(node);
    }

    // Remove the tail node
    private Node popTail() {
        Node res = tail.prev;
        removeNode(res);
        return res;
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);

        lruCache.put(1, 1);
        lruCache.put(2, 2);
        System.out.println(lruCache.get(1)); // Output: 1
        lruCache.put(3, 3);                  // Removes key 2
        System.out.println(lruCache.get(2)); // Output: -1
        lruCache.put(4, 4);                  // Removes key 1
        System.out.println(lruCache.get(1)); // Output: -1
        System.out.println(lruCache.get(3)); // Output: 3
        System.out.println(lruCache.get(4)); // Output: 4
    }
}
