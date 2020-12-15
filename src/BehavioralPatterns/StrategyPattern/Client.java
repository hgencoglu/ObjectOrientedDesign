package BehavioralPatterns.StrategyPattern;

public class Client {
    public static void main(String[] args){
        double deger1=3;
        double deger2=2.25;

        Baglam baglam = new Baglam(new Toplama());
        System.out.println("Toplamanın Sonucu: "+baglam.islemYapp(deger1,deger2));

    }
}
