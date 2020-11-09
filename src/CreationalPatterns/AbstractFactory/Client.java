package CreationalPatterns.AbstractFactory;
//https://www.geeksforgeeks.org/abstract-factory-pattern/
public class Client {
    public static void main(String[] args)
    {
        System.out.println(CarFactory.buildCar(CarType.MICRO));
        System.out.println(CarFactory.buildCar(CarType.MINI));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}
