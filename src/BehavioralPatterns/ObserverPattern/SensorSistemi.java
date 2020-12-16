package BehavioralPatterns.ObserverPattern;

import java.util.Enumeration;
import java.util.Vector;

public class SensorSistemi {
    private Vector listener = new Vector();
    public void register (AlarmListener alarmListener){
        listener.addElement(alarmListener);
    }
    public  void alarmCal(){
        for (Enumeration e = listener.elements(); e.hasMoreElements();){
            ((AlarmListener)e.nextElement()).alarm();
        }
    }
}
