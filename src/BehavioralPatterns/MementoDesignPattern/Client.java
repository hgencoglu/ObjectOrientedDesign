package BehavioralPatterns.MementoDesignPattern;

public class Client {
    public static void main(String[] args) {
        Originater originater = new Originater();
        CareTaker careTaker = new CareTaker();

        originater.setState("Durum1");
        //careTaker.addList(originater.saveStateToMemento());
        originater.setState("Durum2");
        careTaker.addList(originater.saveStateToMemento());

        originater.setState("Durum3");
        careTaker.addList(originater.saveStateToMemento());

        originater.setState("Durum4");
        System.out.println("Anlık durum: "+originater.getState());

        originater.getStateFromMemento(careTaker.getMemento(0));
        System.out.println("İlk Durum: "+originater.getState());

        originater.getStateFromMemento(careTaker.getMemento(1));
        System.out.println("İkinci Durum: "+originater.getState());



    }
}
