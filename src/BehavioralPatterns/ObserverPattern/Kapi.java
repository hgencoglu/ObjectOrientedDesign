package BehavioralPatterns.ObserverPattern;

public class Kapi implements AlarmListener {
    @Override
    public void alarm() {
        System.out.println("Kapi açıldı");
    }
}
