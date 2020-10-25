package InterfaceSegregation;

public class Manager {
    Workable worker;
    public void setWorker(Workable w) { worker=w; }
    public void manage() { worker.work(); }
}
