//package queue;

import java.util.*;

public class learnqueue1 {
    public static void main(String[] args) {
        Queue<Integer> m = new LinkedList<>();
        System.out.println(m.isEmpty());
        m.add(1);
        m.add(2);
        m.add(3);
        m.add(4);
        m.add(5);
        Queue<Integer> helper = new LinkedList<>();
        while (m.size() > 0) {
            System.out.println(m.peek());
            helper.add(m.poll());
        }
        while (helper.size() > 0) {
            m.add(helper.poll());
        }
    }
}

/*
 * public static void main(String[] args) {
 * Queue<Integer> m=new LinkedList<>();
 * System.out.println(m.isEmpty());
 * m.add(1);
 * m.add(2);
 * m.add(3);
 * m.add(4);
 * m.add(5);
 * System.out.println(m.size());
 * System.out.println(m);
 * m.remove();
 * System.out.println(m);
 * m.poll();
 * System.out.println(m);
 * System.out.println(m.element());
 * System.out.println(m.peek());
 * }
 * }
 */
