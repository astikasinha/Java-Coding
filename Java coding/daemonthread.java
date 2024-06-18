public class daemonthread extends Thread {
    public void run() {
        // System.out.println(Thread.currentThread().isDaemon());
        System.out.println("child thread");
    }

    public static void main(String[] args) {
        System.out.println("main thread");
        daemonthread t = new daemonthread();
        t.setDaemon(true);
        t.start();
    }

}
