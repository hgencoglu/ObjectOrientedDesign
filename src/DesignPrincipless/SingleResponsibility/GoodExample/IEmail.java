package DesignPrincipless.SingleResponsibility.GoodExample;

public interface IEmail {
    public void setSender(String sender);
    public void setReceiver(String receiver);
    public void setContent(IContent content);
}
