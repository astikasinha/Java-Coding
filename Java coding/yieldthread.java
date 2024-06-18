public class yieldthread extends Thread {
    public void run() {
        Thread.yield();
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + "-" + i);
        }
    }

    public static void main(String[] args) {
        yieldthread t = new yieldthread();
        t.start();
        // Thread.yield() if you want main method to stop and provide chance to other
        // threads for execution
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
