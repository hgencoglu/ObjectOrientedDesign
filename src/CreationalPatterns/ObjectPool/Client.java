package CreationalPatterns.ObjectPool;

public class Client {
    public static void main(String args[])  {
        ObjectPoolDemo op=new ObjectPoolDemo();
        op.setUp();
        op.tearDown();
        op.testObjectPool();
    }
}
