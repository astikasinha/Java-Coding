/*public class interruptthread1 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);

            }
        } catch (Exception e) {
            System.out.println("Thread inmterrupted :- " + e);
        }
    }

    public static void main(String[] args) {
        interruptthread1 t = new interruptthread1();
        t.start();
        t.interrupt();
    }

}*/
public class interruptthread1 extends Thread {
    public void run() {
        System.out.println(Thread.interrupted());
        // true to false
        System.out.println(Thread.currentThread().isInterrupted());
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);

            }
        } catch (Exception e) {
            System.out.println("Thread inmterrupted :- " + e);
        }
    }

    public static void main(String[] args) {
        interruptthread1 t = new interruptthread1();
        t.start();
        t.interrupt();
    }

}
