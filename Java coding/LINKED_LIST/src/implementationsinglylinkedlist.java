
public class implementationsinglylinkedlist {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static void inseratend(Node head, int val) {
        Node temp = new Node(val);
        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = temp;
        temp.next = null;
    }

    public static class Linkedlist {
        Node head = null;
        Node tail = null;

        void insertatend(int val) {
            Node temp = new Node(val);
            if (head == null) { // empty list
                head = temp;
            } else { // non empty list
                tail.next = temp;
            }
            tail = temp;
        }

        void insertatbegin(int val) {
            Node temp = new Node(val);
            if (head == null) { // empty list
                head = tail = temp;
            } else { // non empty list
                temp.next = head;
                head = temp;
            }

        }

        void deleteat(int pos) {
            if (pos == 1) {
                head = head.next;
                return;
            }
            Node temp = head;
            for (int i = 1; i <= pos - 2; i++) {
                temp = temp.next;
            }
            // temp.next.data=t;
            temp.next = temp.next.next;
            temp = tail;

        }

        void insertatanyposition(int val, int pos) {
            Node t = new Node(val);
            Node temp = head;
            if (pos == 0) {
                insertatbegin(val);
                return;
            } else if (pos == size()) {
                insertatend(val);
                return;

            }
            for (int i = 1; i <= pos - 2; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        int getatanyposition(int pos) {
            Node temp = head;
            for (int i = 1; i <= pos - 1; i++) {
                temp = temp.next;
            }
            return temp.data;

        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

        }

        int size() { // complexity O(n)
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }

            return count;
        }

    }

    public static void main(String[] args) {
        Linkedlist l1 = new Linkedlist();
        l1.insertatend(8);
        l1.insertatend(5);
        l1.insertatbegin(6);
        l1.insertatend(1234);
        l1.insertatend(67);
        l1.insertatend(54);
        l1.insertatanyposition(34, 4);
        l1.display();
        System.out.println();
        System.out.println(l1.getatanyposition(4));
        System.out.println(l1.size());
        l1.deleteat(7);
        l1.display();
        System.out.println();
        System.out.println(l1.size());

    }

}
