public class TarefaC implements Runnable {

    public void run(){
        System.out.println("task C");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("exe C executed");
    }
}

