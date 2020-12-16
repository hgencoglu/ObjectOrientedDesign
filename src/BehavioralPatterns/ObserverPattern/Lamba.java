package BehavioralPatterns.ObserverPattern;

public class Lamba implements AlarmListener {
    @Override
    public void alarm() {
        System.out.println("Lambalar açıldı");
    }
}
