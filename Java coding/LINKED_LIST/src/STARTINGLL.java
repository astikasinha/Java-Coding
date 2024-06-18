public class STARTINGLL {
    public static class Node {
        int data;// data of node
        Node next;// addresss of next node

        Node(int data) {
            this.data = data;// constructor
        }
    }

    public static void display(Node head) {
        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }

    public static void displayreverse(Node head) {
        if (head == null) {
            return;
        }
        displayreverse(head.next);
        System.out.print(head.data + " ");
    }

    /**
     * @param args
     */
    public static void displayr(Node head) { // recursive linked list
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        displayr(head.next);

    }

    public static void main(String[] args) {
        Node x = new Node(5);
        System.out.println(x.data);
        Node y = new Node(6);
        Node a = new Node(8);
        Node p = new Node(9);
        Node q = new Node(2);
        Node r = new Node(1);
        x.next = y;
        System.out.println(x.next);// address of b
        System.out.println(x.next.data);// data of next element using previous elememnt.This way we can access all the
                                        // elements(simple process we will later use head and tail concept)
        displayr(x);
        displayreverse(x);

    }

}