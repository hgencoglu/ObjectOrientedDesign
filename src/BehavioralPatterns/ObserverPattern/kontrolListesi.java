package BehavioralPatterns.ObserverPattern;

public class kontrolListesi {

    public void islemler(){
        konum();
        izolasyon();
        tanimlama();
    }
    protected void konum(){
        System.out.println("sensör konumu");
    }
    protected void izolasyon(){
        System.out.println("izolasyon durumu");
    }

    protected void tanimlama(){
        System.out.println("sensör kimliği");
    }
}
