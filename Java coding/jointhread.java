/*public class jointhread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("child thread: " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        jointhread t = new jointhread();
        t.start();
        t.join();
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(" main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}*/
public class jointhread extends Thread {
    static Thread maint;

    public void run() {
        try {
            maint.join();
            for (int i = 1; i <= 5; i++) {
                System.out.println("child thread: " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread maint = Thread.currentThread();
        jointhread t = new jointhread();
        t.start();
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(" main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
