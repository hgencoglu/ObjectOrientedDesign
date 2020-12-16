package BehavioralPatterns.MediatorPattern;

public class Client {
    public  static void main(String[] args){
        User user1 = new User();
        user1.setIsim("Hakan");
        User user2 = new User();
        user2.setIsim("Ahmet");

        user1.sendMessage("Merhaba");
        user2.sendMessage("Hayırlı Günler");
    }
}
