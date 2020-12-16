package BehavioralPatterns.ObserverPattern;

public class Client {
    public static void main(String[] args){

        SensorSistemi ss = new SensorSistemi();
        ss.register(new Kapi());
        ss.register(new Lamba());
        ss.register(new GozlemSinifi());
        ss.alarmCal();
    }
}
