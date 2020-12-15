package BehavioralPatterns.StrategyPattern;

public class Baglam {
    private IStrategy istrategy;
    public Baglam(IStrategy istrategy){
        this.istrategy=istrategy;
    }
    public double islemYapp(double sayi1, double sayi2){
        return istrategy.hesaplama(sayi1, sayi2);
    }
}
