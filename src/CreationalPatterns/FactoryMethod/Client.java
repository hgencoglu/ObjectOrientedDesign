package CreationalPatterns.FactoryMethod;

public class Client {
    public static void main( String arg[] )  {
        Factory factory = new ConcreteFactory();
        factory.anOperation();
    }

}
