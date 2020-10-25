package DependencyInversion.GoodExample;

public class Manager {
    IWorker worker;
    public void setWorker(IWorker w){worker=w;}
    public void manage(){worker.work();}

    public static void main(String args[]){
        //manage();
    }
}
