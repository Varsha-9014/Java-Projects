package varsha;


import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache extends LinkedHashMap<Integer, Integer> {
    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true); // true enables access-order
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }

    // MAIN METHOD TO RUN THE PROGRAM
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2); // Cache with capacity 2

        cache.put(1, 1); // cache = {1=1}
        cache.put(2, 2); // cache = {1=1, 2=2}
        System.out.println(cache.get(1)); // returns 1, cache = {2=2, 1=1}
        
        cache.put(3, 3); // LRU key was 2, evicts key 2, cache = {1=1, 3=3}
        System.out.println(cache.get(2)); // returns -1 (not found)
        
        cache.put(4, 4); // LRU key was 1, evicts key 1, cache = {3=3, 4=4}
        System.out.println(cache.get(1)); // returns -1 (not found)
        System.out.println(cache.get(3)); // returns 3
        System.out.println(cache.get(4)); // returns 4
    }
}
