package DependencyInversion.GoodExample;

public class SuperWorker implements IWorker {
    @Override
    public void work() {
        System.out.println("SuperWorker println!!");
    }
}
