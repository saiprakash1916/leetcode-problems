package leetCode;

import java.util.HashMap;

public class LRUCache {
    static class Cache {
        private static class CacheNode {
            int key;
            int value;
            CacheNode prev;
            CacheNode next;

            CacheNode(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        private final int capacity;
        private final HashMap<Integer, CacheNode> map;
        private final CacheNode head;
        private final CacheNode tail;

        public Cache(int capacity) {
            this.capacity = capacity;
            map = new HashMap<>();
            head = new CacheNode(-1, -1);
            tail = new CacheNode(-1, -1);

            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            if (!map.containsKey(key)) {
                return -1;
            }
            CacheNode node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }

        public void set(int key, int value) {
            if (capacity == 0) {
                return;
            }

            if (map.containsKey(key)) {
                CacheNode node = map.get(key);
                node.value = value;
                remove(node);
                insert(node);
            } else {
                if (map.size() == capacity) {
                    CacheNode lru = tail.prev;
                    remove(lru);
                    map.remove(lru.key);
                }
                CacheNode newNode = new CacheNode(key, value);
                insert(newNode);
                map.put(key, newNode);
            }
        }

        private void remove(CacheNode node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        private void insert(CacheNode node) {
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
        }

        public void printCache() {
            CacheNode current = head.next;
            System.out.print("Cache (MRU -> LRU): ");
            while (current != tail) {
                System.out.print("[" + current.key + "=" + current.value + "]");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Cache cache = new Cache(2);

        System.out.println("set(1,10)");
        cache.set(1, 10);
        cache.printCache();

        System.out.println("set(2,20)");
        cache.set(2, 20);
        cache.printCache();

        System.out.println("get(1) = " + cache.get(1));
        cache.printCache();

        System.out.println("set(3,30)");
        cache.set(3, 30); // Evicts key 2
        cache.printCache();

        System.out.println("get(2) = " + cache.get(2));

        System.out.println("set(4,40)");
        cache.set(4, 40); // Evicts key 1
        cache.printCache();

        System.out.println("get(1) = " + cache.get(1));
        System.out.println("get(3) = " + cache.get(3));
        System.out.println("get(4) = " + cache.get(4));

        cache.printCache();
    }
}
