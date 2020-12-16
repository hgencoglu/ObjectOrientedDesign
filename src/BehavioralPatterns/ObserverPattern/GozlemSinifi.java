package BehavioralPatterns.ObserverPattern;

public class GozlemSinifi extends kontrolListesi implements AlarmListener {
    @Override
    public void alarm() {
        System.out.println("Gözlenen sensörden gelen veriler");
        islemler();
    }

    protected void reaksiyon(){
        System.out.println("Kamerayı çalıştır");
    }
}
