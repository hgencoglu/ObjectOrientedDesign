package BehavioralPatterns.IteratorDesignPattern;

public class Client {
    public static void main(String[] args) {
        Repo repo = new Repo();
        for(Iterator iterator = repo.getIterator(); iterator.hashNext();){
            iterator.hashNext();
            String isim = (String)iterator.nextObject();
            System.out.println("İsim: "+isim);
        }
    }
}
