package leetCode;

/*
    Design and implement a simplified HashMap that stores integer key–value pairs and supports the following operations:

    put(key, value) → Insert a new (key, value) pair.
    If the key already exists, update its value.
    get(key) → Return the value associated with key, or -1 if the key is not found.
    remove(key) → Delete the entry with the given key and return its previous value, or -1 if it does not exist.
    size() → Return the total number of key–value pairs currently stored.

    The HashMap must use chaining (linked lists in each bucket) to handle collisions.

    Hashing Rules
    The hash index is calculated as
    index = abs(key) % bucket_count
    Maintain the load factor (λ) = number_of_elements / number_of_buckets
    Whenever λ > 2.0, rehash the map by doubling the number of buckets and reinserting all existing elements.
    The implementation must not use built-in hash maps, dictionaries, or similar classes.
    The initial bucket count should be 4.
 */

public class customHashing {
    static class customHashMap {
        static class Node {
            int key;
            int value;
            Node next;

            Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        private Node[] bucket;
        private int bucketCount;  // Initial count is 4
        private int size;

        public customHashMap() {
            bucketCount = 4;
            bucket = new Node[bucketCount];
            size = 0;
        }

        private int getIndex(int key) {
            return Math.abs(key) % bucketCount;
        }

        public void put(int key, int value) {
            int index = getIndex(key);
            Node current = bucket[index];
            while (current != null) {
                if (current.key == key) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            Node node = new Node(key, value);
            node.next = bucket[index];
            bucket[index] = node;
            size++;

            //Check load factor
            if ((double) size / bucketCount > 2.0) {
                rehash();
            }
        }

        public int get(int key) {
            int index = getIndex(key);
            Node current = bucket[index];
            while (current != null) {
                if (current.key == key) {
                    return current.value;
                }
                current = current.next;
            }
            return -1;
        }

        public int remove(int key) {
            int index = getIndex(key);
            Node current = bucket[index];
            Node prev = null;

            while (current != null) {
                if (current.key == key) {
                    if (prev == null) {
                        bucket[index] = current.next;
                    } else {
                        prev.next = current.next;
                    }
                    size--;
                    return current.value;
                }
                prev = current;
                current = current.next;
            }
            return -1;
        }

        public int size() {
            return size;
        }

        private void rehash() {
            Node[] oldBucket = bucket;
            bucketCount = bucketCount * 2;

            bucket = new Node[bucketCount];
            int oldSize = size;
            size = 0;

            for (Node head : oldBucket) {
                Node current = head;

                while (current != null) {
                    put(current.key, current.value);
                    current = current.next;
                }
            }
            size = oldSize;
        }
    }

    public static void main(String[] args) {
        customHashMap map = new customHashMap();

        // Insert
        map.put(10, 100);
        map.put(20, 200);
        map.put(30, 300);
        map.put(40, 400);

        System.out.println("Size : " + map.size());

        // Get
        System.out.println("Value of key 10 : " + map.get(10));
        System.out.println("Value of key 20 : " + map.get(20));
        System.out.println("Value of key 100 : " + map.get(100)); // Not found

        // Update existing key
        map.put(20, 250);
        System.out.println("Updated value of key 20 : " + map.get(20));

        // Remove
        System.out.println("Removed key 30 : " + map.remove(30));
        System.out.println("Removed key 50 : " + map.remove(50)); // Not found

        System.out.println("Size after removal : " + map.size());

        // Add more elements to trigger rehash
        map.put(50, 500);
        map.put(60, 600);
        map.put(70, 700);
        map.put(80, 800);
        map.put(90, 900);

        System.out.println("Size after more inserts : " + map.size());

        // Verify data after rehash
        System.out.println("Key 10 : " + map.get(10));
        System.out.println("Key 20 : " + map.get(20));
        System.out.println("Key 40 : " + map.get(40));
        System.out.println("Key 50 : " + map.get(50));
        System.out.println("Key 90 : " + map.get(90));
    }
}
