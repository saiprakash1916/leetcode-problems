package leetCode.linkedList;

public class sumOfElements {
    static void sumOfElementsUsingSingle() {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        Node current = head;
        int sum = 0;
        while (current != null) {
            sum += current.data;
            current = current.next;
        }
        System.out.println(sum);
    }

    static void sumOfElementsUsingDouble() {
        Node head = new Node(10);
        head.next = new Node(20);
        head.prev = new Node(30);
        head.next.next = new Node(40);

        Node current = head;
        int sum = 0;
        while (current != null) {
            sum += current.data;
            current = current.next;
        }
        System.out.println(sum + head.prev.data);
    }

    public static void main(String[] args) {
        sumOfElementsUsingSingle();
        sumOfElementsUsingDouble();
    }
}
