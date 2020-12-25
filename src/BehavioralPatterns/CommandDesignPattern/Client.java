package BehavioralPatterns.CommandDesignPattern;

public class Client {
    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();

        remoteControl.setCommand(new LightOnCommand(light));
        remoteControl.dugmeyeBasildi();
        remoteControl.setCommand(new LightOffCommand(light));
        remoteControl.dugmeyeBasildi();

    }


}
