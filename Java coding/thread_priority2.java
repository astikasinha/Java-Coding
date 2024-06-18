import java.lang.*;

public class thread_priority2 extends Thread {
    public void run() {
        System.out.println("child thread");
        System.out.println(this.getPriority());
    }

    public static void main(String[] args) {
        thread_priority2 t1 = new thread_priority2();
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);// main ki prioriy set ki toh isse tumahar child ka v priority set ho gya
        // Thread.currentThread().setPriority(6);
        t1.start();
        System.out.println(Thread.currentThread().getPriority());

    }
}
