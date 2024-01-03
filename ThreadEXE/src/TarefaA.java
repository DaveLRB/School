public class TarefaA extends Thread {

    public void run(){
        System.out.println("task A");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("exe A executed");
    }

    public void interrupt(){
        System.out.println("interrupted task A");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
