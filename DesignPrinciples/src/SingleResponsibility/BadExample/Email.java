package SingleResponsibility.BadExample;

public class Email implements IEmail {
    @Override
    public void setSender(String sender) {

        String sent=sender;
    }

    @Override
    public void setReceiver(String receiver) {
        String receive = receiver;
    }

    @Override
    public void setContent(String content) {
        String conten = content;
    }
}
