//package java.lang;

/*
 * public class thread extends Thread {
 * public void run() {
 * System.out.println("thread task");
 * }
 * 
 * public static void main(String[] args) {
 * thread t = new thread();
 * t.start();
 * }
 * 
 * }
 */
/*
 * public class thread implements Runnable {
 * public void run() {
 * System.out.println("thread task 2");
 * }
 * 
 * public static void main(String[] args) {
 * thread t=new thread();
 * Thread th=new Thread(t);
 * th.start();
 * }
 * }
 */
public class thread extends Thread {
    public void run() {
        System.out.println("Thread task");
    }

    public static void main(String[] args) {
        thread thread1 = new thread();
        thread1.start();
    }
}
