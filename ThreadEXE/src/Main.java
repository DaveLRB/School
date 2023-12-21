
public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyRunnable());
            t1.start();

        Thread t2 = new MyThread();
        t2.start();

        }
    }
