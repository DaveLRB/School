
public class Main {
    public static void main(String[] args) throws InterruptedException {

        ThreadGroup threadGroup = new ThreadGroup("BoingBoing");
        Thread padre = new Thread(threadGroup,"amen");
        Thread bispo = new Thread(threadGroup,"cruz");

        

        System.out.println(padre.getName());
        System.out.println(bispo.getName());
        padre.start();
        padre.join();
        bispo.start();
        bispo.join();

        System.out.println(threadGroup.activeCount());


        Thread tA = new Thread(new TarefaA());
        tA.start();
        tA.setPriority(1);
        //System.out.println(tA.isAlive());
        tA.setName("Boing");
        System.out.println(tA.getName());
        System.out.println(tA.getPriority());


        Thread tB = new Thread(new TarefaB());
        tB.start();
        //System.out.println(tB.isAlive());
        System.out.println(tB.getId());
        tB.stop();
        System.out.println(tB.getPriority());


        for (int i = 1; i < 5; i++) {
            Thread tbb = new Thread(new TarefaB());
            tbb.start();
            tbb.join();

        }

        Thread tC = new Thread(new TarefaC());
        tC.start();
    }
}
