package java.lang;

public class thread1 {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("astika");
        System.out.println("New thread name: " + Thread.currentThread().getName());
    }
}
