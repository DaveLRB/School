import com.sun.source.doctree.ThrowsTree;

public class TarefaB extends Thread {

    public void run(){
        System.out.println("task B");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("exe B executed");
    }
}

