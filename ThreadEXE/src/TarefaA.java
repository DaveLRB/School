public class TarefaA implements Runnable {

    public void run(){
        System.out.println("exe task A");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("exe A executed");
    }
}
