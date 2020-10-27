package CreationalPatterns.SingletonPattern;

public class SingletonClass {
    private static SingletonClass singleton;

    private SingletonClass() {
        // constructor - private
    }

    public static SingletonClass getInstance() {
        if (singleton == null) {
            return singleton = new SingletonClass();
        }
        return singleton;
    }

    public void method(String s) {
        System.out.println(s);
    }
}
