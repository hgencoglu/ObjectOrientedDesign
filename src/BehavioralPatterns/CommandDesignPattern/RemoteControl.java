package BehavioralPatterns.CommandDesignPattern;

public class RemoteControl {

    ICommand ic;
    public void setCommand(ICommand command){
        ic = command;
    }
    public void dugmeyeBasildi(){
        ic.execute();
    }
}
