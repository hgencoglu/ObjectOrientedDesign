package BehavioralPatterns.CommandDesignPattern;

public class LightOnCommand implements ICommand {
    Light light;

    @Override
    public void execute() {
        light.on();
    }

    public LightOnCommand(Light light){this.light=light;}
}
