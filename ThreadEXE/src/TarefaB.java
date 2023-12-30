public class TarefaB implements Runnable {

    public void run(){
        System.out.println("exe task B");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("exe B executed");
    }
}

