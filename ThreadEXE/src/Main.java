
public class Main {
    public static void main(String[] args) {

        Thread tA = new Thread(new TarefaA());
            tA.start();

        Thread tB = new Thread(new TarefaB());
        tB.start();

        Thread tC = new Thread(new TarefaC());
        tC.start();

        }
    }
