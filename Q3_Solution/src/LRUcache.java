import java.util.HashMap;

public class LRUcache {
    // default capacity
    int capacity = 5;

    // the current sie of the cache
    int size = 0;

    // Use the hashmap to lookup the entry
    HashMap<Integer, CacheNode> map = new HashMap<Integer, CacheNode>();

    // set head and end
    CacheNode head = null;
    CacheNode end = null;

    public LRUcache(int capacity) {
        this.capacity = capacity;
    }

    // return the entry given the key; return null if it's not in the cache
    public CacheNode request(int key) {
        CacheNode node;
        if (map.containsKey(key)) {
            node = map.get(key);
            return node;
        } else {
            System.out.println("The requested resource cannot be found.");
            return null;
        }
    }

    // insert a new entry to the cahce
    public void insert(int key, String IP, double longitude, double latitude) {
        CacheNode newNode = new CacheNode(key, IP, longitude, latitude);
        if (size() >= capacity) {
            System.out.println("Removing the least used entry now... Adding the new one.");
            delete(end);
            map.remove(end.key);
            size--;
        }
        updateHead(newNode);
        size++;
        map.put(key, newNode);
    }

    // delete the node
    public void delete(CacheNode node) {
        if (node.pre == null) {
            head = node.next;
        } else {
            node.pre.next = node.next;
        }

        if (node.next == null) {
            end = node.pre;
        } else {
            node.next.pre = node.pre;
        }
    }

    // update the head in the cache
    private void updateHead(CacheNode node) {
        node.next = head;
        node.pre = null;

        if (head != null)
            head.pre = node;

        head = node;

        if (end == null)
            end = head;
    }

    // return the size of the cache
    public int size() {
        return this.size;
    }

    // return if the cache is empty
    public boolean empty() {
        return size() == 0;
    }

    // display entries in the cache
    public void display() {
        CacheNode node = head;
        while (node != null) {
            System.out.println(node);
            node = node.next;
        }
    }
}
