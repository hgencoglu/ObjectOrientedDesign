package DependencyInversion.GoodExample;

public class Worker implements IWorker {

    @Override
    public void work() {
        System.out.println("Worker println");
    }
}
