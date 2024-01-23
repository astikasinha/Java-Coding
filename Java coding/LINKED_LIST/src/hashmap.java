import java.util.HashMap;
import java.util.Map;

/*public class hashmap {
    static void hashmapmethods() {
        Map<String, Integer> mp = new HashMap<>();
        // adding elements
        mp.put("AKkhil", 30);
        mp.put("Rina", 30);
        mp.put("AKash", 30);
        mp.put("jack", 30);
        mp.put("mishti", 30);
        // getting value of a key from the HashMap
        System.out.println(mp.get("jack"));
        // changing value of a key
        mp.put("AKash", 25);
        // removing a pair from the hashmap
        mp.remove("mishti");
        System.out.println(mp.get("mishti"));// Corrected line
        System.out.println(mp.containsKey("jack"));
        // adding a new entry only if the new key does not exist already
        mp.putIfAbsent("Yashika", 30);
        mp.putIfAbsent("Yash", 30);
        // get all keys in the hashmap
        System.out.println(mp.keySet());
        // get all value sin hashmap
        System.out.println(mp.values());
        // get all entried in the hashmap
        System.out.println(mp.entrySet());
        // traversing all entries of hashmap-multiple methods
        for (String key : mp.keySet()) {
            System.out.printf("age of %s is %d\n", key, mp.get(key));
        }
        for (Map.Entry<String, Integer> e : mp.entrySet()) {
            System.out.printf("age of %s is %d\n", e.getKey(), e.getValue());
        }
    }

    public static void main(String[] args) {
        hashmapmethods();
    }

}*/
//counting frequency of each element
/*public class hashmap {

    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 5, 4, 4, 6, 4, 4, 4 };
        Map<Integer, Integer> freq = new HashMap<>();
        for (int el : arr) {
            if (!freq.containsKey(el)) {
                freq.put(el, 1);
            } else {
                freq.put(el, freq.get(el) + 1);
            }
        }
        System.out.println(freq.entrySet());
        int maxfreq = 0, anskey = -1;
        for (var e : freq.entrySet()) {
            if (e.getValue() > maxfreq) {
                maxfreq = e.getValue();
                anskey = e.getKey();
            }
        }
        System.out.printf("%d has frequency and it occurs %d times", anskey, maxfreq);
    }

}*/
import java.util.LinkedList;

public class hashmap {
    static class MyHashMap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private LinkedList<Node>[] buckets;

        private void initBuckets(int N) {
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int searchInBucket(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        private int hashFunc(K key) {
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }

        public MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }

        public int size() {
            return n;
        }

        public void put(K key, V value) {
            int bi = hashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei == -1) {
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            } else {
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }
        }

        public V get(K key) {
            int bi = hashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei != -1) {
                Node currNode = currBucket.get(ei);
                return currNode.value;
            } else {
                return null;
            }
        }

        public V remove(K key) {
            int bi = hashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei != -1) {
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            return null;
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        System.out.println("Testing Out");
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("c", 3);
        System.out.println(mp.size());
        mp.put("c", 30);
        System.out.println(mp.size());
        System.out.println(mp.get("a"));
        System.out.println(mp.get("d"));
        System.out.println(mp.remove("c"));
        System.out.println(mp.remove("c"));
    }
}
