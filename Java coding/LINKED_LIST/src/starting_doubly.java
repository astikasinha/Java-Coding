public class starting_doubly {
    public static class node {
        int val;
        node next;
        node prev;

        node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        display(a);
        node newn = deleteatindex(a, 3);
        displayrandom(newn);
        displayreverse(e);
        displayrandom(d);
        node newhead = insertatbegin(a, 70);
        display(newhead);
        node newtail = insertatend(a, 90);
        displayrandom(newtail);
        node newg = insertatindex(a, 3, 60);
        displayrandom(newg);
        node newhe = deleteatbegin(newhead);
        display(newhe);
        node newd = deleteatend(newhead);
        displayrandom(newg);
        // node newn=deleteatindex(newhead,3);
        // displayrandom(newn);
    }

    private static void display(starting_doubly.node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private static void displayreverse(starting_doubly.node tail) {
        node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    private static void displayrandom(starting_doubly.node random) {
        node temp = random;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    private static starting_doubly.node insertatbegin(starting_doubly.node head, int data) {
        node t = new node(data);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }

    private static starting_doubly.node insertatend(starting_doubly.node head, int data) {
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        node t = new node(data);
        temp.next = t;
        return t.prev = temp;
    }

    private static starting_doubly.node insertatindex(starting_doubly.node head, int pos, int data) {
        node s = head;
        for (int i = 1; i <= pos - 3; i++) {
            s = s.next;
        }
        node r = s.next;
        node t = new node(data);
        s.next = t;
        t.prev = s;
        t.next = r;
        return r.prev = s;
    }

    private static starting_doubly.node deleteatbegin(starting_doubly.node head) {
        head = head.next;
        head.prev = null;
        return head;
    }

    private static starting_doubly.node deleteatend(starting_doubly.node head) {
        node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return temp;
    }

    private static starting_doubly.node deleteatindex(starting_doubly.node head, int pos) {
        node temp = head;
        for (int i = 0; i <= pos - 3; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
        return temp.next.prev;
    }
}
