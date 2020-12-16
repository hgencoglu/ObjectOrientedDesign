package BehavioralPatterns.MediatorPattern;

import java.util.Date;

public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(user.getIsim()+" "
                +message+ " " +new Date().toString());
    }

}
