/*public class threadpriority {
    class Test extends Thread {
        public void run() {
            System.out.println("child thread");
            System.out.println("child thread priority");
        }

    }

    public static void main(String[] args) {
        System.out.println("main thread old priority: " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("main thread new priority: " + Thread.currentThread().getPriority());
        Test t = new Test();
        t.start();

    }

}*/
public class threadpriority {
    class Test extends Thread {
        public void run() {
            System.out.println("child thread");
            System.out.println("child thread priority: " + this.getPriority());
        }
    }

    public static void main(String[] args) {
        System.out.println("main thread old priority: " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("main thread new priority: " + Thread.currentThread().getPriority());

        threadpriority outerInstance = new threadpriority();
        Test t = outerInstance.new Test();
        t.start();
    }
}
