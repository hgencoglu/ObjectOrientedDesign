package BehavioralPatterns.TemplatePattern;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c = Class.forName(args[0]);
        Oyun o = (Oyun)c.newInstance();
        o.oyna();
    }
}
