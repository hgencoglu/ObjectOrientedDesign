package CreationalPatterns.SingletonPattern;

public class SingletonSinifi {
    private static SingletonSinifi ourInstance = new SingletonSinifi();

    public static SingletonSinifi getInstance() {
        return ourInstance;
    }

    private SingletonSinifi() {
    }
}
