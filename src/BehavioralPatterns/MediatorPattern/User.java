package BehavioralPatterns.MediatorPattern;

public class User {
    private String isim;
    public String getIsim(){
        return
                isim;
    }

    public void setIsim(String isim){
        this.isim=isim;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }

}
